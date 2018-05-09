package page;

import org.openqa.selenium.By;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class Page_huitie {
    //恢复帖子
    public static final By HUIFU_LINK_HUI=By.linkText("chenjiewei1");

    //回复内容
    public static final By HUIFU_LINK_TEXT= By.id("fastpostmessage");

    //点击发表回复
    public static final By HUIFU_LINK_MASSAGESUBMIT=By.xpath("//*[@id=\"fastpostsubmit\"]");

}
