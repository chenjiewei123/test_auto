package pageHelper;

import org.apache.log4j.Logger;
import page.Page_sreach;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/9.
 */
public class HelperSreachPage {
    public static Logger logger=Logger.getLogger(HelperSreachPage.class);
    public static void sreach(SeleniumUtil seleniumUtil,String test){
    seleniumUtil.waitForElementLoad(Page_sreach.SREACH_LIMK,15);
        seleniumUtil.sendKeys(Page_sreach.SREACH_LIMK,test);

    }
    public  static void sreachclick(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_sreach.SREACH_CLICK,10);
        seleniumUtil.click(Page_sreach.SREACH_CLICK);
    }
    public static void sreachtie(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_sreach.SREACH_TIE,10);
        seleniumUtil.click(Page_sreach.SREACH_TIE);

    }
    public static void sreachyangzheng(SeleniumUtil seleniumUtil,String expect){
        seleniumUtil.waitForElementLoad(Page_sreach.SREACH_YANZHENG);
        seleniumUtil.assetForText(Page_sreach.SREACH_YANZHENG,expect);
    }



}
