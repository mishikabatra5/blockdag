package Test;

import Helper.BaseClass;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class UtxoTesting extends BaseClass {

    UtxoDashboardLocators UtxoDashboardObjects = new UtxoDashboardLocators();
    UtxoBlockLocators UtxoBlockObjects = new UtxoBlockLocators();
    UtxoTransactionLocators UtxoTransactionObjects = new UtxoTransactionLocators();
    UtxoFaucetLocators UtxoFaucetObjects= new UtxoFaucetLocators();
    UtxoSearchBar UtxoSearchObjects= new UtxoSearchBar();
    UtxoNodeLocators UtxoNodeObjects= new UtxoNodeLocators();

    @BeforeMethod
    public void UtxoTesting() throws InterruptedException {
        this.loadingUrl();
        Thread.sleep(3000); // Add a pause after loading the URL
    }

    @Test(priority =1)
    public void UtxoSwitching() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));
        //Dropdown option is clicked.
        WebElement DropdownButton=UtxoDashboardObjects.DropdownForChainSwitch();
        DropdownButton.click();
        Thread.sleep(5000);
        System.out.println("Clicked on Dropdown button");


        //Utxo chain switch
        WebElement UtxoSelectOptionButton=UtxoDashboardObjects.UtxoOptionForChainSwitch();
        wait.until(ExpectedConditions.elementToBeClickable(UtxoSelectOptionButton)).click();
        Thread.sleep(5000);
        System.out.println("Switched to UTXO Chain");
    }

    @Test(priority =2)
    public void UtxoDashboardTesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));
        Thread.sleep(5000);
        //to click on arrow button for opening the block detail page
        WebElement ArrowOnLatestTxnOnDashboard= UtxoDashboardObjects.ArrowForBlockOnDashboard();
        ArrowOnLatestTxnOnDashboard.click();
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);

        // to  return back to home page
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000);

        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);

        WebElement LatestTxnOfUtxoToggleButton=UtxoDashboardObjects.LatestUtxoTxnOptionOnDashboard();
        LatestTxnOfUtxoToggleButton.click();
        Thread.sleep(5000);

        //to click on first txn hash in the listing.
        WebElement FirstTxnHashOnUtxoTxnListing=UtxoDashboardObjects.FirstTxnHashOnListOnDashboard();
        FirstTxnHashOnUtxoTxnListing.click();
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);
        //to return back to home page
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000);
        System.out.println("Utxo Dashboard Testing complete");

    }

    @Test(priority = 3)
    public void UtxoBlockTesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));
        WebElement BlockButtonOnSidebar= UtxoBlockObjects.BlockButtonOnSidebar();
        BlockButtonOnSidebar.click();
        Thread.sleep(5000);


        //to click on first block number to be displayed on block listing on Block Page.
        WebElement FirstBlockNumberOnBlockPage= UtxoBlockObjects.FirstBlockOnBlockSummaryPage();
        wait.until(ExpectedConditions.elementToBeClickable(FirstBlockNumberOnBlockPage)).click();
        Thread.sleep(5000);

        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);
        //returned to block summary page.
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000);

        //click required for click the last option for scrolling the screen
        WebElement ClickForPagination=UtxoBlockObjects.NeededForPagination();
        ClickForPagination.click();
        Thread.sleep(3000);

        //to click on last page of Block list for testing pagination.
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        WebElement LastButtonForPagination=UtxoBlockObjects.LastOptionForPagination();
        wait.until(ExpectedConditions.elementToBeClickable(LastButtonForPagination)).click();
        Thread.sleep(5000);

        BaseClass.getDriver()
                .navigate().back();

    }
    @Test(priority = 4)
    public void UtxoTransactiontesting() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(5));

        //click on transaction option on sidebar

        WebElement TransactionButtonOnSidebar= UtxoTransactionObjects.TransactionButtonOnSidebar();
        TransactionButtonOnSidebar.click();
        Thread.sleep(5000);
        System.out.println("Switched to Transaction Page");

        //to click on first transaction hash on the transaction listing.
        WebElement FirstTxnHashToClick= UtxoTransactionObjects.FirstTxnHashOnListing();
        FirstTxnHashToClick.click();
        System.out.println("Clicked on first txn hash on listing");
        Thread.sleep(4000);
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000);


        //click required for click the last option for scrolling the screen
        WebElement ClickForPagination=UtxoBlockObjects.NeededForPagination();
        ClickForPagination.click();
        Thread.sleep(4000);

        //to click on last page of Block list for testing pagination.
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        WebElement LastButtonForPagination=UtxoBlockObjects.LastOptionForPagination();
        LastButtonForPagination.click();
        Thread.sleep(4000);
        System.out.println("Navigated to last page of Block Listing");
        Thread.sleep(5000);

        //to navigate back to block summary page.
        TransactionButtonOnSidebar.click();
        System.out.println("Switched to block listing page.");
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    public  void UtxoNodeTesting() throws InterruptedException{

        WebElement NodeButtonOnSidebar=UtxoNodeObjects.NodeOptionOnSideBar();
        NodeButtonOnSidebar.click();
        Thread.sleep(5000);

        Actions actions = new Actions(BaseClass.getDriver()
        );

        // Define start and end coordinates for the slide (relative to the screen)
        int startX = 300; // X-coordinate of the starting point
        int startY = 300; // Y-coordinate of the starting point
        int endX = 600;   // X-coordinate of the ending point
        int endY = 400;   // Y-coordinate of the ending point

        // Move the cursor in a straight line from (startX, startY) to (endX, endY)
        actions.moveByOffset(startX, startY).perform(); // Move to start position
        actions.clickAndHold().perform();              // Click and hold at start
        Thread.sleep(5000);
        actions.moveByOffset(endX - startX, endY - startY).perform(); // Slide cursor
        actions.release().perform();                   // Release mouse

        // Optional: Pause to observe the motion
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void UtxoSearchBarTesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        // Perform first search
        WebElement searchBarFieldButton = UtxoSearchObjects.SearchBarInputFieldOnUtxo();
        searchBarFieldButton.click();
        searchBarFieldButton.sendKeys("32838030" + Keys.ENTER);
        Thread.sleep(5000);
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000);

        // Re-locate the element before the second search
        searchBarFieldButton = UtxoSearchObjects.SearchBarInputFieldOnUtxo();
        searchBarFieldButton.click();
        searchBarFieldButton.sendKeys("56ff72e7be5946e093e47bfacbdc7609f919a38f64868572aac95e8ec1cd51d5" + Keys.ENTER);
        Thread.sleep(5000);
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000);

        // Re-locate the element before the third search
        searchBarFieldButton = UtxoSearchObjects.SearchBarInputFieldOnUtxo();
        searchBarFieldButton.click();
        searchBarFieldButton.sendKeys("ertyuifghjk" + Keys.ENTER);
        Thread.sleep(5000);

        // Locate and click the "Go Back to Home" button
        WebElement goBackToHomeButton = UtxoSearchObjects.GoBackToMainWebsite();
        goBackToHomeButton.click();
        Thread.sleep(5000);

        System.out.println("Utxo Search Testing Completed");
    }



//    @Test(priority = 7)
//    public void UtxoFaucetTesting() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
//
//        WebElement FaucetButtonOnSidebar = UtxoFaucetObjects.FaucetOptionOnSideBar();
//        FaucetButtonOnSidebar.click();
//        Thread.sleep(5000);
//        System.out.println("Switched to Faucet Page");
//
//    }

}


