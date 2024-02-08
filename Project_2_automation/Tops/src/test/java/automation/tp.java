package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tp {
	public static void main(String[] args) throws InterruptedException {
		 String url= "https://careercenter.tops-int.com/";
		WebDriver driver= Chromedriver.getDriver(url);
		
		
		driver.findElement(By.id("mobile")).sendKeys("9428842525");
		driver.findElement(By.id("password")).sendKeys("9428842525");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.id("profileDropdown")).click();
		
		
		//Personal Details
	
//		driver.findElement(By.linkText("Personal Details")).click();
//		driver.findElement(By.className("selection")).click();
//		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("firstName")).sendKeys("Shivam");
//		driver.findElement(By.id("lastName")).sendKeys("Patel");
//		driver.findElement(By.id("email")).sendKeys("shivampatel863@gmail.com");
//		driver.findElement(By.id("linkedin_id")).sendKeys("www.linkdin.com/in/ankit9062");
//		driver.findElement(By.id("instagram_id")).sendKeys("shivamp_18");
//		Thread.sleep(2000);
//		driver.findElement(By.id("select2-gender-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
//		driver.findElement(By.id("select2-maritalStatus-container")).click();
//		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[2]")).click();
//		
		
//		driver.findElement(By.id("birthdate")).sendKeys("18111996");
//		driver.findElement(By.id("fatherName")).sendKeys("Kiritbhai");
//		driver.findElement(By.id("motherName")).sendKeys("Anjanaben");
//		driver.findElement(By.id("guardianName")).sendKeys("Pragjibhai");
//		Thread.sleep(2000);
//		driver.findElement(By.id("select2-religion-container")).click();
//		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[1]")).click();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement address= driver.findElement(By.id("select2-idType-container"));
//		js.executeScript("arguments[0].scrollIntoView();", address);
		
//		driver.findElement(By.id("select2-category-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
//		
//		driver.findElement(By.id("select2-disability-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
//
//		driver.findElement(By.id("select2-idType-container")).click();
//		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[1]")).click();
//		
//		driver.findElement(By.id("address")).sendKeys("Vaniyavad, Nadiad");
//		
//		driver.findElement(By.id("select2-educationLevel-container")).click();
//		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[4]")).click();
//		
//		driver.findElement(By.id("pincode")).sendKeys("387002");
		
//		driver.findElement(By.id("select2-country-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("select2-state-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[12]")).click();
//		Thread.sleep(1000);		
//		
//		driver.findElement(By.id("select2-district-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[23]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("select2-city-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[23]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("select2-trainingStatus-container")).click();
//		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[2]")).click();
//		driver.findElement(By.id("aadharFront")).sendKeys("C:\\Users\\shiva\\OneDrive\\Pictures\\2T7A3185.JPG");
		
		
//		Education Details
		
//		driver.findElement(By.linkText("Education Details")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("+ Add Education Details")).click();
//		Thread.sleep(2000);
//		WebElement Degree= driver.findElement(By.id("degree"));
//		Degree.sendKeys("12Th Pass");
//		Degree.click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("collegeName")).sendKeys("Knowledge High School");
//		driver.findElement(By.id("passingYear")).sendKeys("2014");
//		driver.findElement(By.id("result")).sendKeys("78");
//		WebElement add= driver.findElement(By.xpath("//div[@id='mobileAddBtnSection-courseEdu']/div/input"));
//		add.click();
		
		
//		Change Password
		
/*		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/div/ul/li[3]")).click();
		driver.findElement(By.id("current_password")).sendKeys("9909315241");
		Thread.sleep(2000);
		driver.findElement(By.id("eye-icon-current-password")).click();
		driver.findElement(By.id("new_password")).sendKeys("9428842525");
		driver.findElement(By.id("confirm_password")).sendKeys("9428842525");
		driver.findElement(By.id("changePasswordSubmit")).click();
	*/	
//		Logout
		
//		driver.findElement(By.linkText("Logout")).click();
		
		
		
//		Refer a friend
		
//		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[8]")).click();
//		driver.findElement(By.className("form-control")).sendKeys("Divya");
//		driver.findElement(By.id("referLastName")).sendKeys("Patel");
//		driver.findElement(By.id("referMobile")).sendKeys("9428842525");
//		driver.findElement(By.id("referCollegeName")).sendKeys("Dharmsinh Desai University");
//		driver.findElement(By.id("referEducation")).sendKeys("ITI");
//		driver.findElement(By.id("referFriendSubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
