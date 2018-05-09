package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver;
    public SeleniumUtil seleniumUtil;

    public Actions actions;
    private static Logger logger=Logger.getLogger(BasicTestCase.class);
    @BeforeMethod
    public void setUp(){
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        System.setProperty("webdriver.chrome.driver","D:\\maven-3.0.5\\chrome&driver\\chromedriver.exe");
        driver=seleniumUtil.getDriver("chrome");
        driver.manage().window().maximize();
        seleniumUtil.url("http://127.0.0.1:8088/discuz/forum.php");

    }

    @AfterMethod
    public void tearDown(){
        // driver.quit();
    }
}
