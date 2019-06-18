package enums;
public class EnumValuesAndOrdDemo {

	public static void main(String[] args) {
		Beer[] beers = Beer.values();
		for(Beer beer : beers) {
			System.out.println(beer+"..."+beer.ordinal());
		}

	}

}
