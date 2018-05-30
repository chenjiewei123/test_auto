package pageHelper;

import org.apache.log4j.Logger;
import page.Page_tie_delet;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class HelperdenletPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    public static void clickxuan(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_tie_delet.ALOGIN_LINK_XUAN,10);
        seleniumUtil.click(Page_tie_delet.ALOGIN_LINK_XUAN);
    }
    public static void clickdelet(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_tie_delet.ALOGIN_LINK_DELET,10);
        seleniumUtil.click(Page_tie_delet.ALOGIN_LINK_DELET);
    }
    public static void clickalertsubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_tie_delet.ALOGIN_LINK_ACCEPT,10);
        seleniumUtil.click(Page_tie_delet.ALOGIN_LINK_ACCEPT);
    }
}
