package com.coupa.wordaddin;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SDAutomate {
	@Test
	public void runSikuli() throws FindFailed{
		Screen screen = new Screen();
		
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\Screenshot 2021-02-03 180356.PNG");
		screen.doubleClick();
		
		try {
			wait(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\maximise.PNG");
		screen.click();
		
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\document.PNG");
		screen.click();
		
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\coupa aad-in.PNG");
		screen.click();
		
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\coupa aad-in.PNG");
		screen.click();
		
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\username.PNG");
		screen.click();
		screen.type("admin");
		
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\password.PNG");
		screen.click();
		screen.type("changeme1");
		
		screen.find("C:\\Users\\MDS\\Desktop\\Sikuli\\sign-in.PNG");
		screen.click();
		
		
	}
	
	

}
