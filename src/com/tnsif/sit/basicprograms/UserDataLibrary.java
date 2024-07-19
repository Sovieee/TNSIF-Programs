package com.tnsif.sit.basicprograms;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class UserDataLibrary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name = ");
		String name = sc.nextLine().trim();
		System.out.println();
		System.out.print("Enter UID = ");
		String uid = sc.nextLine().trim();
		System.out.println();
		System.out.print("Enter Highest Qualification = ");
		String qualification = sc.nextLine().trim();
		System.out.println();
		sc.close();
		
		 // Create XML string
		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<credentials>\n" +
                "    <StudentName>" + name + "</StudentName>\n" +
                "    <UID>" + uid + "</UID>\n" +
                "    <HighestQualification>" + qualification + "</HighestQualification>\n" +
                "</credentials>";

        // Write XML string to file
        try (FileWriter fileWriter = new FileWriter("Student_Details.xml")) {
            fileWriter.write(xmlString);
            System.out.println("User credentials successfully stored in Student_Details.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
	}

}
