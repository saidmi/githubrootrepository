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
 * @date 2018年1月30日
 * @description
 */
public class ClassUtils {

	/**
	 * @param class1
	 * @return
	 * @author uisftech
	 * @date 2018年1月30日
	 * @description 获取实现类列表
	 */
	public static List<Class> getAllClassByInterface(Class<Human> c) {
		List<Class> returnClassList = new ArrayList<Class>();

		// 如果不是接口则不做处理
		if (c.isInterface()) {
			// 获取包名
			String packageName = c.getPackage().getName();
			// 获取当前包及子包的所有类
			List<Class> allClass = null;
			try {
				allClass = getClasses(packageName);
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 判断是否是同一个接口
			for (int i = 0; i < allClass.size(); i++) {
				// 判断是否是一个接口
				if (c.isAssignableFrom(allClass.get(i))) {
					// 本身不加进去
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
	 * @date 2018年1月31日
	 * @description 从一个包中查找出所有的类，在jar包中不能查找
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
	 * @date 2018年1月31日
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
