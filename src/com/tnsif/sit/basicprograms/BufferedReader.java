package com.tnsif.sit.basicprograms;
//import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReader 
{

	public BufferedReader(FileReader fr) 
	{
		// empty constructor
	}

	public static void main(String[] args) throws IOException 
	{
		FileReader fr= new FileReader("C:\\Users\\admin\\Desktop\\OUTLOOK PASSWORD.txt");
		BufferedReader br= new BufferedReader(fr);
		int i;
		while ((i=br.read())!=-1)
		{
			System.out.println((char)i);
		}
		//br.close();
		fr.close();
	}

	private int read() {
		
		return 0;
	}

}
