package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression", // hangi senaryolarda bu etiket varsa onlar çalışacak
        //and yazılırsa hem smoke hem de regression olanları çalıştırıyor.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class _00_TestRunnerLogin extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser)
    {
        GWD.setThreadBrowserName(browser); // browser türünü GWD ye gönder
    }
}
