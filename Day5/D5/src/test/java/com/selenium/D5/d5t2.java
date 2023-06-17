package com.selenium.D5;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d5t2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver obj=new EdgeDriver();
		obj.get("https://j2store.net/free/");
		String sq=obj.getCurrentUrl();
		String ss="https://j2store.net/free/";
		if(sq.equals(ss))
		{
			System.out.println("Correct URL");
		}
		else
		{
			System.out.println("invalid URL");
		}
		obj.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) obj;
		js.executeScript("window.scrollBy(0,1000)","");
		obj.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a")).click();
		String aa=obj.getCurrentUrl();
		String bb="https://j2store.net/free/index.php/shop?filter_catid=11";
		if(aa.equals(bb))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Invalid");
		}
			
	}

}
