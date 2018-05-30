package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage1;
import pageHelper.HelperfateiPage;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class Blog_huitie extends BasicTestCase {
    @Test
    public void huitie() throws InterruptedException {
        HelperLoginPage1.inputusername(seleniumUtil, "cjw");
        HelperLoginPage1.inputpassword(seleniumUtil, "password");
        HelperLoginPage1.clicksubmit(seleniumUtil);
        Thread.sleep(3000);
        HelperfateiPage.clickfa(seleniumUtil);
        Thread.sleep(3000);
        HelperfateiPage.clicktie(seleniumUtil);
        Thread.sleep(3000);
        HelperfateiPage.inputhuibody(seleniumUtil,"hello,myname");
        HelperfateiPage.clickhuisubmit(seleniumUtil);
        HelperfateiPage.clicklogout(seleniumUtil);
    }
}