package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs extends BaseUtil{

    private BaseUtil base;

    public MyStepdefs(BaseUtil base) {
        this.base = base;
    }

    @Given("^Iam in the PcWorld Home Page$")
    public void iamInThePcWorldHomePage() throws Throwable {
        // Initiate web browser instance
        //opening the pcworld home page
       base.Driver.navigate().to("https://www.pcworld.co.uk");

    }

    @And("^I search for \"([^\"]*)\"laptop$")
    public void iSearchForLaptop(String querry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        WebElement element=base.Driver.findElement(By.name("search-field"));
        element.clear();
        element.sendKeys(querry);

        base.Driver.findElement(By.id("search_bttn")).submit();
        

        // base.Driver.findElement(By.xpath("//*[@id="product10169170"]/div[2]/header/a")).click();

    }

    @And("^I select the Laptop from the List$")
    public void iSelectTheLaptopFromTheList() throws Throwable {
        // Copy Image Link-right click on the link you want to select and you will get option copy Xpath
        base.Driver.findElement(By.xpath("//*[@id=\"product10169170\"]/div[2]/header/a")).click();
    }


    @When("^I click Add to Basket the item updated on the Basket$")
    public void iClickAddToBasketTheItemUpdatedOnTheBasket() throws Throwable {
        // Select the image link and right click to copy the Xpath
        base.Driver.findElement(By.className("main-purchase-btn")).submit();
    }

    @Given("^Iam in the PcWorld$")
    public void iamInThePcWorld() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //base.Driver.findElement(By.className("icon-hme")).click();
        base.Driver.navigate().to("https://www.pcworld.co.uk");

    }

    @And("^Ima in the Basket$")
    public void imaInTheBasket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       base.Driver.findElement(By.id("basket_bttn")).click();
    }

    @When("^I click remove to empty the Basket$")
    public void iClickRemoveToEmptyTheBasket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       base.Driver.findElement(By.xpath("//*[@id=\"product10169170\"]/table/tbody/tr[1]/th/div/div[2]/a")).click();
    }

    @And("^I search for \"([^\"]*)\" laptop$")
    public void iSearchForLaptops(String querry1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement element=base.Driver.findElement(By.name("search-field"));
        element.sendKeys(querry1);

        base.Driver.findElement(By.id("search_bttn")).submit();
    }

    @And("^I add item to the shopping Basket$")
    public void iAddItemToTheShoppingBasket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.Driver.findElement(By.className("main-purchase-btn")).submit();
    }

    @And("^I select item from the list$")
    public void iSelectItemFromTheList() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.Driver.findElement(By.xpath("//*[@id=\"product10169170\"]/div[2]/header/a")).click();
    }
}
