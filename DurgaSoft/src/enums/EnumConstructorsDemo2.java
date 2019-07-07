package enums;
enum BeersWithPrice {
	KF(70),KO(80),RC(90),FO;
	int price;
	BeersWithPrice(int price) {
		this.price = price;
	}
	private BeersWithPrice() {
		// TODO Auto-generated constructor stub
		this.price = 65;
	}
	
	public int getPrice() {
		return price;
	}
}
public class EnumConstructorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeersWithPrice[] b = BeersWithPrice.values();
		for(BeersWithPrice b1:b) {
			System.out.println(b1+"..."+b1.getPrice());
		}

	}

}
