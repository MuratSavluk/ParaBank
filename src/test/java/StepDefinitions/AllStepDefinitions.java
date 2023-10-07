package StepDefinitions;

import Pages.Locators;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllStepDefinitions {
    Locators el = new Locators();
    @Given("Navigate To ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get(" https://parabank.parasoft.com/ ");
    }

    @When("Enter Data In Text Element")
    public void enterDataInTextElement(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0;i < items.size();i++){
            WebElement element = el.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            el.mySendKeys(element,word);
        }
    }

    @And("Cilick On The Element")
    public void cilickOnTheElement(DataTable value) {
        List<String> strlistElement = value.asList(String.class );
        for (int i = 0;i < strlistElement.size();i++){
            WebElement webElement = el.getWebElement(strlistElement.get(i));
            el.myClick(webElement);
        }
    }

    @And("Verification Is In Progeress")
    public void verificationIsInProgeress(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0;i < items.size();i++){
            WebElement element = el.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            el.verifyContainsText(element,word);
        }
    }
}
