package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";  //storing base url
        System.setProperty("webdriver .firefox .driver ","src/drivers/geckodriver.exe");  //setting webdriver
        WebDriver driver = new FirefoxDriver();  //Creating object of chrome webdriver
        driver.get(baseurl);  //method to invoke url
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("The title of the page :"+title);   //Printing the title in Console
        String url = driver.getCurrentUrl();     //Storing url
        System.out.println("Current Url :"+url);  //getting url
        String source = driver.getPageSource();  //Storing page source
        System.out.println("Page source = "+source);  //Printing page source
        WebElement userNameField = driver.findElement(By.name("username"));  //Storing username field
        userNameField.sendKeys("parvi87@gmail.com");  //Sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));  //Storing password field
        passwordField.sendKeys("Jig76@");    //Sending keys to password field
//        driver.close();

    }
}
