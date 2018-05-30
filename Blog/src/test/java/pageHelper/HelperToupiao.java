package pageHelper;

import org.apache.log4j.Logger;
import page.Page_toupiao;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/9.
 */
public class HelperToupiao {
    public static Logger logger=Logger.getLogger(HelperToupiao.class);
    public static void mouse(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_toupiao.TOUPIAO_MOUSE,10);
        seleniumUtil.mouse(seleniumUtil.findElement(Page_toupiao.TOUPIAO_MOUSE));

    }
    public static void faqi(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_toupiao.TOUPIAO_FAQI,10);
        seleniumUtil.click(Page_toupiao.TOUPIAO_FAQI);
    }
    public static void ming(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(Page_toupiao.TOUPIAO_MING,10);
        seleniumUtil.sendKeys(Page_toupiao.TOUPIAO_MING,text);
    }
    public static void yi(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(Page_toupiao.TOUPIAO_yi,10);
        seleniumUtil.sendKeys(Page_toupiao.TOUPIAO_yi,text);
    }
    public static void er(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(Page_toupiao.TOUPIAO_er,10);
        seleniumUtil.sendKeys(Page_toupiao.TOUPIAO_er,text);
    }
    public static void san(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(Page_toupiao.TOUPIAO_san,10);
        seleniumUtil.sendKeys(Page_toupiao.TOUPIAO_san,text);
    }

    public static void post(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_toupiao.TOUPIAO_post,10);
        seleniumUtil.click(Page_toupiao.TOUPIAO_post);
    }
    public static void xuan(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_toupiao.CHOSE_QING,10);
        seleniumUtil.click(Page_toupiao.CHOSE_QING);
    }

    public static void titi(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_toupiao.CHOSE_TITI,10);
        seleniumUtil.click(Page_toupiao.CHOSE_TITI);
    }
}
