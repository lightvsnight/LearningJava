package lhk.org.activemq.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 非持久化 订阅消息 发送者(即生产者)
 * @author lihongkun
 *
 */
public class NoPersistenceTopicSender {
	
	public static final String URL = "tcp://localhost:61616";

	public static void main(String[] args) throws JMSException {

		//创建一个连接工厂
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);

		//创建连接
		Connection connection = connectionFactory.createConnection();

		//启动连接
		connection.start();

		//创建会话
		Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);

		//创建目的地
		Topic destination = session.createTopic("my-topic");

		//创建消息发送者
		MessageProducer producer = session.createProducer(destination);

		// 创建消息
		String msgStr = "fasdfasdfasfdasdfasdfasdfasdfasdf";
		TextMessage message = session.createTextMessage(msgStr);
		message.setJMSMessageID("111111");
		message.setJMSCorrelationID("xiaoxiao");
		message.setJMSRedelivered(true);
		producer.send(message);

		session.commit(); // 提交内容
		session.close(); // 关闭会话
		connection.close(); // 关闭连接
	}
}
