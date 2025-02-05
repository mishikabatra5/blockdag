package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtxoDashboardLocators extends BaseClass {

    //element to be clicked for opening the dropdown option
    public WebElement DropdownForChainSwitch(){
        WebElement DropdownForChainSwitch=driver.findElement(By.xpath("//div[@class='style_selectedMethod__s6kr8']"));
        return DropdownForChainSwitch;
    }

    //utxo option to be clicked for switching the chain from EVM to UTXO
    public WebElement UtxoOptionForChainSwitch(){
        WebElement UtxoOptionForChainSwitch= driver.findElement(By.xpath("//div/a[contains(text(),'UTXO')]"));
        return UtxoOptionForChainSwitch;
    }

    //to click on the arrow button for first block in the block listing displayed on Dashboard
    public WebElement ArrowForBlockOnDashboard(){
        WebElement ArrowForBlockOnDashboard=driver.findElement(By.xpath("//div[@class='style_button__Xl6wg'][1]"));
        return ArrowForBlockOnDashboard;
    }

    //to click on the Latest Utxo Txn option on Dashboard
    public WebElement LatestUtxoTxnOptionOnDashboard(){
        WebElement LatestUtxoTxnOptionOnDashboard= driver.findElement(By.xpath("//a[contains(text(), 'LATEST UTXO TXN')]"));
        return LatestUtxoTxnOptionOnDashboard;
    }

    //to click on the first txn hash that is displayed under the "Latest UTXO Txn" option on Dashboard
    public WebElement FirstTxnHashOnListOnDashboard(){
        WebElement FirstTxnHashOnListOnDashboard= driver.findElement(By.xpath("//span[@class='cursor-pointer'][1]"));
        return FirstTxnHashOnListOnDashboard;
    }

}
