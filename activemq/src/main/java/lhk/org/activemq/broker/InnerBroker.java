package lhk.org.activemq.broker;

import java.net.URI;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

/**
 * 嵌入式 activemq 实例
 * 
 * @author lihongkun
 *
 */
public class InnerBroker {

	public static void main(String[] args) {
		
		BrokerService broker;
		//启动broker实例 方法一
//		try{
//			broker = new BrokerService();
//			broker.setUseJmx(true);
//			broker.addConnector("tcp://localhost:61616");
//			broker.start();
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		try {
			//启动broker实例 方法二
//			String uri = "properties:broker.properties";
			String uri = "classpath*:/activemq/broker.properties";
			 broker = BrokerFactory.createBroker(new URI(uri));
			 broker.addConnector("tcp://localhost:61616");
			 broker.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
