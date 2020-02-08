import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class TestProperty {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		System.setProperty("javax.net.ssl.keyStorePassword", "Password01" );
		Set<Object> keys = p.keySet();
		Object[] keyA = keys.toArray();
		for(Object k:keyA) {
			String val = (String) k;
			System.out.println("Key :"+val+", Value :"+p.getProperty(val));
		}
		String hello = System.getProperty("Hello");
		System.out.println(hello);

	}
	
	

}
