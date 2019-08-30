package org.test;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CusId {
	static WebDriver driver;
	@Given("user should launch browser and load url")
	public void user_should_launch_browser_and_load_url() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\Downloads\\eclipse-committers-oxygen-3a-win32\\eclipse\\venky\\Cucumber1\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	
	}
//scnerio task

	@When("user should give valid detail") 
	public void user_should_give_valid_detail() {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("venkatesh");
		driver.findElement(By.id("lname")).sendKeys("kumar");
		driver.findElement(By.id("email")).sendKeys("venkatesh@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("758134852");
		driver.findElement(By.name("submit")).click();
	}

	//scnerio outline
	
	@When("User Provide Vaild Details {string},{string},{string},{string},{string}")
	public void user_Provide_Vaild_Details(String fname, String lname, String email, String address, String phoneno) {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		 driver.findElement(By.xpath("//label[text()='Done']")).click();
		  driver.findElement(By.id("fname")).sendKeys(fname);
		  driver.findElement(By.id("lname")).sendKeys(lname);
		  driver.findElement(By.id("email")).sendKeys(email);
		  driver.findElement(By.name("addr")).sendKeys(address);
		  driver.findElement(By.id("telephoneno")).sendKeys(phoneno);
		  driver.findElement(By.name("submit")).click();
	
	}
	//one dimensional list
	
	@When("User Provide Vaild Details list")
	public void user_Provide_Vaild_Details_list(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		List<String> oned=dataTable.asList(String.class); 
		 driver.findElement(By.xpath("//label[text()='Done']")).click();
		  driver.findElement(By.id("fname")).sendKeys(oned.get(0));
		  driver.findElement(By.id("lname")).sendKeys(oned.get(1));
		  driver.findElement(By.id("email")).sendKeys(oned.get(2));
		  driver.findElement(By.name("addr")).sendKeys(oned.get(3));
		  driver.findElement(By.id("telephoneno")).sendKeys(oned.get(4));
		  driver.findElement(By.name("submit")).click();   
	}
	
	//one dimensional map
	
	@When("User Provide Vaild Details map")
	public void user_Provide_Vaild_Details_map(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		Map<String,String> one=dataTable.asMap(String.class, String.class) ;
		 driver.findElement(By.xpath("//label[text()='Done']")).click();
		  driver.findElement(By.id("fname")).sendKeys(one.get("fname"));
		  driver.findElement(By.id("lname")).sendKeys(one.get("lname"));
		  driver.findElement(By.id("email")).sendKeys(one.get("email"));
		  driver.findElement(By.name("addr")).sendKeys(one.get("address"));
		  driver.findElement(By.id("telephoneno")).sendKeys(one.get("phoneno"));
		  driver.findElement(By.name("submit")).click();
	}

	
	@Then("Display customer id")
	public void display_customer_id() {
	   Assert.assertTrue("verified",driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed() );
	}

	

}



