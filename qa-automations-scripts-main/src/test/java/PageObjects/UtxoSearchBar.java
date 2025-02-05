package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtxoSearchBar extends BaseClass {

    public WebElement SearchBarInputFieldOnUtxo(){
        WebElement SearchBarInputFieldOnUtxo=BaseClass.getDriver()
                .findElement(By.xpath("//input[@placeholder='Search by Address / Txn Hash / Block']"));
        return SearchBarInputFieldOnUtxo;
    }

    public WebElement GoBackToMainWebsite(){
        WebElement GoBackToMainWebsite= BaseClass.getDriver()
                .findElement(By.xpath("//a[contains(text(),'Go Back to Main Website')]"));
        return GoBackToMainWebsite;
    }
}
