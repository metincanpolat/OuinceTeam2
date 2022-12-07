package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;




    WebElement myElement;

    public void findAndSend(String strlement, String value) {
        //element get :burda string isimden weblemente ulaşıcam
        switch (strlement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strlement) {
        //element get :burda string isimden weblemente ulaşıcam
        switch (strlement) {
            case "loginButton":
                myElement = loginButton;
                break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strlement, String text) {
        //element get :burda string isimden weblemente ulaşıcam
        switch (strlement) {
            case "txtTechnoStudy":
                myElement = txtTechnoStudy;
                break;


        }

        verifyContainsTextFunction(myElement, text);
    }

    public void findAndDelete(String searchText) {

        findAndSend("searchInput", searchText);  // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        //wait.until(ExpectedConditions.stalenessOf(deleteButton)); stale zamanını yakalayamadım
        //wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//tbody[@role='rowgroup']//tr"),5));

        // findAndContainsText("searchResultCell", searchText); // arama sonuçlarının ilkinde aranan kelime gözükene kadar bekle.

        waitUntilLoading(); // progressbar ın çocukları 0 olana kadar bekle

        findAndClick("deleteButton"); // silme butonua bas, çöp kutusu
        findAndClick("deleteDialogBtn"); // dilogdaki silme butonuna bas

    }

}
