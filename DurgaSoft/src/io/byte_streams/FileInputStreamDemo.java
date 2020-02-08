package io.byte_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/resources/abc.txt");
		int size = fis.available();
		byte[] bytes = new byte[size];
		fis.read(bytes);
		String op = new String(bytes);
		System.out.println(op);
		fis.close();

	}

}
