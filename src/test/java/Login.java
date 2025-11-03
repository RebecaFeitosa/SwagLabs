import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Login {

    WebDriver driver;

    @BeforeEach
        public void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
        public void closer (){
        driver.close();
    }

    By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By btLogin = By.xpath("//input[@id='login-button']");
    By errorMessage = By.xpath("//button[@class='error-button']");

    @Test
    public void loginSucess (){
        driver.findElement(username).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(btLogin).click();
    }

    @Test
    public void lockedUser (){
        driver.findElement(username).sendKeys("locked_out_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(btLogin).click();
        /* String errorMessage = "Epic sadface: Sorry, this user has been locked out.";
        String actualMessage = driver.findElement(By.id(errorMessage)).getText();
        precisa colocar webdriver wait
        assertEquals(errorMessage, actualMessage); */
    }
}
