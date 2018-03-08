package com.javax.jms.syn.ptp;


import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer {
    public static void main(String[] args) throws JMSException{
        //�����ӹ������ȡ����
        ConnectionFactory factory=new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,"tcp://localhost:61616");
        Connection connection=factory.createConnection();
        connection.start();
        
        //�����Ự
        Session session=connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        //����Ŀ�ĵ�,��������������Ϣ��:���ﴴ��һ������
        Destination destination=session.createQueue("MyQueue");
        //����������
        MessageConsumer consumer=session.createConsumer(destination);
        Message message=consumer.receive();
        if(message!=null){
            TextMessage text=(TextMessage) message;
            System.out.println("���յ��ˣ�"+text.getText());
        }
    }

}