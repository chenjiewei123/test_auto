package page;

import org.openqa.selenium.By;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class Page_tie_delet {
    //选中帖子
    public static final By ALOGIN_LINK_XUAN=By.name("moderate[]");
    //删除帖子
    public static final By ALOGIN_LINK_DELET=By.linkText("删除");

    //确定删除帖子
    public static final By ALOGIN_LINK_ACCEPT=By.xpath("//*[@id=\"modsubmit\"]");
}
