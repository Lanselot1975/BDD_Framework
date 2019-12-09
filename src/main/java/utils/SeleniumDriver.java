package utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumDriver {
    private static String OS = System.getProperty("os.name").toLowerCase();

    private  static SeleniumDriver seleniumDriver;

    private static WebDriver driver;

    private static WebDriverWait waitDriver;
    private final static int TIMEOUT = 30;
    private final static int PAGE_LOAD_TIMEOUT = 50;
    private int AJAX_ELEMENT_TIMEOUT = 10;
    private SeleniumDriver() {

        String browser = "firefox";

        if(browser.equals("chrome")){
            if (isWindows()) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
            } else if (isMac()) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
            }
            driver = new ChromeDriver();

        }else if(browser.equals("firefox")){
            if (isWindows()) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver.exe");
            } else if (isMac()) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver");
            }
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    private SeleniumDriver(String browser) {


        if(browser.equals("chrome")){
            if (isWindows()) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
            } else if (isMac()) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
            }
            driver = new ChromeDriver();

        }else if(browser.equals("firefox")){
            if (isWindows()) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resourcesexecutables/geckodriver.exe");
            } else if (isMac()) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver");
            }
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    private SeleniumDriver(String browser, boolean doc) throws MalformedURLException {

        DesiredCapabilities cap = null;
        if(browser.equals("firefox")){
            cap = DesiredCapabilities.firefox();
            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.ANY);
        }else if(browser.equals("chrome")){
            cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.ANY);
        }
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
        AjaxElementLocatorFactory ajaxElemFactory = new AjaxElementLocatorFactory(driver, AJAX_ELEMENT_TIMEOUT);
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    private static boolean isWindows() {

        return (OS.contains("win"));

    }

    private static boolean isMac() {

        return (OS.contains("mac"));

    }
    public static void openPage(String url){

        driver.get(url);
    }

    public static void closePage(){
        driver.close();
    }

    public static WebDriver getDriver(){

        return driver;
    }

    public static void setDriver(){

        if(seleniumDriver == null){
            seleniumDriver = new utils.SeleniumDriver();
        }
    }
    public static void setDriver(String browser){

        if(seleniumDriver == null){
            seleniumDriver = new SeleniumDriver(browser);
        }
    }
    public static void setDriver(String browser, boolean doc) throws MalformedURLException {

        if(seleniumDriver == null){
            seleniumDriver = new SeleniumDriver(browser, true);
        }
    }

    public static void switchWindow(String windowName){

        driver.switchTo().window(windowName);
    }

    public static void tearDown(){

        if(driver != null){
            driver.quit();
        }

        seleniumDriver = null;
    }
}
