package com.example.beforejava8;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Eg1_ListHiddenFiles {

	public static void main(String[] args) {
		File file = new File("D:\\WorkRelated\\open source projects source code\\ModernJavaInAction-master");
		File[] filesList = file.listFiles();
		System.out.println("Printing all the files in the folder");
		/*
		 * for( File fileList : filesList) { System.out.println(fileList.getName()); }
		 */
		System.out.println(Arrays.toString(filesList));
		
		
		
		//To display only hidden files
		File[] hiddenFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isHidden();
			}
		});
		
		System.out.println("Printing only hidden files in the folder");
		for( File hiddenFile : hiddenFiles) {
			System.out.println(hiddenFile.getName());
		}
 
	}

}
