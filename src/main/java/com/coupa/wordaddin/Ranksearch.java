package com.coupa.wordaddin;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ranksearch {

	public static void main(String[] args) throws URISyntaxException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MDS\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("food");
		element.sendKeys(Keys.RETURN);

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];

		// Count the total Link list on Web Page
		int linkCount = linkElements.size();
		System.out.println("Total Number of link count on webpage = " + linkCount);

		int i = 0;

		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		    System.out.println(i + " " + e.getAttribute("href"));		}
		driver.quit();
	}
}
