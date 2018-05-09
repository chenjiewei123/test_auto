package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperLoginPage1;
import pageHelper.HelperfateiPage;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/7.
 */
public class Blog_login extends BasicTestCase{


@Test
    public void login() throws InterruptedException {
   HelperLoginPage1.inputusername(seleniumUtil,"cjw");
    HelperLoginPage1.inputpassword(seleniumUtil,"password");
    HelperLoginPage1.clicksubmit(seleniumUtil);
    Thread.sleep(3000);
    HelperfateiPage.clickfa(seleniumUtil);
    Thread.sleep(3000);
    HelperfateiPage.inputbiao(seleniumUtil,"chenjiewei1");
    HelperfateiPage.inputbody(seleniumUtil,"hello wordld");
    HelperfateiPage.clickpostsubmit(seleniumUtil);

}

@Test
    public void huifu() throws InterruptedException {
    HelperLoginPage.huifu(seleniumUtil,"cjw","password","huifudetiezi");
}
@Test
    public void Alogin() throws InterruptedException {
    HelperLoginPage.adminlogin(seleniumUtil,"admin","admin","admin","dada");
}
}
