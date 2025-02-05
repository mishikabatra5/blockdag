package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmFaucetLocators extends BaseClass {

    public WebElement FaucetOptionOnSideBar(){
        WebElement FaucetOptionOnSideBar=BaseClass.getDriver()
                .findElement(By.xpath("//ul/li/a/span[text()='Faucet']"));
        return FaucetOptionOnSideBar;
    }

    public WebElement WalletAddressInputField(){
        WebElement WalletAddressInputField=BaseClass.getDriver()
                .findElement(By.xpath("//input[@placeholder='Enter Wallet Address']"));
        return WalletAddressInputField;
    }

    public WebElement AmountInputField(){
        WebElement AmountInputField=BaseClass.getDriver()
                .findElement(By.xpath("//input[@placeholder='Enter Amount']"));
        return AmountInputField;
    }

    public WebElement LastOptionForPaginationOnFaucet(){
        WebElement LastOptionForPaginationOnFaucet=BaseClass.getDriver()
                .findElement(By.xpath("//a[contains(text(),'Last')]"));
        return LastOptionForPaginationOnFaucet;
    }
}
