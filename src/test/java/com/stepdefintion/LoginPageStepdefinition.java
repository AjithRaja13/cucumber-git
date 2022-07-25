package com.stepdefintion;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepdefinition {

	WebDriver driver;
	@Given("User id on the Adaction hotel page")
	public void a() {
		
//		Browser lounch
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("User should perform login {string} and {string}")
	public void b(String name, String pass) {
		
//		login
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(name);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(pass);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

	@Then("User should verify after login {string}")
	public void c(String name) {
//		verify value
		
		WebElement txtprint =driver.findElement(By.id("username_show"));
		String attribute = txtprint.getAttribute("value");
		Assert.assertEquals("verify user name ", "Hello ajith1212!", attribute);
//		String attribute = txtwelcome.getAttribute("value");
//		Assert.assertEquals("verify", "Book A Hotel", attribute);
	}

	@When("User should perform search hotels {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void d(String location, String hotels, String roomtype, String numberofrooms, String checkindate, String  checkinout, String adultsperroom, String childrenperroom) {

//		Search Hotels
		
		WebElement l = driver.findElement(By.id("location"));
		l.sendKeys(location);
		WebElement h = driver.findElement(By.id("hotels"));
		h.sendKeys("hotels");
		WebElement r = driver.findElement(By.id("room_type"));
		r.sendKeys("roomtype");
		WebElement rn = driver.findElement(By.id("room_nos"));
		rn.sendKeys("numberofrooms");
		WebElement di = driver.findElement(By.id("datepick_in"));
		di.sendKeys("checkindate");
		WebElement dio = driver.findElement(By.id("datepick_out"));
		dio.sendKeys("checkinout");
		WebElement ad = driver.findElement(By.id("adult_room"));
		ad.sendKeys("child_room");
		WebElement cr = driver.findElement(By.id("child_room"));
		cr.sendKeys("childrenperroom");
		WebElement s = driver.findElement(By.id("Submit"));
		s.click();
	}

	@Then("User should perform select hotel")
	public void e() {

//		select hotel
		
		WebElement btnck = driver.findElement(By.id("radiobutton_1"));
		btnck.click();
		WebElement btnc = driver.findElement(By.id("continue"));
		btnc.click();
	}

	@When("User should peform book a hotel {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void f(String firstname, String lastname, String billingaddress, String cnu,
			String creditcardtype,String expirymonth, String expiryyear, String cvv) {

//		book a hotel
		
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys(firstname);
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys(lastname);
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys(billingaddress);
		WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardno.sendKeys(cnu);
		WebElement cctype = driver.findElement(By.id("cc_type"));
		cctype.sendKeys(creditcardtype);
		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		ccmonth.sendKeys(expirymonth);
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		ccyear.sendKeys(expiryyear);
		WebElement cccvv = driver.findElement(By.id("cc_cvv"));
		cccvv.sendKeys(cvv);
		WebElement btnbook = driver.findElement(By.id("book_now"));
		btnbook.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement orderid = driver.findElement(By.id("order_no"));
		String attribute = orderid.getAttribute("value");
		System.out.println("order_no:"+attribute);
		
		driver.quit();
	}

}
