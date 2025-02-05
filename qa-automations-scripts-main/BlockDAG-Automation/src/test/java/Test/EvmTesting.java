package Test;

import Helper.BaseClass;
import PageObjects.EvmBlockLocators;
import PageObjects.EvmDashboardLocators;
import PageObjects.EvmSearchbar;
import PageObjects.EvmTransactionLocators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EvmTesting extends BaseClass {

    EvmDashboardLocators DashboardObjects = new EvmDashboardLocators();
    EvmBlockLocators BlockObjects = new EvmBlockLocators();
    EvmTransactionLocators TransactionObjects = new EvmTransactionLocators();
    EvmSearchbar SearchBarObject = new EvmSearchbar();

    // Method to call the URL
    @BeforeMethod
    public void EvmTesting() throws InterruptedException {
        this.LoadingUrl();
        Thread.sleep(5000); // Add a pause after loading the URL
    }

    // Helper method to scroll to a specific element
    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    // Helper method to navigate to the home page with an explicit wait
    private void navigateToHomePage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement homeButton = DashboardObjects.HomeButtonOnSidebar();
        wait.until(ExpectedConditions.elementToBeClickable(homeButton));
        homeButton.click();
        wait.until(ExpectedConditions.urlContains("home")); // Ensures the home page has loaded
        System.out.println("Navigated back to the Home page.");
        Thread.sleep(3000); // Add a pause after navigating back to the Home page
    }

    @Test(priority = 1)
    public void Dashboardtesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click at the Arrow button on Latest Block
        WebElement arrowButton = DashboardObjects.ArrowButtonOnLatestBlock();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(arrowButton)).click();
        Thread.sleep(5000); // Add pause after clicking Arrow button

         driver.navigate().back();

        // Click on Latest Transaction
        WebElement latestTxnButton = DashboardObjects.HomeLatestTxn();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(latestTxnButton)).click();
        Thread.sleep(5000); // Add pause after clicking Latest Transaction

        // Click on transaction hash on the dashboard
        WebElement txnHashOnDashboard = DashboardObjects.ClickonTxnHash();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(txnHashOnDashboard)).click();
        Thread.sleep(5000); // Add pause after clicking transaction hash

        driver.navigate().back();
        System.out.println("--------DashBoardtesting Completed---------");
    }

    @Test(priority = 2)
    public void Blocktesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on Blocks option on Sidebar
        WebElement blockButton = BlockObjects.BlocksOnSideBar();
        wait.until(ExpectedConditions.elementToBeClickable(blockButton)).click();
        Thread.sleep(5000); // Add pause after clicking on Blocks option

        // Click on the first Block in Block-Summary
        WebElement firstBlock = BlockObjects.FirstBlockOnBlockList();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(firstBlock)).click();
        Thread.sleep(5000);// Add pause after clicking first Block
        // Navigate back to Block summary
        driver.navigate().back();
        Thread.sleep(5000); // Add pause after navigating back
        System.out.println("---------Blocktesting Completed---------");
    }

    @Test(priority = 3)
    public void Transactiontesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on Transaction option on Sidebar
        WebElement TxnButton = TransactionObjects.TransactionOnSidebar();
        wait.until(ExpectedConditions.elementToBeClickable(TxnButton)).click();
        Thread.sleep(5000); // Add pause after clicking Transaction option

        // Click on the first Block in Block-Summary
        WebElement firstTxnHash = TransactionObjects.firstTxnHashOnTransactionListing();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(firstTxnHash)).click();
        Thread.sleep(5000); // Add pause after clicking first transaction hash

        // Navigate back to Block summary
        driver.navigate().back();
        Thread.sleep(5000); // Add pause after navigating back
        System.out.println("---------Transactiontesting Completed---------");

    }

    @Test(priority = 4)
    public void SearchTesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter txn hash in search bar.
        WebElement TxnInSearchBar = SearchBarObject.GlobalSearchBar();
        wait.until(ExpectedConditions.elementToBeClickable(TxnInSearchBar)).click();
        TxnInSearchBar.sendKeys("0x5ae213a797db361ff6be50c09d0c82f8be821afd6a9f7061d7dac639a522232c" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering txn hash

        driver.navigate().back();
        Thread.sleep(5000); // Pause after navigating back

        // Enter block number in search bar
        WebElement BlockInSearchbar = SearchBarObject.GlobalSearchBar();
        BlockInSearchbar.sendKeys("445" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering block number

        driver.navigate().back();
        Thread.sleep(3000); // Pause after navigating back

        // Enter any from/to address in search bar
        WebElement AddressInSearchBar = SearchBarObject.GlobalSearchBar();
        AddressInSearchBar.sendKeys("0x410344ab6f949cd9f9013c52d1e59932f0f08967" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering address

        driver.navigate().back();
        Thread.sleep(5000); // Pause after navigating back

        // Enter non-existing data in search bar
        WebElement NonExistingDataInSearchBar = SearchBarObject.GlobalSearchBar();
        NonExistingDataInSearchBar.sendKeys("0x46f949cd9f9013c52d1e59932f0f08967" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering non-existing data

        WebElement GoBackButton = SearchBarObject.GoBackToMainWebSiteButton();
        GoBackButton.click();
        Thread.sleep(5000); // Pause after clicking Go Back button
    }
}
