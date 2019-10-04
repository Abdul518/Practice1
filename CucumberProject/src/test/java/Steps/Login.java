// pushing this on github

package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.junit.Test;

public class Login
{
    Webdriver driver;
    @Given("^user is on the website$")
    public void user_is_on_the_website()  {
        //open the Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Abduls\\Documents\\jar libraries\\chromedriver.exe");
        // Enter the URL
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //Maximise the Window
        driver.manage().window().maximize();

    }

    @When("^user enters the login creds$")
    public void user_enters_the_login_creds() {
        driver.findElement(By.className("ico-login")).click();
        // Enter Username
        driver.findElement(By.id("Email")).sendKeys("test@azhar.com");
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("London123");

    }

    @Then("^user gets confirmation$")
    public void user_gets_confirmation()  {
        String conf = driver.findElement(By.className("ico-account")).getText();
        System.out.println(conf);

    }

    @And("^user clicks submit$")
    public void user_clicks_submit()  {
        // Click Submit Button
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();


    }
}
