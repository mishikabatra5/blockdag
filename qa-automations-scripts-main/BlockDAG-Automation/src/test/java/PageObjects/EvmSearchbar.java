package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmSearchbar extends BaseClass {

    public WebElement GlobalSearchBar(){
        WebElement GlobalSearchBar =driver.findElement(By.xpath("//input[@placeholder=\"Search by Address / Txn Hash / Block\"]"));
        return GlobalSearchBar;
    }

    public WebElement GoBackToMainWebSiteButton(){
        WebElement GoBackToMainWebSiteButton=driver.findElement(By.xpath("//a[contains(text(), 'Go Back to Main Website')]"));
        return GoBackToMainWebSiteButton;
    }

}
