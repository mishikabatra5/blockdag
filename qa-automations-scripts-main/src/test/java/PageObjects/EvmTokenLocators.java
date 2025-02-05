package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmTokenLocators extends BaseClass {

    public WebElement TokenOnSidebar(){
        WebElement TokenOnSidebar= BaseClass.getDriver()
                .findElement(By.xpath(" //div/span[text()='Token']"));
        return TokenOnSidebar;
    }

    public WebElement TopTokenOption(){
        WebElement TopTokenOption= BaseClass.getDriver()
                .findElement(By.xpath("  //ul/li/a/span[text()='Top Token']"));
        return TopTokenOption;
    }

    public WebElement ArrowButtonOnTopToken(){
        WebElement ArrowButtonOnTopToken= BaseClass.getDriver()
                .findElement(By.xpath(" //div[@class='style_button__Xl6wg'][1]"));
        return ArrowButtonOnTopToken;
    }

    public WebElement TransferButton(){
        WebElement TransferButton= BaseClass.getDriver()
                .findElement(By.xpath("//button[text()='Transfers']"));
        return TransferButton;
    }

    public WebElement HolderButton(){
        WebElement HolderButton= BaseClass.getDriver()
                .findElement(By.xpath("//button[text()='Holders']"));
        return HolderButton;
    }

    public WebElement EventsButton(){
        WebElement EventsButton= BaseClass.getDriver()
                .findElement(By.xpath(" //button[text()='Events']"));
        return EventsButton;
    }

    public WebElement InfoButton(){
        WebElement InfoButton= BaseClass.getDriver()
                .findElement(By.xpath(" //button[text()='Info']"));
        return InfoButton;
    }

    public WebElement ContractButton(){
        WebElement ContractButton= BaseClass.getDriver()
                .findElement(By.xpath("//button[text()='Contract']"));
        return ContractButton;
    }
}
