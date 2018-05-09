package page;

import org.openqa.selenium.By;

/**
 * Created by chenjiewei on 2018/5/7.
POM */
public class Page {
    //顶部用户名输入
    public static final By LOGIN_LINK_USERNAME=By.id("ls_username");
    //密码输入
    public static final By LOGIN_LINK_PASSWORD=By.id("ls_password");
    //点击登录
    public static final By LOGIN_LINK_SUBMIT=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    //点击默认板块
    public static final By LOGIN_LINK_fa =By.className("fl_icn");
    //输入帖子标题
    public static final By LOGIN_LINK_BIAO=By.id("subject");
    //输入帖子内容
    public static final By LOGIN_LINK_BODY=By.id("fastpostmessage");
    //点击发表帖子
    public static final By LOGIN_LINK_FASTPOSTSUBMIT=By.id("fastpostsubmit");
   //恢复帖子
    public static final By HUIFU_LINK_HUI=By.xpath("//*[@id=\"normalthread_3\"]/tr/th/a[1]");

   //回复内容
    public static final By HUIFU_LINK_TEXT= By.id("fastpostmessage");

    //点击发表回复
    public static final By HUIFU_LINK_MASSAGESUBMIT=By.xpath("//*[@id=\"fastpostsubmit\"]");
   //点击退出
    public static final By LOGOUT_LINK_TITLE=By.xpath("//*[@id=\"um\"]/p[1]/a[4]");

    //选中帖子
    public static final By ALOGIN_LINK_XUAN=By.name("moderate[]");
    //删除帖子
    public static final By ALOGIN_LINK_DELET=By.linkText("删除");

    //确定删除帖子
    public static final By ALOGIN_LINK_ACCEPT=By.xpath("//*[@id=\"modsubmit\"]");
    //进入管理中心

    public static final By ALGIN_LINK_GUANLI=By.xpath("//*[@id=\"um\"]/p[1]/a[5]");

    //输入管理密码
    public static final By ALGIN_LINK_INPUT=By.xpath("//*[@id=\"loginform\"]/p[4]/input");
    //点击提交
    public static final By ALGIN_LINK_TIJAIO=By.name("submit");

    //点击论坛
    public static final By ALGIN_LINK_LUNTAN=By.linkText("论坛");
    //点击添加新版块
    public static final By ALGIN_LINK_NEWKUAI=By.linkText("添加新版块");
    //创建新版块名称
    public static final By ALGIN_LINK_NEWNAME=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[1]/td[3]/div/input");
    //点击提交新版块
    public static final By ALGIN_LINK_NEWSUBMIT=By.id("submit_editsubmit");
}
