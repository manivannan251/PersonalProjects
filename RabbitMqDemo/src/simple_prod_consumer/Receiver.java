package simple_prod_consumer;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Receiver {

	private static String queueName = "hello";
	
	public static void main(String[] args) throws IOException, TimeoutException {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection con = factory.newConnection();
		
		Channel channel = con.createChannel();
		channel.queueDeclare(queueName, false, false, false, null);
		System.out.println("Waiting for messages");
		
		DeliverCallback deliverCallback = (cTag,del) -> {
			String message = new String(del.getBody(),"UTF-8");
			System.out.println("Recived the message "+message);
		};
		
		channel.basicConsume(queueName, true, deliverCallback,cTage -> {});

	}

}
