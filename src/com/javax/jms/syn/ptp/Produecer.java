package com.javax.jms.syn.ptp;

/**
 * @author 		uisftech
 * @date   		2018��2��6��
 * @description 
 */

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Produecer {
	public static void main(String[] args) throws JMSException {
		// �����ӹ������ȡ����
		ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD, "tcp://localhost:61616");
		Connection connection = factory.createConnection();
		connection.start();

		// �����Ự
		Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
		// ����Ŀ�ĵ�,��������������Ϣ��:���ﴴ��һ������
		Destination destination = session.createQueue("MyQueue");
		// ����������
		MessageProducer producer = session.createProducer(destination);
		// ����һ��������Ϣ
		Message message = session.createTextMessage("��ð�������|");
		// ����
		producer.send(message);

		// ����ɱ����ˣ��ύ�Ự
		session.commit();
		System.out.println("��Ϣ���ͳɹ�");
	}
}