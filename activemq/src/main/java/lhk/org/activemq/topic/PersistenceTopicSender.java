package lhk.org.activemq.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 持久化消息生产者
 * 
 * @author lihongkun
 *
 */
public class PersistenceTopicSender {
	
	public static final String URL = "tcp://localhost:61616";

	public static void main(String[] args) throws JMSException {

		//创建一个连接工厂
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL);
		//创建连接
		Connection connection = connectionFactory.createConnection();
		//创建会话
		Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		//创建目的地
		Topic topic = session.createTopic("my-topic");
		//创建消息发送者
		MessageProducer producer = session.createProducer(topic);
		//持久化消息
		producer.setDeliveryMode(DeliveryMode.PERSISTENT);
		
		/**
		 * 如果需要持久化，此处启动，必须在生产者设置确定需要持久化设置后，启动连接
		 */
		connection.start();

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
