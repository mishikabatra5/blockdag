package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmTransactionLocators extends BaseClass {

    public WebElement TransactionOnSidebar() {
        WebElement TransactionOnSidebar = driver.findElement(By.xpath("//ul/li[3]/a/span"));
        return TransactionOnSidebar;
    }

    public WebElement firstTxnHashOnTransactionListing(){
        WebElement firstTxnHashOnTransactionListing= driver.findElement(By.xpath("//div/span[@class=\"cursor-pointer\"][1]"));
        return firstTxnHashOnTransactionListing;
    }


}
