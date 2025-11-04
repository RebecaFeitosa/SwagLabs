import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesafioLoginCompra {

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
    By btAddCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By btCart = By.xpath("//a[@class='shopping_cart_link']");
    By btCheckout = By.xpath("//button[@id='checkout']");
    By firstName = By.xpath("//input[@id='first-name']");
    By lastName = By.xpath("//input[@id='last-name']");
    By cep = By.xpath("//input[@id='postal-code']");
    By btContinue = By.xpath("//input[@id='continue']");
    By btFinish = By.xpath("//button[@id='finish']");


    @Test
    public void comprarProduto (){
        driver.findElement(username).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(btLogin).click();

        driver.findElement(btAddCart).click();
        driver.findElement(btCart).click();
        driver.findElement(btCheckout).click();
        driver.findElement(firstName).sendKeys("João");
        driver.findElement(lastName).sendKeys("Silva");
        driver.findElement(cep).sendKeys("01120000");
        driver.findElement(btContinue).click();
        driver.findElement(btFinish).click();
    }
}
