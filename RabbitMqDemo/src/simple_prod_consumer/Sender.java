package simple_prod_consumer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Sender {

	private static String queue = "hello";
	
	public static void main(String[] args) {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		try(Connection con = factory.newConnection();Channel channel
		 = con.createChannel()) {
			
			channel.queueDeclare(queue, false, false, false, null);
			String message = "Hello World message 2";
			channel.basicPublish("", queue, null, message.getBytes());
			System.out.println("Sent the message "+message);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
