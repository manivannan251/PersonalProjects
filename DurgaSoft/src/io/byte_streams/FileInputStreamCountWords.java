package io.byte_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamCountWords {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/resources/abc.txt");
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		String op = new String(b);
		String[] counts= op.split("\\s");
		int cou = 0;
		for(String count:counts) {
			if(count.equalsIgnoreCase("is"))
				cou++;
		}
		System.out.println("The number of times is occurs is "+cou);
		fis.close();
		

	}

}
