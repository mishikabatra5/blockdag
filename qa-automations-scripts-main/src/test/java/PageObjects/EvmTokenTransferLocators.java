package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmTokenTransferLocators extends BaseClass {

    public WebElement TokenTransferOptionOnSidebar(){
        WebElement TokenTransferOptionOnSidebar= BaseClass.getDriver()
                .findElement(By.xpath("//ul/li/a/span[text()='Token Transfer']"));
        return TokenTransferOptionOnSidebar;
    }

    public  WebElement ArrowOptionForTransferDetail(){
        WebElement ArrowOptionForTransferDetail=BaseClass.getDriver()
                .findElement(By.xpath("//div[@class='style_button__Xl6wg'][1]"));
        return ArrowOptionForTransferDetail;
    }

    public WebElement CopyOptionForTxnHash(){
        WebElement CopyOptionForTxnHash= BaseClass.getDriver()
                .findElement(By.xpath("//button[text()='Copy']"));
        return CopyOptionForTxnHash;
    }

    public WebElement LogsOptionOnTransferTxn(){
        WebElement LogsOptionOnTransferTxn=BaseClass.getDriver()
                .findElement(By.xpath(" //button[text()='Logs']"));
        return LogsOptionOnTransferTxn;
    }
}
