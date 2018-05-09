package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage1;
import pageHelper.HelperToupiao;
import pageHelper.HelperfateiPage;

/**
 * Created by chenjiewei on 2018/5/9.
 */
public class Blog_toupiao extends BasicTestCase{
    @Test
    public void tou() throws InterruptedException {
        HelperLoginPage1.inputusername(seleniumUtil,"cjw");
        HelperLoginPage1.inputpassword(seleniumUtil,"password");
        HelperLoginPage1.clicksubmit(seleniumUtil);
        Thread.sleep(3000);
        HelperfateiPage.clickfa(seleniumUtil);
        HelperToupiao.mouse(seleniumUtil);
        HelperToupiao.faqi(seleniumUtil);
        HelperToupiao.ming(seleniumUtil,"谁是天下第一");
        HelperToupiao.yi(seleniumUtil,"青龙");
        HelperToupiao.er(seleniumUtil,"白虎");
        HelperToupiao.san(seleniumUtil,"朱雀");

        HelperToupiao.post(seleniumUtil);

        HelperToupiao.xuan(seleniumUtil);

        HelperToupiao.titi(seleniumUtil);
        Thread.sleep(10000);
        seleniumUtil.getText(By.id("thread_subject"));
        seleniumUtil.getText(By.className("pcbs"));
    }
}