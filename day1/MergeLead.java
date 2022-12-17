package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead extends BaseClass{
@Test
	public void runMergeLead() throws InterruptedException {
		
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeAccountsForm']")).click();
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> lstwindow=new ArrayList<String>(windowHandles);
	driver.switchTo().window(lstwindow.get(1));
	
	driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
	//System.out.println(driver.getTitle());
	driver.switchTo().window(lstwindow.get(0));
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String>lst2=new ArrayList<String>(windowHandles2);
	driver.switchTo().window(lst2.get(1));
	driver.findElement(By.linkText("Hema")).click();
	driver.switchTo().window(lst2.get(0));
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
    System.out.println(driver.getTitle());
     
		
		
	}
}






