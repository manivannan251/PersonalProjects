package enums;
enum Color {
	BLUE,RED,GREEN;
	public void info() {
		System.out.println("Dangerous color");
	}
}
public class EnumCommonMethodDemo {

	public static void main(String[] args) {
		Color[] color = Color.values();
		for(Color c1:color) {
			c1.info();
		}

	}

}
