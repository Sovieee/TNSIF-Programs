package com.tnsif.sit.basicprograms;
import java.util.*;
public class VowelDetector 
{
	private char ch;


	public VowelDetector(char i) {}
		// TODO Auto-generated constructor stub
	

	void detect()
	{
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is a vowel!!");
			break;
		default:
				System.out.println("It is not a vowel!!");
				break;
		}
	}
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character = ");
		char i = sc.next().charAt(0);
		VowelDetector obj = new VowelDetector(i);
		obj.ch=i;
		obj.detect();
		sc.close();

	}

}
