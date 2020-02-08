package section_3;

public class CastingDemo {

	public static void main(String[] args) {
		byte minumValue = Byte.MAX_VALUE;
		byte newByteValue = (byte) (minumValue/2);
		System.out.println(newByteValue);
		
		short minimumShortValue = Short.MAX_VALUE;
		short newShortValue = (short) (minimumShortValue/2);
		System.out.println(newShortValue);

	}

}
