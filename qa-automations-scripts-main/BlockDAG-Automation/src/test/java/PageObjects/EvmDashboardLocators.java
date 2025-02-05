package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmDashboardLocators extends BaseClass {

    public WebElement ArrowButtonOnLatestBlock() {
        WebElement ArrowButtonOnLatestBlock = driver.findElement(By.xpath("//div[@class='style_tablerow__UWT7Y']/div[@class='style_button__Xl6wg'][1]"));
        return ArrowButtonOnLatestBlock;
    }
    public WebElement HomeButtonOnSidebar() {
        WebElement HomeButtonOnSidebar=driver.findElement(By.xpath("//ul/li/a/span[contains(text(), 'Home')]"));
        return HomeButtonOnSidebar;
    }
    public WebElement HomeLatestTxn() {
        WebElement HomeLatestTxn=driver.findElement(By.xpath("//div[2]/section[2]/div[2]/div[1]/a[2]"));
        return HomeLatestTxn;
    }
    public WebElement ClickonTxnHash() {
        WebElement ClickonTxnHash=driver.findElement(By.xpath("//span[@class='cursor-pointer'][1]"));
        return ClickonTxnHash;
    }
}