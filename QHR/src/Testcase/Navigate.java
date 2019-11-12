package Testcase;

import Amazon.openBrowser;

public class Navigate extends openBrowser {
	public static void main(String args[]) {
		//opening a browser
		Browse("IE");
		//launch the application
		navigate();
		//this is for mobile text field
		//enterText("//input[@id='fkbx-text'] ", "6478606264");
	    //this is for password text field
		//enterText("//input[@id='pass']", "123456");
	    //this is for click Login button
		//clickButton("//*[@id='u_0_2']");
		//searchBar("//input[@id='q'] ");
		
		
		
		//enterText("//input[@id='q'] ", "6478606264");
		
		selectItem("//select[@id='year']", 6);

	}
}