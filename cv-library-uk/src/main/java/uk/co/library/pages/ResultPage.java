package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@class='form__label no-wrap'][1]")
    WebElement resultText;


    public String verifyTheResults() {
        Reporter.log("Verify the results " + resultText.toString() + "<br>");
       return resultText.getText().substring(0,7);
           }
    }
