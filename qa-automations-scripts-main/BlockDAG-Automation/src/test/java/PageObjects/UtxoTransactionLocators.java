package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtxoTransactionLocators extends BaseClass {

     public WebElement TransactionButtonOnSidebar(){
         WebElement TransactionButtonOnSidebar=driver.findElement(By.xpath("//ul/li[3]/a/span")) ;
         return TransactionButtonOnSidebar;
     }

    public WebElement FirstTxnHashOnListing(){
         WebElement FirstTxnHashOnListing=driver.findElement(By.xpath("//div[@class='style_tableinfo__TIoAh style_md__6jSDe'][1]/div/span[@class='cursor-pointer'][1]"));
         return FirstTxnHashOnListing;
    }


}
