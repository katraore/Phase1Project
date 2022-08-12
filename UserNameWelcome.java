package com.LockedMe.project;

public class UserNameWelcome {
	
	public void DisplayOption()
	{
	String str="Kassoum Traore";
	System.out.println();
	System.out.println(" Welcome To Lockers Pvt. Ltd Application ");
	System.out.println(" The Developer is  @"+str );
	
	
	}
	public static void main(String[] arg) {
		UserNameWelcome od = new UserNameWelcome();
		od.DisplayOption();
		MenuOptions mo = new MenuOptions();
		mo.MenuOptions();
		FileHandling fh = new FileHandling();
		fh.FileHandling();
		
	}
}


