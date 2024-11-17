package lhk.org.activemq.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 持久化消息订阅者
 * @author lihongkun
 *
 */
public class PersistenceTopicReceiver {
	
	public static final String URL = "tcp://localhost:61616";

	public static void main(String[] args) throws JMSException {
		
		//创建一个连接工厂
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);
		
		//创建连接
		Connection connection = connectionFactory.createConnection();
		
		connection.setClientID("cc1"); //当前人对top
		
		/**
		 *  创建会话
		 *  Boolean.TRUE 开启事务
		 *  Session.AUTO_ACKNOWLEDGE  自动确认,签收（类似快递签收），当commit时，会签收
		 */
		Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		
		
		//创建目的地
		Topic topic = session.createTopic("my-topic");
		
		TopicSubscriber ts = session.createDurableSubscriber(topic, "T1");
		
		//启动连接
		connection.start();
		
		TextMessage message = (TextMessage) ts.receive();
		
		String msgId = message.getJMSMessageID();
		System.out.println(msgId);
		String corId = message.getJMSCorrelationID();
		System.out.println(corId);
		System.out.println(message.getText());
		
		session.commit(); //提交内容
		session.close();  //关闭会话
		connection.close(); //关闭连接
	}
}
