package com.design.pattern.facade;

/**
 * @author uisftech ���ԣ��ͻ�ͨ������������ϵͳ����
 */
public class FacadeTest {
	public static void main(String[] args) {
		FacadeClass facade = new FacadeClass();
		/**
		 * һ�������Ϳ���������е�׼������
		 */
		facade.open();
	}
}
/*
 * �ŵ㣺
 * 
 * �Կͻ�������ϵͳ����������˿ͻ������Ķ�����Ŀ��ʹ����ϵͳʹ�������������ס�ͨ����������ģʽ���ͻ����뽫��úܼ򵥣���֮�����Ķ���Ҳ���١�
 * ʵ������ϵͳ��ͻ�֮�������Ϲ�ϵ����ʹ����ϵͳ������仯����Ӱ�쵽�������Ŀͻ��ֻ࣬��Ҫ��������༴�ɡ�
 * �����˴�������ϵͳ�еı��������ԣ�������ϵͳ�ڲ�ͬƽ̨֮�����ֲ���̣���Ϊ����һ����ϵͳһ�㲻��Ҫ����������������ϵͳ��
 * һ����ϵͳ���޸Ķ�������ϵͳû���κ�Ӱ�죬������ϵͳ�ڲ��仯Ҳ����Ӱ�쵽��۶��� ֻ���ṩ��һ��������ϵͳ��ͳһ��ڣ�����Ӱ���û�ֱ��ʹ����ϵͳ�ࡣ
 * ȱ�㣺
 * 
 * ���ܺܺõ����ƿͻ�ʹ����ϵͳ�࣬����Կͻ�������ϵͳ����̫�������������˿ɱ��Ժ�����ԡ�
 * �ڲ������������������£������µ���ϵͳ������Ҫ�޸�������ͻ��˵�Դ���룬Υ���ˡ�����ԭ��ocp��
 */