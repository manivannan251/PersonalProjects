package enums;
enum ColorWithSpecificMethods{
	BLUE,RED {
		public void info() {
			System.out.println("Dangerous color");
		}
	},GREEN;
	
	public void info() {
		System.out.println("Universal color");
	}
}
public class EnumSpecificMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorWithSpecificMethods[] color = ColorWithSpecificMethods.values();
		for(ColorWithSpecificMethods c1:color)
			c1.info();
	}

}
