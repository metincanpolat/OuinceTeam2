package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav extends Parent{

    public TopNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;


    WebElement myElement;
    public void findAndClick(String strlement)
    {
        //element get :burda string isimden weblemente ulaşıcam
        switch (strlement)
        {
            case "setupOne" : myElement=setupOne;break;

        }

        clickFunction(myElement);
    }



}
