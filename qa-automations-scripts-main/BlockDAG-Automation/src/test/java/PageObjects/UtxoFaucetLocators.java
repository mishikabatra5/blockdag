package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtxoFaucetLocators extends BaseClass {

    public WebElement FaucetOptionOnSideBar(){
        WebElement FaucetOptionOnSideBar=driver.findElement(By.xpath("//ul/li[4]/a/span[contains(text(),'Faucet')]"));
        return FaucetOptionOnSideBar;
    }

    public WebElement ToScrollTheFaucetPage(){
        WebElement ToScrollTheFaucetPage= driver.findElement(By.xpath("//div[@class='style_titleArea__Qk6S5 style_hasChildren__B6yxR'][1]"));
        return ToScrollTheFaucetPage;
    }

    public WebElement LastPageOptionForFaucetTxn(){
        WebElement LastPageOptionForFaucetTxn=driver.findElement(By.xpath("//div[@class='style_right__Eqbj0']/a[contains(text(),'Last')]"));
        return LastPageOptionForFaucetTxn;
    }
}
