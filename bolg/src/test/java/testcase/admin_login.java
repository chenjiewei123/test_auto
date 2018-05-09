package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage1;
import pageHelper.HelpercreatPage;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class admin_login extends BasicTestCase{
    @Test
     public void A_login() throws InterruptedException {
        HelperLoginPage1.inputusername(seleniumUtil,"admin");
        HelperLoginPage1.inputpassword(seleniumUtil,"admin");
        HelperLoginPage1.clicksubmit(seleniumUtil);


        //HelperfateiPage.clickfa(seleniumUtil);
        //HelperdenletPage.clickxuan(seleniumUtil);
        //HelperdenletPage.clickalertsubmit(seleniumUtil);
        //HelperdenletPage.clickdelet(seleniumUtil);
        HelpercreatPage.clickcotrol(seleniumUtil);
        seleniumUtil.newPage();
        HelpercreatPage.inputpasswordguanli(seleniumUtil,"admin");

        HelpercreatPage.clicktijiao(seleniumUtil);

        HelpercreatPage.clickluntan(seleniumUtil);

       HelpercreatPage.iframe(seleniumUtil);
       // seleniumUtil.iframe(seleniumUtil.findElement(Page_creat_tie.ALGIN_LINK_NEWKUAI));
        HelpercreatPage.clickkuai(seleniumUtil);
       HelpercreatPage.inputnewname(seleniumUtil,"lllll");
       HelpercreatPage.clicksubmitti(seleniumUtil);
     }
}
