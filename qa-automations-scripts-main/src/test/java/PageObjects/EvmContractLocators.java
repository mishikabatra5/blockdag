package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmContractLocators extends BaseClass {

    public WebElement ContractOnsideBar(){
            WebElement ContractOnSideBar =BaseClass.getDriver()
                    .findElement(By.xpath("//ul/li/div/div/span[text() = 'Contract']"));
            return ContractOnSideBar;
    }

    public WebElement ListingOfContract(){
             WebElement ListingOfContract= BaseClass.getDriver()
                     .findElement(By.xpath("//a/span[text()='Contract Listing']"));
             return ListingOfContract;
    }

    public WebElement TotalNumberOfContracts(){
        WebElement TotalNumberOfContracts= BaseClass.getDriver()
                .findElement(By.xpath("//section/div[@class='style_titleArea__Qk6S5 style_hasChildren__B6yxR']"));
        return TotalNumberOfContracts;
    }

    public WebElement DetailofContract(){
        WebElement DetailofContract= BaseClass.getDriver()
                .findElement(By.xpath("//div[@class='style_button__Xl6wg']"));
        return DetailofContract;
    }


    public WebElement Holdertoggle(){
        WebElement Holdertoggle= BaseClass.getDriver()
                .findElement(By.xpath("//button[text()='Holders']"));
        return Holdertoggle;
    }

    public WebElement InfoToggle(){
        WebElement InfoToggle= BaseClass.getDriver()
                .findElement(By.xpath("//button[text()='Info']"));
        return InfoToggle;
    }

    public WebElement ContractToggle(){
       WebElement ContractToggle=BaseClass.getDriver()
               .findElement(By.xpath("//button[text()='Contract']"));
       return ContractToggle;
    }





}
