package PageObjects;

import Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvmNodeLocators extends BaseClass {

    public WebElement NodeOptionOnSidebar(){
        WebElement NodeOptionOnSidebar= BaseClass.getDriver()
                .findElement(By.xpath("//a/span[text()='Node Visualizer']"));
        return NodeOptionOnSidebar;
    }
}
