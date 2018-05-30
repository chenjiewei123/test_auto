package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage1;
import pageHelper.HelperfateiPage;

/**
 * Created by chenjiewei on 2018/5/9.
 */
public class Blog_pu_login extends BasicTestCase {
    @Test
    public void login() throws InterruptedException {
        HelperLoginPage1.inputusername(seleniumUtil, "cjw");
        HelperLoginPage1.inputpassword(seleniumUtil, "password");
        HelperLoginPage1.clicksubmit(seleniumUtil);
        Thread.sleep(3000);
        seleniumUtil.click(By.linkText("123"));
        Thread.sleep(3000);
        HelperfateiPage.inputbiao(seleniumUtil, "chenjiewei1");
        HelperfateiPage.inputbody(seleniumUtil, "hello wordld");
        HelperfateiPage.clickpostsubmit(seleniumUtil);
        Thread.sleep(3000);
        HelperfateiPage.clicklogout(seleniumUtil);
    }
}