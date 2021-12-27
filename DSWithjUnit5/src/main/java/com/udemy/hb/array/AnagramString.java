package com.udemy.hb.array;
//Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!

//"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"

//For example: restful and fluster are anagrams.


public class AnagramString {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("restful", "fluster"));
		System.out.println(isAnagram("restful", "flusterss"));
		System.out.println(isAnagram("dog", "god"));

	}
	
	public static boolean isAnagram(String str1,String str2) {
		boolean isAna = true;
		if(str1.length()!=str2.length())
			return false;
		int ana[] = new int[122];
		for(int i=0;i<str1.length();i++) {
			ana[str1.charAt(i)]=1;
		}
		for(int i=0;i<str2.length();i++) {
			if(ana[str2.charAt(i)]!=1) {
				isAna = false;
			}
		}
		return isAna;
	}

}
