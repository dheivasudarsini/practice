package javaPrograms;

import java.util.Scanner;

public class AlternateCaseasUpperandLowerCases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string");
		
		String str = sc.nextLine();//nextline ---->>to identify the current position and index
		
		str = str.toLowerCase();
		
		char[] ch =str.toCharArray();
		
		for(int i=0; i<ch.length; i=i+2) {
			
			ch[i]= Character.toUpperCase(ch[i]);
		}
		
		System.out.println(new String(ch));

	}

}
