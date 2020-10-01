import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Complaint2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://staging.twohootsapp.com/");
		
		//Guest user click
			
		driver.findElement(By.xpath("//a[contains(text(),'Use as our guest')]")).click();
		
		//others click
		
		driver.findElement(By.xpath("//p[contains(text(),'Other')]")).click();
		
		//complaint page
		
		driver.findElement(By.xpath("//input[@id='item_name']")).sendKeys("Refrigerator");
		driver.findElement(By.xpath("//input[@id='issue_description']")).sendKeys("Freezer is failing to stay cold enough");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

		//file1 upload
		
		Robot robot=new Robot();
		String filepath=System.getProperty("user.dir")+ "C:\\Users\\Amalraj\\Desktop\\fridge1.jpg";
		driver.findElement(By.xpath("//span[contains(text(),'CHOOSE FILE')]")).click();
        Thread.sleep(6000);
        StringSelection stringsel=new StringSelection("C:\\Users\\Amalraj\\Desktop\\fridge1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		//file2 upload
		String filepath2=System.getProperty("user.dir")+ "C:\\Users\\Amalraj\\Desktop\\fridge2.jpg";
		driver.findElement(By.xpath("//span[contains(text(),'CHOOSE FILE')]")).click();
        Thread.sleep(6000);
        StringSelection stringsel2=new StringSelection("C:\\Users\\Amalraj\\Desktop\\fridge2.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel2, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
				
		driver.findElement(By.xpath("//textarea[@id='more-details-field']")).sendKeys("I purchased a fridge in 2019, it is not working now"
				+" The company says it won't refund the amount");
		driver.findElement(By.xpath("//button[@id='btn-next']")).click();
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Very frustrated')]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
		
		//location
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("67 View Street");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Woollahra");
		robot.setAutoDelay(1000);
        js.executeScript("window.scrollBy(0,1000)");
        Select s=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        s.selectByValue("2");
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("2025");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//body")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submit-btn']")).click(); 
		
        //company details
        driver.findElement(By.cssSelector("input.form-control.select-organisation")).sendKeys("ABC Fridges");
        driver.findElement(By.xpath("//input[@placeholder='Enter Organisation Email']")).sendKeys("fridges@google.com");
        driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block.organisation-button")).click();
        
        //impact
        Select s1=new Select(driver.findElement(By.xpath("//select[@id='impact-field']")));
        s1.selectByValue("8");
        driver.findElement(By.xpath("//input[@name='other-impact']")).sendKeys("Lost icecreams");
        Select s2=new Select(driver.findElement(By.xpath("//select[@id='outcome-field1']")));
        s2.selectByValue("10");
        driver.findElement(By.xpath("//input[@id='other-outcome1']")).sendKeys("Replacement Ice Creams");
        Select s3=new Select(driver.findElement(By.xpath("//select[@id='outcome-field2']")));
        s3.selectByValue("2");
        Select s4=new Select(driver.findElement(By.xpath("//select[@id='outcome-field3']")));
        s4.selectByValue("8");
        Select s5=new Select(driver.findElement(By.xpath("//select[@id='contactattempts-field']")));
        s5.selectByValue("1");
        Select s6=new Select(driver.findElement(By.xpath("//select[@id='experience-field']")));
        s6.selectByValue("4");
        driver.findElement(By.xpath("//input[@id='referencenumber-field']")).sendKeys("titit");
        driver.findElement(By.xpath("//input[@id='accountnumber-field']")).sendKeys("12345");
        js.executeScript("window.scrollBy(0,500)");        
        //file upload 3
        String filepath3=System.getProperty("user.dir")+ "C:\\Users\\Amalraj\\Desktop\\fridge3.jpeg";
		driver.findElement(By.xpath("//span[contains(text(),'CHOOSE FILE')]")).click();
        Thread.sleep(6000);
        StringSelection stringsel3=new StringSelection("C:\\Users\\Amalraj\\Desktop\\fridge3.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel3, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//textarea[@id='comments-field']")).sendKeys("I really love ice creams. Hence i am really upset about it");
		driver.findElement(By.xpath("//button[@id='btn-next']")).click();
		Thread.sleep(3000);
		
		//Response
		driver.findElement(By.xpath("//label[contains(text(),'Yes and')]")).click();
		Select s7=new Select(driver.findElement(By.xpath("//select[@id='contact-title']")));
		s7.selectByValue("Mrs");
		driver.findElement(By.xpath("//input[@id='contact-firstname']")).sendKeys("Mumma");
		driver.findElement(By.xpath("//input[@id='contact-lastname']")).sendKeys("Chook");
		driver.findElement(By.xpath("//input[@id='contact-email']")).sendKeys("mummachook@gmail.com");
		Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");        
		
		driver.findElement(By.xpath("//p[contains(text(),'I would like to share my experience with others to')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'I would like to receive news and offers from Handl')]")).click();
		driver.findElement(By.xpath("//div[@class='container pagenav-container']//button[@id='submit-step']")).click();

		//Login
		driver.findElement(By.xpath("//input[@id='register-email']")).sendKeys("mummachook@gmail.com");
		driver.findElement(By.xpath("//input[@id='register-password']")).sendKeys("mummahooks");
		driver.findElement(By.xpath("//button[@id='LoginButton']")).click();		
		
        	
	
	}

}
