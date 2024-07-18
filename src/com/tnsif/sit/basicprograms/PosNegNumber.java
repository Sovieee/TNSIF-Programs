package com.tnsif.sit.basicprograms;
import java.util.*;
public class PosNegNumber 
{
	int num;
	public PosNegNumber(int userValue) {
		// TODO Auto-generated constructor stub
	}
	void calculate()
	{
		if (num > 0)
		{
			System.out.println("Positive Number!!");
		}
		else if (num < 0)
		{
			System.out.println("Negative Number!!");
		}
		else 
		{
			System.out.println("Number entered is a Zero!!");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int userValue = sc.nextInt();
		PosNegNumber obj= new PosNegNumber(userValue);
		obj.num=userValue;
		obj.calculate();
		sc.close();
	}

}
