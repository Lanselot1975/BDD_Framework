package runner;


import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@CucumberOptions(
        plugin = {"json:target/Runner/cucumber.json", "pretty", "html:target/Runner", "com.cucumber.listener.ExtentCucumberFormatter"},
        features = {"src/test/resources/features"},
        tags = {"~@Ignore"},
        glue = {"stepdefs"}
)
public class Runner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void setup() {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
        Date curDate = new Date();
        String strDate = sdf.format(curDate);
        String fileName = "Output/" + strDate + ".html";
        File newFile = new File(fileName);

        ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);

        ExtentCucumberFormatter.loadConfig(new File(System.getProperty("user.dir")+"/src/test/resources/extent-config.xml"));
    }

}
