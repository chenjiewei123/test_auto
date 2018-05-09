package pageHelper;

import org.apache.log4j.Logger;
import page.Page_fatie;
import page.Page_huitie;
import page.Page_loginout;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class HelperfateiPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    public static void clickfa(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_fatie.LOGIN_LINK_fa,10);
        seleniumUtil.click(Page_fatie.LOGIN_LINK_fa);
    }
    public static void inputbiao(SeleniumUtil seleniumUtil,String biaotext){
        seleniumUtil.waitForElementLoad(Page_fatie.LOGIN_LINK_BIAO,10);
        seleniumUtil.sendKeys(Page_fatie.LOGIN_LINK_BIAO,biaotext);
    }
    public static void inputbody(SeleniumUtil seleniumUtil,String bodytext){
        seleniumUtil.waitForElementLoad(Page_fatie.LOGIN_LINK_BODY,10);
        seleniumUtil.sendKeys(Page_fatie.LOGIN_LINK_BODY,bodytext);
    }
    public static void clickpostsubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_fatie.LOGIN_LINK_FASTPOSTSUBMIT,10);
        seleniumUtil.click(Page_fatie.LOGIN_LINK_FASTPOSTSUBMIT);
    }

    public static void clicktie(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_huitie.HUIFU_LINK_HUI,10);
        seleniumUtil.click(Page_huitie.HUIFU_LINK_HUI);
    }
    public static void inputhuibody(SeleniumUtil seleniumUtil,String huitext){
        seleniumUtil.waitForElementLoad(Page_huitie.HUIFU_LINK_TEXT,5);
        seleniumUtil.sendKeys(Page_huitie.HUIFU_LINK_TEXT,huitext);
    }
    public static void clickhuisubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_huitie.HUIFU_LINK_MASSAGESUBMIT,5);
        seleniumUtil.click(Page_huitie.HUIFU_LINK_MASSAGESUBMIT);
    }
    public static void clicklogout(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_loginout.LOGOUT_LINK_TITLE,5);
        seleniumUtil.click(Page_loginout.LOGOUT_LINK_TITLE);
    }
}
