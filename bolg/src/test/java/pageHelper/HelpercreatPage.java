package pageHelper;

import org.apache.log4j.Logger;
import page.Page;
import page.Page_creat_tie;
import page.Page_guan_login;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class HelpercreatPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    public static void clickcotrol(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_creat_tie.ALGIN_LINK_GUANLI,10);
        seleniumUtil.click(Page_creat_tie.ALGIN_LINK_GUANLI);
    }

    public static void inputpasswordguanli(SeleniumUtil seleniumUtil, String adminpwd){

        seleniumUtil.waitForElementLoad(Page_guan_login.ALGIN_LINK_INPUT,10);
        seleniumUtil.sendKeys(Page_guan_login.ALGIN_LINK_INPUT,adminpwd);
    }
    public static void clicktijiao(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_guan_login.ALGIN_LINK_TIJAIO,10);
        seleniumUtil.click(Page_guan_login.ALGIN_LINK_TIJAIO);
    }
    public static void clickluntan(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_creat_tie.ALGIN_LINK_LUNTAN,10);

        seleniumUtil.click(Page_creat_tie.ALGIN_LINK_LUNTAN);
    }
    public static void iframe(SeleniumUtil seleniumUtil){
        //seleniumUtil.waitForElementLoad(Page_creat_tie.IFRAME,20);
        seleniumUtil.iframe(Page_creat_tie.IFRAME);

        //seleniumUtil.click(Page_creat_tie.IFRAME);
    }
    public static void clickkuai(SeleniumUtil seleniumUtil){
     seleniumUtil.waitForElementLoad(Page_creat_tie.ALGIN_LINK_NEWKUAI,10);
        //seleniumUtil.waitForElementLoad(Page_creat_tie.IFRAME);
       //seleniumUtil.iframe("main");
        seleniumUtil.click(Page_creat_tie.ALGIN_LINK_NEWKUAI);
    }
    public static void inputnewname(SeleniumUtil seleniumUtil,String TEXT){
        seleniumUtil.sendKeys(Page.ALGIN_LINK_NEWNAME,TEXT);
    }
    public static void clicksubmitti(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_creat_tie.ALGIN_LINK_NEWSUBMIT,10);
        seleniumUtil.click(Page_creat_tie.ALGIN_LINK_NEWSUBMIT);
    }
    public static void clickTui(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_creat_tie.ALGIN_LINK_ATUI,10);
        seleniumUtil.click(Page_creat_tie.ALGIN_LINK_ATUI);
    }

}
