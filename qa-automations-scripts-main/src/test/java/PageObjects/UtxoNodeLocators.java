package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtxoNodeLocators extends BaseClass {

    public WebElement NodeOptionOnSideBar(){
        WebElement NodeOptionOnSideBar=BaseClass.getDriver()
                .findElement(By.xpath("//a/span[text()='Node Visualizer']"));
        return NodeOptionOnSideBar;
    }
}
