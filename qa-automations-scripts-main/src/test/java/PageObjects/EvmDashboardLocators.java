package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmDashboardLocators extends BaseClass {

    public WebElement ArrowButtonOnLatestBlock() {
        WebElement ArrowButtonOnLatestBlock = BaseClass.getDriver()
                .findElement(By.xpath("//div[@class='style_tablerow__UWT7Y']/div[@class='style_button__Xl6wg'][1]"));
        return ArrowButtonOnLatestBlock;
    }
    public WebElement HomeButtonOnSidebar() {
        WebElement HomeButtonOnSidebar=BaseClass.getDriver()
                .findElement(By.xpath("//ul/li/a/span[contains(text(), 'Home')]"));
        return HomeButtonOnSidebar;
    }
    public WebElement HomeLatestTxn() {
        WebElement HomeLatestTxn=BaseClass.getDriver()
                .findElement(By.xpath("//button[text()='latest txn']"));
        return HomeLatestTxn;
    }
    public WebElement ClickonTxnHash() {
        WebElement ClickonTxnHash=BaseClass.getDriver()
                .findElement(By.xpath("//span[@class='cursor-pointer'][1]"));
        return ClickonTxnHash;
    }
}