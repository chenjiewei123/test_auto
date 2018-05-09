package page;

import org.openqa.selenium.By;

/**
 * Created by chenjiewei on 2018/5/9.
 */
public class Page_toupiao {

   //鼠标移动到发帖
    public static final By TOUPIAO_MOUSE=By.id("newspecial");
    //点击发起投票
    public static final By TOUPIAO_FAQI=By.linkText("发起投票");
    //发起投票名称
    public static final By TOUPIAO_MING=By.id("subject");
    //第一个选项
    public static final By TOUPIAO_yi=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");

    //第二个选项
    public static final By TOUPIAO_er=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");

    //第三个选项
    public static final By TOUPIAO_san=By.xpath("//*[@id=\"pollm_c_1\"]/p[3]/input");
    //点击提交投票
    public static final By TOUPIAO_post=By.id("postsubmit");
    //选择选项
    public static final By CHOSE_QING=By.id("option_1");
    //点击提交选择
    public static final By CHOSE_TITI=By.id("pollsubmit");

}
