package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {

    public static void main(String[] args) {
     String baseurl = "http://the-internet.herokuapp.com/login";  //storing base url
        System.setProperty("webdriver.edgedriver.driver","src/drivers/msedgedriver.exe");//setting webdriver
        WebDriver driver = new EdgeDriver();   //Creating object for Edge webdriver
        driver.get(baseurl);   //method to invoke url
        driver.manage().window().maximize(); //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("Title of the page:"+title);   //Printing title in console
        String url = driver.getCurrentUrl();    //Predefined method
        System.out.println("Current url :"+url);  //getting url
        String source = driver.getPageSource(); //Storing source page
        System.out.println("Page source :"+source);                         //Printing source page
        WebElement userNameField = driver.findElement(By.name("username"));  //Storing username field
        userNameField.sendKeys("parvinderm767@gmail.com");    //sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));   //Storing password field
        passwordField.sendKeys("Jignesh89@");   //sending keys to password field
        driver.close();  //closing browser
    }
}
