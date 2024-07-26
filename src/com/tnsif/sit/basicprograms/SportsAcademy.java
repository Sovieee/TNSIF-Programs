package com.tnsif.sit.basicprograms;

public class SportsAcademy extends Student 
{
	public float height;
	public float weight;
	public String endurance;
	
	public SportsAcademy(String SID, String name, String branch, long contactno, float height, float weight, String endurance) 
	{
		super(SID, name, branch, contactno);
		this.height=height;
		this.weight=weight;
		this.endurance=endurance;
		
	}
	@Override
	public String toString()
	{
		return "Sports Department : \nSID = "+ SID +"\nName = " + name + "\nBranch = " + branch + "\nContact Info = " + contactno + "\nHeight = " + height + "\nWeight = " + weight + "\nEndurance Level = " + endurance ;
	}
	
	
}
/**hello*/