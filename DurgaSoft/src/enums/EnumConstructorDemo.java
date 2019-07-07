package enums;
enum Beers{ 
	KF,KC,FO,RC;
	
	Beers() {
		System.out.println("constructors");
	}
}
public class EnumConstructorDemo {

	public static void main(String[] args) {
		Beers beers = Beers.FO;
		System.out.println("Hello");

	}

}
