package org.jbehave.test.JbehaveTest;

import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.web.selenium.SeleniumSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunGmailStory extends SeleniumSteps {

	private WebDriver driver = null;
	private String username = null;
	private String password = null;

	RunGmailStory() {
		driver = new FirefoxDriver();
		// driver.get("https://mail.google.com/");
	}

	@Given("the user opens gmail")
	public void openBrowser() {
		driver.get("https://mail.google.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("the user enters username $username")
	public void inputUsername(@Named("username") String username) {
		this.username = username;
		driver.findElement(By.id("Email")).sendKeys(this.username);
	}

	@When("the user clicks Next button")
	public void clickNext() {
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("the user enters password $password")
	public void inputPassword(@Named("password") String password) {
		this.password = password;
		driver.findElement(By.id("Passwd")).sendKeys(this.password);
	}

	@When("the user clicks sigin button")
	public void clickSignIn() {
		driver.findElement(By.id("signIn")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Then("gmail should be displayed for user $username")
	public void thenValueShouldbe(@Named("username") String username) {
		this.username = username;
		if( driver.getPageSource().contains(this.username)) {
			System.out.println("Test success");
		}else {
			throw new RuntimeException("Oops something went wrong somewhere");
		}
	}

}
