package Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass{
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver== null){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public void quitdriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
//end of BaseClass

    //declaring the url for specific path
    public static void loadURL(String url){
        getDriver().get(url);
    }

    //Main method that will call the BaseClass loading and quiting driver
    public  void LoadingUrl() throws InterruptedException {
        BaseClass.loadURL("https://bdagscan.com");
//    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 3000)", "");

//Time to see the loaded URL
        Thread.sleep(5000);
    }

}

//----------------------------------------------------------------------------------------------------------------------------------
