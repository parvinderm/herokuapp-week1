package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {

    public static void main(String[] args) {
        String baseurl ="http://the-internet.herokuapp.com/login";  //storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");  //setting webdriver
        WebDriver driver = new ChromeDriver();  //Creating object of chrome webdriver
        driver.get(baseurl);  //method to invoke url
        driver.manage().window().maximize();  //maximise windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));   //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("The title od the page :"+ title);  //Storing title
        String url = driver.getCurrentUrl();   //Predefined method
        System.out.println("Current URL:"+url);  //getting url
        String source = driver.getPageSource();  //  //Predefined method
        System.out.println("page source :"+source);  //printing source in console
        WebElement  userNameField = driver.findElement(By.name("username"));  //storing username field
        userNameField.sendKeys("parvinderm767@gmail.com");    //sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));  //storing password field
        passwordField.sendKeys("Jignesh89@");//sendkeys to password field


    }
}
