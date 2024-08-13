package com.tnsif.sit.basicprograms;
import java.util.*;

public class FinalStudentSportDataSheet{
public static void main(String[] args) {

String choice = "";
Scanner input = new Scanner(System.in);
int sum = 0;
long product = 0;
double average = 0;
int count = 0;

choice = input.nextLine();	
while (choice != "q")
{
  int a = input.nextInt();
  sum +=a;
  product *= a;
  count++;
  
}

average = sum / count;

System.out.println ("Product is: "+ product);
System.out.println ("Average is: "+ average);
input.close();
}
}