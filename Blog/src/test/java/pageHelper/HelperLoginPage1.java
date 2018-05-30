package pageHelper;

import org.apache.log4j.Logger;
import page.Page_login;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class HelperLoginPage1 {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    public static void inputusername(SeleniumUtil seleniumUtil, String username){
        seleniumUtil.sendKeys(Page_login.LOGIN_LINK_USERNAME,username);
    }
    public static void inputpassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(Page_login.LOGIN_LINK_PASSWORD,password);
    }
    public static void clicksubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_login.LOGIN_LINK_SUBMIT);
    }
}
