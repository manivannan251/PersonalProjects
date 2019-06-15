package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerSingleton iOne = EagerSingleton.getInstance();
		EagerSingleton iTwo = null;
		Constructor[] constr = EagerSingleton.class.getDeclaredConstructors();
		for(Constructor con : constr) {
			con.setAccessible(true);
			try {
				iTwo = (EagerSingleton) con.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		System.out.println(iOne.hashCode());
		System.out.println(iTwo.hashCode());
		System.out.println(iOne==iTwo);

	}

}
