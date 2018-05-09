package page;

import org.openqa.selenium.By;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class Page_creat_tie {
    //进入管理中心
    public static final By ALGIN_LINK_GUANLI=By.xpath("//*[@id=\"um\"]/p[1]/a[5]");
    //点击论坛
    public static final By ALGIN_LINK_LUNTAN=By.linkText("论坛");
    //iframe
   public static final String IFRAME="main";
    //点击添加新版块
    public static final By ALGIN_LINK_NEWKUAI=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");
    //创建新版块名称
    public static final By ALGIN_LINK_NEWNAME=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[1]/td[3]/div/input");
    //点击提交新版块
    public static final By ALGIN_LINK_NEWSUBMIT=By.id("submit_editsubmit");
}
