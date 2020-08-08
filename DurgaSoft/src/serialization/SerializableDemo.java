package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int i=10;
	int j=20;
}
public class SerializableDemo {

	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(fos);
		System.out.println("Serilization ended");
		System.out.println("Deserilization started");
		

	}

}
