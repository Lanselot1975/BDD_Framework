package stepdefs;


import cucumber.api.java.Before;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import utils.SeleniumDriver;

import java.net.MalformedURLException;

public class BeforeActions {

    @Parameters({"browser", "docker"})
    @Before
    public void setUp() throws MalformedURLException {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        String docker = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("docker");

        if(docker.equals("true")){
            SeleniumDriver.setDriver(browser, true);
        }else{
            SeleniumDriver.setDriver(browser);
        }

            SeleniumDriver.setDriver(browser);

    }
}
