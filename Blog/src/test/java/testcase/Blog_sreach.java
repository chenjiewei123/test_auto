package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage1;
import pageHelper.HelperSreachPage;
import pageHelper.HelperfateiPage;

/**
 * Created by chenjiewei on 2018/5/9.
 */
public class Blog_sreach extends BasicTestCase {
    @Test
    public void sreach() throws InterruptedException {
        HelperLoginPage1.inputusername(seleniumUtil,"cjw");
        HelperLoginPage1.inputpassword(seleniumUtil,"password");
        HelperLoginPage1.clicksubmit(seleniumUtil);
        Thread.sleep(10000);
        HelperSreachPage.sreach(seleniumUtil,"haotest");
        Thread.sleep(10000);

        HelperSreachPage.sreachclick(seleniumUtil);
        Thread.sleep(10000);
        seleniumUtil.newPage();
        HelperSreachPage.sreachtie(seleniumUtil);
        seleniumUtil.newPage();
        HelperSreachPage.sreachyangzheng(seleniumUtil,"haotest");
        HelperfateiPage.clicklogout(seleniumUtil);





    }
}
