package com.coupa.wordaddin;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.TestException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InstallAddinStepDefinitions {
	
	@Test
	public void addincoupa() throws TestException, MalformedURLException, InterruptedException {

		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Users\\MDS\\Downloads\\Winium.Desktop.Driver");

		option.setApplicationPath("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE");

		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);

		try {
			Thread.sleep(5000);

			driver.findElement(By.name("Blank document")).click();
			driver.findElement(By.name("Insert")).click();
			driver.findElement(By.name("My Add-ins")).click();
			driver.findElement(By.name("Admin Managed")).click();
			driver.findElement(By.name("Coupa CLMA\r\n" + "\r\n" + "Coupa")).click();
			driver.findElement(By.name("Add")).click();
			driver.findElement(By.name("Got it")).click();
			driver.findElement(By.name("Coupa CLMA")).click();
			System.out.println("add-in has been clicked");
			Thread.sleep(5000);

			WebElement mainWindow = driver.findElement(By.className("MsoCommandBar"));
			String newWindowHandle = mainWindow.getAttribute("ClassName");
			System.out.println(newWindowHandle);
			driver.switchTo().window(newWindowHandle);
			System.out.println("Inside pane");
			
			WebElement mainWindow1 = driver.findElement(By.className("MsoWorkPane"));
			String newWindowHandle1 = mainWindow1.getAttribute("ClassName");
			System.out.println(newWindowHandle1);
			driver.switchTo().window(newWindowHandle1);
			System.out.println("Inside pane1");
			
			WebElement mainWindow2 = driver.findElement(By.name("Coupa CLMA"));
			String newWindowHandle2 = mainWindow2.getAttribute("Name");
			System.out.println(newWindowHandle2);
			driver.switchTo().window(newWindowHandle2);
			System.out.println("Inside pane2");

			// WebElement mainWindow = driver.findElement(By.name("Coupa CLMA"));
			// WebElement pane1 = mainWindow.findElement(By.xpath("//*[@name='Coupa
			// CLMA'][@LocalizedControlType='pane']"));
			// String testElement = driver.findElement(By.name("Sign In")).getText();
			// System.out.println(testElement);

			// WebElement newWindow = driver.findElement(By.name("Coupa CLMA"));
			// System.out.println("new window");
			// String newWindowHandle = newWindow.getAttribute("Name");
			// System.out.println(newWindowHandle);
			//
			// WebElement testElement = newWindow
			// .findElement(By.xpath("/*[@AutomationId = 'loginButton' and @Name= 'Sign
			// In']"));
			// System.out.println(testElement);
			//
			// String lblValue = testElement.getAttribute("Name");
			// System.out.println(lblValue);

			// newWindow.findElement(By.id("loginButton")).getAttribute("AutomationId");

			// driver.findElementById("user_login").sendKeys("autosupport");
			// driver.findElementById("user_password").sendKeys("CoupaSupport1");
			// driver.findElement(By.id("login_button")).click();
			// driver.quit();
		} catch (Exception e) {
			throw new TestException(e);

		}
	}
}