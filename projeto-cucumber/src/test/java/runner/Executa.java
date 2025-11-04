package runner;

import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Executa extends Driver {

    public static void abrirNavegador(){

        String site = "https://www.saucedemo.com/";
        String navegador = "Chrome";

        // Se o navegador for igual a Chrome, abre o Chrome, se não, abre o Edge. O equalsIgnoreCase compara textos
        if (navegador.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.get(site);   // Abre o site
        driver.manage().window().maximize();  // Maximiza a tela
    }
}
