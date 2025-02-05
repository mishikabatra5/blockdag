package Test;

import Helper.BaseClass;
import PageObjects.*;
import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Node;

import java.time.Duration;

public class EvmTesting extends BaseClass {

    EvmDashboardLocators DashboardObjects = new EvmDashboardLocators();
    EvmBlockLocators BlockObjects = new EvmBlockLocators();
    EvmTransactionLocators TransactionObjects = new EvmTransactionLocators();
    EvmSearchbar SearchBarObject = new EvmSearchbar();
    EvmFaucetLocators FaucetObject= new EvmFaucetLocators();
    EvmContractLocators ContractObject= new EvmContractLocators();
    EvmTokenLocators TokenOneObjects= new EvmTokenLocators();
    EvmTokenTransferLocators TokenTransferObjects = new EvmTokenTransferLocators();
    EvmNodeLocators NodeObjects= new EvmNodeLocators();

    @BeforeMethod
    public void setup() throws InterruptedException {
        this.loadingUrl();  //
        Thread.sleep(5000); //
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", element
        );
    }

    // Helper method to navigate to the home page with an explicit wait
    private void navigateToHomePage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));
        WebElement homeButton = DashboardObjects.HomeButtonOnSidebar();
        wait.until(ExpectedConditions.elementToBeClickable(homeButton));
        homeButton.click();
        wait.until(ExpectedConditions.urlContains("home")); // Ensures the home page has loaded
        System.out.println("Navigated back to the Home page.");
        Thread.sleep(3000); // Add a pause after navigating back to the Home page
    }

    @Test(priority = 1)
    public void Dashboardtesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        // Click at the Arrow button on Latest Block
        WebElement arrowButton = DashboardObjects.ArrowButtonOnLatestBlock();
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(arrowButton)).click();
        Thread.sleep(5000); // Add pause after clicking Arrow button

        BaseClass.getDriver()
                .navigate().back();

        // Click on Latest Transaction
        WebElement latestTxnButton = DashboardObjects.HomeLatestTxn();
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(latestTxnButton)).click();
        Thread.sleep(5000); // Add pause after clicking Latest Transaction

        // Click on transaction hash on the dashboard
        WebElement txnHashOnDashboard = DashboardObjects.ClickonTxnHash();
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(txnHashOnDashboard)).click();
        Thread.sleep(5000); // Add pause after clicking transaction hash

        BaseClass.getDriver()
                .navigate().back();
        System.out.println("--------DashBoardtesting Completed---------");
    }

    @Test(priority = 2)
    public void Blocktesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        // Click on Blocks option on Sidebar
        WebElement blockButton = BlockObjects.BlocksOnSideBar();
        wait.until(ExpectedConditions.elementToBeClickable(blockButton)).click();
        Thread.sleep(5000); // Add pause after clicking on Blocks option

        // Click on the first Block in Block-Summary
        WebElement firstBlock = BlockObjects.FirstBlockOnBlockList();
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(firstBlock)).click();
        Thread.sleep(5000);// Add pause after clicking first Block
        // Navigate back to Block summary
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000); // Add pause after navigating back
        System.out.println("---------Blocktesting Completed---------");
    }

    @Test(priority = 3)
    public void Transactiontesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        // Click on Transaction option on Sidebar
        WebElement TxnButton = TransactionObjects.TransactionOnSidebar();
        wait.until(ExpectedConditions.elementToBeClickable(TxnButton)).click();
        Thread.sleep(5000); // Add pause after clicking Transaction option

        // Click on the first Block in Block-Summary
        WebElement firstTxnHash = TransactionObjects.firstTxnHashOnTransactionListing();
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        wait.until(ExpectedConditions.elementToBeClickable(firstTxnHash)).click();
        Thread.sleep(5000); // Add pause after clicking first transaction hash

        // Navigate back to Block summary
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000); // Add pause after navigating back
        System.out.println("---------Transactiontesting Completed---------");

    }



    @Test(priority = 4)
    public void SearchTesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        // Enter txn hash in search bar.
        WebElement TxnInSearchBar = SearchBarObject.GlobalSearchBar();
        wait.until(ExpectedConditions.elementToBeClickable(TxnInSearchBar)).click();
        TxnInSearchBar.sendKeys("0x5ae213a797db361ff6be50c09d0c82f8be821afd6a9f7061d7dac639a522232c" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering txn hash

        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000); // Pause after navigating back

        // Enter block number in search bar
        WebElement BlockInSearchbar = SearchBarObject.GlobalSearchBar();
        BlockInSearchbar.sendKeys("445" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering block number

        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(3000); // Pause after navigating back

        // Enter any from/to address in search bar
        WebElement AddressInSearchBar = SearchBarObject.GlobalSearchBar();
        AddressInSearchBar.sendKeys("0x410344ab6f949cd9f9013c52d1e59932f0f08967" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering address

        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000); // Pause after navigating back

        // Enter non-existing data in search bar
        WebElement NonExistingDataInSearchBar = SearchBarObject.GlobalSearchBar();
        NonExistingDataInSearchBar.sendKeys("0x46f949cd9f9013c52d1e59932f0f08967" + Keys.ENTER);
        Thread.sleep(5000); // Pause after entering non-existing data

        WebElement GoBackButton = SearchBarObject.GoBackToMainWebSiteButton();
        GoBackButton.click();
        Thread.sleep(5000); // Pause after clicking Go Back button
    }


    @Test(priority = 5)
    public void ContractListingTesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        //click on contract on sidebar
        WebElement ContractOptionOnSideBar= ContractObject.ContractOnsideBar();
        ContractOptionOnSideBar.click();
        System.out.println("clicked on contract");
        Thread.sleep(5000);

        //Click on listing option under contract dropdown
        WebElement ListingOfContractsOnSidebar=ContractObject.ListingOfContract();
        ListingOfContractsOnSidebar.click();
        System.out.println("clicked on listing option");
        Thread.sleep(5000);

        //click on side section for scroll
        WebElement SideSectionForScroll=ContractObject.TotalNumberOfContracts();
        SideSectionForScroll.click();

        //click to open the details of contract
        WebElement DetailofContractAddress=ContractObject.DetailofContract();
        DetailofContractAddress.click();
        System.out.println("clicked on arrow for detail of contract");
        Thread.sleep(5000);

        //click on holder toggle
        WebElement HolderToggleButton=ContractObject.Holdertoggle();
        HolderToggleButton.click();
        Thread.sleep(5000);

        //click on info toggle
        WebElement InfoToggleButton=ContractObject.InfoToggle();
        InfoToggleButton.click();
        Thread.sleep(5000);

        //Click on Contract toggle
        WebElement ContractToggleButton=ContractObject.ContractToggle();
        ContractToggleButton.click();
        Thread.sleep(5000);

        //navigated back to listing of contracts
        BaseClass.getDriver()
                .navigate().back();
        Thread.sleep(5000);
        ContractOptionOnSideBar.click();
    }


    @Test(priority = 6)
    public void TopTransferTesting() throws  InterruptedException{
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        //switch to token option on sidebar
        WebElement TokenOptionOnSidebar=TokenOneObjects.TokenOnSidebar();
        TokenOptionOnSidebar.click();
        Thread.sleep(5000);

        //click on top transfer
        WebElement TopTransferOptionOnSidebar=TokenOneObjects.TopTokenOption();
        TopTransferOptionOnSidebar.click();
        Thread.sleep(5000);

        //Click on arrow for detail page of contract
        WebElement ArrowButtonForTokenDetail=TokenOneObjects.ArrowButtonOnTopToken();
        ArrowButtonForTokenDetail.click();
        Thread.sleep(5000);

        //Click on transfer option on Token Detail page.
        WebElement TransferOnTokenDetail=TokenOneObjects.TransferButton();
        TransferOnTokenDetail.click();
        Thread.sleep(5000);

        //click on holders option on Token Detail Page.
        WebElement HolderOnTokenDetail=TokenOneObjects.HolderButton();
        HolderOnTokenDetail.click();
        Thread.sleep(5000);

        //Click on events option on token detail page.
        WebElement EventsOnTokenDetail=TokenOneObjects.EventsButton();
        EventsOnTokenDetail.click();
        Thread.sleep(5000);

        //Click on Info option on token detail page.
        WebElement InfoOnTokenDetail=TokenOneObjects.InfoButton();
        InfoOnTokenDetail.click();
        Thread.sleep(5000);

        //Click on Contract option on Token Detai page.
        WebElement ContractOnTokenDetail=TokenOneObjects.ContractButton();
        ContractOnTokenDetail.click();
        Thread.sleep(5000);

        //again click on the top transfer to return back to listing page
        TopTransferOptionOnSidebar.click();


    }


    @Test(priority = 7)
    public void TokenTransferTesting() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        //switch to token option on sidebar
        WebElement TokenOptionOnSidebar=TokenOneObjects.TokenOnSidebar();
        TokenOptionOnSidebar.click();
        Thread.sleep(5000);

        //click on the token transfer option
        WebElement TokenTransferButtonOnSidebar=TokenTransferObjects.TokenTransferOptionOnSidebar();
        TokenTransferButtonOnSidebar.click();
        Thread.sleep(5000);

        //click on the arrow button for the transfer details
        WebElement ArrowButtonforTransferDetails= TokenTransferObjects.ArrowOptionForTransferDetail();
        ArrowButtonforTransferDetails.click();
        Thread.sleep(5000);

        //click on the copy button for copying the txn hash
        WebElement CopyButtonForTxnHash=TokenTransferObjects.CopyOptionForTxnHash();
        CopyButtonForTxnHash.click();
        Thread.sleep(5000);

        //To Scroll on the overview of the txn of transfer
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);

        //To scroll to the top of the page
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, -1000)");
        Thread.sleep(5000);

        //Click on the logs option for transfer txn
        WebElement LogsButtonOnTransferTxn=TokenTransferObjects.LogsOptionOnTransferTxn();
        LogsButtonOnTransferTxn.click();
        Thread.sleep(5000);
        ((JavascriptExecutor) BaseClass.getDriver()
        ).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);


        //to navigate back to token transfer listing
        TokenTransferButtonOnSidebar.click();
    }

    @Test(priority=8)
    public void NodeTesting() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver()
                , Duration.ofSeconds(10));

        WebElement NodeOption= NodeObjects.NodeOptionOnSidebar();
        NodeOption.click();
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

//    @Test(priority = 9)
//    public void FaucetTesting() throws  InterruptedException{
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        //switch to Faucet Page
//        WebElement FaucetButtonOnSidebar=FaucetObject.FaucetOptionOnSideBar();
//        FaucetButtonOnSidebar.click();
//        Thread.sleep(5000);
//
//        WebElement AddressInput= FaucetObject.WalletAddressInputField();
//        AddressInput.sendKeys("0xd21499D4dB22650966F107Db8Ff18DC5eA52E20d");
//        Thread.sleep(5000);
//
//        WebElement AmountInput=FaucetObject.AmountInputField();
//        AmountInput.sendKeys("10");
//        Thread.sleep(5000);
//
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
//        WebElement LastPaginationButton= FaucetObject.LastOptionForPaginationOnFaucet();
//        LastPaginationButton.click();
//        Thread.sleep(5000);
//
//        driver.navigate().back();
//        System.out.println("--------EVM Faucet Testing Complete------------");
//        WebElement Homebutton1= DashboardObjects.HomeButtonOnSidebar();
//        Homebutton1.click();
//        Thread.sleep(5000);
//
//    }
}
