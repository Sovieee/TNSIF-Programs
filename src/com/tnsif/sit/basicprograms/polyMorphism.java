package com.tnsif.sit.basicprograms;

public class polyMorphism {
	public class DemoMethodOverloading
	{
		public void add (int x, int y)
		{
			System.out.println(x+y);
		}
	}
	
	public static void add (int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	
	public void add (float x, float y)
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
			DemoMethodOverloading obj = new DemoMethodOverloading ();
			obj.add(02, 04);
			DemoMethodOverloading.add (34, 43, 44);
			
	}

}
