package com.LockedMe.project;

import java.io.*;
import java.util.Scanner;


public class MenuOptions {
	public void MenuOptions()
	{
	
	    System.out.println("\n Option Menu ");
	    System.out.printf("\n1. Retrive Files in the Folder  \n2. File Options  \n0. Close \n");
	    int inputa = -1;
		do
		{
Scanner sc1=new Scanner(System.in);
System.out.println("\n Enter your option from the above Option  Menu: ");
	inputa = sc1.nextInt();
switch(inputa)
{
case 1:
//Arranging files in assending order
Scanner sc2=new Scanner(System.in);
System.out.println("Type The Your Directory Name ");
String Dir=sc2.nextLine();
Dir.toLowerCase();
ListFiles(Dir);

break;
case 2:
FileHandling fh = new FileHandling();
fh.FileHandling();
break;
default:

 System.out.println("Thanks For Visiting. We Hope To See You Again");
		;	
}

}while(inputa!=0);
}
	public void MainMenu()
	{
		
	}
	static void ListFiles(String Dir1)
	{
	File dir = new File(Dir1);
	        File[] files = dir.listFiles();

	        if (files != null && files.length > 0) {
	            for (File file : files) {
	                // Check if the file is a directory
	                if (file.isDirectory()) {
	                    System.out.println(file.getAbsolutePath());
	                } else {
	                    // We can use .length() to get the file size
	                    System.out.println(file.getName() + " (size in bytes: " + file.length()+")");
	                }
	            }
	}
	else
	{
	System.out.println("The Directory is not found");
	}
	}
	
}
