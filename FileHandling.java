package com.LockedMe.project;

import java.io.File;
import java.util.Scanner;

public class FileHandling {
	public void FileHandling() {
		int input = 0;
		do
		{
			System.out.println("\n1. Add File \n2. Search File \n3. Delete File \n4. Go Back to Main Menu  \n5. Exit \n");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\n Select your option from the above File  Menu:");
			input = sc2.nextInt();
			switch (input)
			{
			// Creating file Menu options
			case 1:
				CreateFile();
				break;
			case 2:
				SearchFile(null);
				break;
			case 3:
				DeleteFile();
				break;
			case 4:
				MenuOptions mo = new MenuOptions();
				mo.MenuOptions();
			
			default:
				System.out.println("Thanks for viting. we hope to see you again");
				
			}// End switch
		
			
		} while (input != 0);
		
	}
	public void CreateFile() {
		// Adding file
		
	
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Type the file name ");
		String filename = sc3.nextLine().toLowerCase();
		File file=new File(filename);
		if(file != null)
	
		{
		
		try {
		
			boolean flag = file.createNewFile();
			if (flag) {
		
				System.out.println("File Name:  " + file.getName() + " has been created successfully");
				System.out.println("File location is "+file.getAbsolutePath());
				
			}
			else {
				System.out.println("File already ecxist");
			}
		}
		catch(Exception e) {
			System.out.println("Exception Occurred" + e.getClass());
			System.out.println("Exception Occurred" + e.getMessage());
			
		}
		
		}
	}
	
	
	public void SearchFile(String[] pathnames) {
		// Searching file
		System.out.println("Please type the name of the file you want to search: ");
		Scanner sc4 = new Scanner(System.in);
		String filePath = null;
		String input1 = sc4.next();
		input1 = new String(input1.toLowerCase());

			File file = new File(input1);
			if(file.exists()) {
				System.out.println("The search file name is: " + file.getName() + " file exists ");
				System.out.println("The search file is located at : " + file.getAbsolutePath());
			}else {
				System.out.println("File does not exists");
			}
	}

	public void DeleteFile() {
		// Deleting file
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Please type the name of the file you want to delete: ");

		
		String input2 = sc5.next();
		String filePath = null;
		File file = new File(input2);

		try {

			if (file.delete()) {
				System.out.println(file.getName() + " has been deleted successfully");

			} else {
				System.out.println(" File not available");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	

		
}


