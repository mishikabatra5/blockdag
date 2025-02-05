package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtxoBlockLocators extends BaseClass {

    public WebElement BlockButtonOnSidebar(){
        WebElement BlockButtonOnSidebar=driver.findElement(By.xpath("//ul/li[2]/a/span[contains(text(),'Blocks')]"));
        return BlockButtonOnSidebar;
    }

    public WebElement FirstBlockOnBlockSummaryPage(){
        WebElement FirstBlockOnBlockSummaryPage=driver.findElement(By.xpath("//div[@class='style_tableinfo__TIoAh style_md__6jSDe']/div/span[1]"));
        return FirstBlockOnBlockSummaryPage;
    }

    public WebElement NeededForPagination(){
        WebElement NeededForPagination= driver.findElement(By.xpath("//div[@class='style_titleArea__Qk6S5 style_hasChildren__B6yxR'][1]"));
        return NeededForPagination;
    }

    public WebElement LastOptionForPagination() {
        WebElement LastOptionForPagination = driver.findElement(By.xpath("//a[contains(text(),'Last')]"));
        return LastOptionForPagination;
    }

}


