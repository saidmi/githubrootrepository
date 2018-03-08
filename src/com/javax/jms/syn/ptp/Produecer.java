package com.javax.jms.syn.ptp;

/**
 * @author 		uisftech
 * @date   		2018年2月6日
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
		// 从连接工厂里获取连接
		ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD, "tcp://localhost:61616");
		Connection connection = factory.createConnection();
		connection.start();

		// 创建会话
		Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
		// 创建目的地,它是用来接收信息的:这里创建一个序列
		Destination destination = session.createQueue("MyQueue");
		// 创建生产者
		MessageProducer producer = session.createProducer(destination);
		// 创建一个发送消息
		Message message = session.createTextMessage("你好啊！！！|");
		// 发送
		producer.send(message);

		// 这里可别忘了，提交会话
		session.commit();
		System.out.println("信息发送成功");
	}
}