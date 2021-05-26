package com.example.afterjava8;

import java.io.File;
import java.util.Arrays;

public class Eg1_ListHiddenFilesJ8 {

	public static void main(String[] args) {
		File file = new File("D:\\WorkRelated\\open source projects source code\\ModernJavaInAction-master");
		File[] filesList = file.listFiles();
		System.out.println("Printing all the files in the folder");
		System.out.println(Arrays.toString(filesList));
		
		File[] hiddenFiles = file.listFiles(File::isHidden);
		System.out.println("Printing all the hidden files in the folder");
		System.out.println(Arrays.toString(hiddenFiles));

	}

}
