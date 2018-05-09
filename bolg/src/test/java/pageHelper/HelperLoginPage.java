package pageHelper;

import org.apache.log4j.Logger;
import page.Page;
import util.SeleniumUtil;

/**
 * Created by chenjiewei on 2018/5/7.
 */
public class HelperLoginPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    public static void inputusername(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendKeys(Page.LOGIN_LINK_USERNAME,username);
    }
    public static void inputpassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(Page.LOGIN_LINK_PASSWORD,password);
    }
    public static void clicksubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.LOGIN_LINK_SUBMIT);
    }
    public static void clickfa(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.LOGIN_LINK_fa);
    }
    public static void inputbiao(SeleniumUtil seleniumUtil,String biaotext){
        seleniumUtil.sendKeys(Page.LOGIN_LINK_BIAO,biaotext);
    }
    public static void inputbody(SeleniumUtil seleniumUtil,String bodytext){
        seleniumUtil.sendKeys(Page.LOGIN_LINK_BODY,bodytext);
    }
    public static void clickpostsubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.LOGIN_LINK_FASTPOSTSUBMIT);
    }
    public static void clicktie(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.HUIFU_LINK_HUI);
    }
    public static void inputhuibody(SeleniumUtil seleniumUtil,String huitext){
        seleniumUtil.sendKeys(Page.HUIFU_LINK_TEXT,huitext);
    }
    public static void clickhuisubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.HUIFU_LINK_MASSAGESUBMIT);
    }
    public static void clicklogout(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.LOGOUT_LINK_TITLE);
    }
    public static void clickxuan(SeleniumUtil seleniumUtil){
         seleniumUtil.click(Page.ALOGIN_LINK_XUAN);
    }
    public static void clickdelet(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.ALOGIN_LINK_DELET);
    }
    public static void clickalertsubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.ALOGIN_LINK_ACCEPT);
    }
    public static void clickcotrol(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.ALGIN_LINK_GUANLI);
    }
    public static void inputpasswordguanli(SeleniumUtil seleniumUtil,String adminpwd){
        seleniumUtil.newPage();
        seleniumUtil.sendKeys(Page.ALGIN_LINK_INPUT,adminpwd);
    }
    public static void clicktijiao(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.ALGIN_LINK_TIJAIO);
    }
    public static void clickluntan(SeleniumUtil seleniumUtil){

        seleniumUtil.click(Page.ALGIN_LINK_LUNTAN);
    }

    public static void clickkuai(SeleniumUtil seleniumUtil){
        //seleniumUtil.iframe(seleniumUtil.findElement(Page.ALGIN_LINK_NEWKUAI));
        seleniumUtil.click(Page.ALGIN_LINK_NEWKUAI);
    }
    public static void inputnewname(SeleniumUtil seleniumUtil,String TEXT){
        seleniumUtil.sendKeys(Page.ALGIN_LINK_NEWNAME,TEXT);
    }
    public static void clicksubmitti(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page.ALGIN_LINK_NEWSUBMIT);
    }

    public static void login(SeleniumUtil seleniumUtil,String username,String password,String biaotext,String bodytext) throws InterruptedException {
        inputusername(seleniumUtil, username);
        inputpassword(seleniumUtil, password);
        clicksubmit(seleniumUtil);
        Thread.sleep(3000);
        clickfa(seleniumUtil);
        inputbiao(seleniumUtil,biaotext);
        inputbody(seleniumUtil,bodytext);
        clickpostsubmit(seleniumUtil);
        Thread.sleep(3000);
        clicklogout(seleniumUtil);
    }

    public static void huifu(SeleniumUtil seleniumUtil,String username,String password,String huitext) throws InterruptedException {
        inputusername(seleniumUtil, username);
        inputpassword(seleniumUtil, password);
        clicksubmit(seleniumUtil);
        Thread.sleep(3000);
        clickfa(seleniumUtil);
        clicktie(seleniumUtil);
        inputhuibody(seleniumUtil,huitext);
        Thread.sleep(3000);
        clickhuisubmit(seleniumUtil);
        Thread.sleep(3000);
        clicklogout(seleniumUtil);

    }
    public static void adminlogin(SeleniumUtil seleniumUtil,String username,String password,String adminpassword,String text) throws InterruptedException {
        inputusername(seleniumUtil, username);
        inputpassword(seleniumUtil, password);
        clicksubmit(seleniumUtil);
        Thread.sleep(3000);
        clickfa(seleniumUtil);
       /* Thread.sleep(3000);
        clickxuan(seleniumUtil);
        Thread.sleep(3000);
        clickdelet(seleniumUtil);*/
        //Thread.sleep(3000);
        //clickalertsubmit(seleniumUtil);
        Thread.sleep(3000);
        clickcotrol(seleniumUtil);
        /*Thread.sleep(3000);
        inputpasswordguanli(seleniumUtil,adminpassword);
        Thread.sleep(3000);
        clicktijiao(seleniumUtil);*/

        Thread.sleep(3000);
        clickluntan(seleniumUtil);
        Thread.sleep(3000);
        clickkuai(seleniumUtil);
        Thread.sleep(3000);
        inputnewname(seleniumUtil,text);
        Thread.sleep(3000);
        clicksubmitti(seleniumUtil);
    }
}
