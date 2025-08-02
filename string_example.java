package myproject;

public class string_example {
	public static void main(String args[]) {
		String str="hello this is java class";
		String str1="hello";
		String str2="HELLO";
		String str3="hi how are you";
		String str4="hello";
		String str5="1234";
		String str6="java234";
		String str7="";
		String str9="  hello java  ";
	
		System.out.println(str3.length());
		System.out.println(str2.toUpperCase());
		System.out.println(str3.toLowerCase());
		System.out.println(str3.charAt(9));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str5));
		System.out.println(str1.contains("ell"));
		System.out.println(str1.contentEquals(str4));
		System.out.println(str1.endsWith("y"));
		System.out.println(str1.equals(str4));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.matches("[a-zA-Z]+"));
		System.out.println(str5.matches("\\d+"));
		System.out.println(str7.isEmpty());
		System.out.println(String.join("|",str1,str2,str3));
		System.out.println(String.join(":", "hello", "hi","how"));
		System.out.println(str1.lastIndexOf("l"));
		System.out.println(str1.replace('l','p'));
		System.out.println(str1. replaceFirst("hel", "ar"));
		String str10="hi;how;are;you";
		String str8[]=str3.split(" ");
		for(String i:str8)
		{
			System.out.println(i);
		}
		System.out.println(str6.startsWith("J"));
		System.out.println(str.subSequence(5,13));
	
		
		
		
				
		
	
		
	}

}
