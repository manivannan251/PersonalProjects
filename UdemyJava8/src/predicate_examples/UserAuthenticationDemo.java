package predicate_examples;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	private String userName;
	
	private String pwd;	

	public User(String userName, String pwd) {
		
		this.userName = userName;
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
public class UserAuthenticationDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter username");
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		User user = new User(userName, pwd);
		Predicate<User> isAuth = u->u.getUserName().equals("root")&&u.getPwd().equals("root123");
		if(isAuth.test(user))
			System.out.println("Welcome "+user.getUserName());
		else
			System.out.println("You are not allowed");

	}

}
