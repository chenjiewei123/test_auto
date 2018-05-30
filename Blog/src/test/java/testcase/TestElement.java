package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageHelper.HelperLoginPage;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class TestElement{

    public static void main(String[]args) throws InterruptedException, IOException {
        SeleniumUtil util = new SeleniumUtil();
        HelperLoginPage pageHelper = new HelperLoginPage();
        System.setProperty("webdriver.chrome.driver","D:\\maven-3.0.5\\chrome&driver\\chromedriver.exe");
        WebDriver driver = util.getDriver("browser");
        driver.get("http://127.0.0.1:8088/discuz/admin.php");
        pageHelper.adminlogin(util,"admin","admin","admin","版块");
        int size=driver.findElements(By.linkText("论坛")).size();
    }


}
