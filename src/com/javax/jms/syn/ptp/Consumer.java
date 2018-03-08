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
        //从连接工厂里获取连接
        ConnectionFactory factory=new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,"tcp://localhost:61616");
        Connection connection=factory.createConnection();
        connection.start();
        
        //创建会话
        Session session=connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        //创建目的地,它是用来接收信息的:这里创建一个序列
        Destination destination=session.createQueue("MyQueue");
        //创建消费者
        MessageConsumer consumer=session.createConsumer(destination);
        Message message=consumer.receive();
        if(message!=null){
            TextMessage text=(TextMessage) message;
            System.out.println("接收到了："+text.getText());
        }
    }

}