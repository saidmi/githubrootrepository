package com.design.pattern.factoryMethod;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

/**
 * @author uisftech
 * @date 2018��1��30��
 * @description
 */
public class ClassUtils {

	/**
	 * @param class1
	 * @return
	 * @author uisftech
	 * @date 2018��1��30��
	 * @description ��ȡʵ�����б�
	 */
	public static List<Class> getAllClassByInterface(Class<Human> c) {
		List<Class> returnClassList = new ArrayList<Class>();

		// ������ǽӿ���������
		if (c.isInterface()) {
			// ��ȡ����
			String packageName = c.getPackage().getName();
			// ��ȡ��ǰ�����Ӱ���������
			List<Class> allClass = null;
			try {
				allClass = getClasses(packageName);
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// �ж��Ƿ���ͬһ���ӿ�
			for (int i = 0; i < allClass.size(); i++) {
				// �ж��Ƿ���һ���ӿ�
				if (c.isAssignableFrom(allClass.get(i))) {
					// �����ӽ�ȥ
					if (!c.equals(allClass.get(i))) {
						returnClassList.add(allClass.get(i));
					}

				}
			}
		}
		return returnClassList;
	}

	/**
	 * @param packageName
	 * @return List<Class>
	 * @author uisftech
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 * @date 2018��1��31��
	 * @description ��һ�����в��ҳ����е��࣬��jar���в��ܲ���
	 */
	private static List<Class> getClasses(String packageName) throws IOException, ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		ArrayList<Class> classes = new ArrayList<Class>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return classes;
	}

	/**
	 * @param directory
	 * @param packageName
	 * @return
	 * @author uisftech
	 * @throws ClassNotFoundException 
	 * @date 2018��1��31��
	 * @description
	 */
	private static Collection<? extends Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
		List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(
						Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
			}
		}
		return classes;
	}

}
