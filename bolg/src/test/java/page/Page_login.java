package page;

import org.openqa.selenium.By;

/**
 * Created by chenjiewei on 2018/5/8.
 */
public class Page_login {
    //顶部用户名输入
    public static final By LOGIN_LINK_USERNAME=By.id("ls_username");
    //密码输入
    public static final By LOGIN_LINK_PASSWORD=By.id("ls_password");

    //点击登录
    public static final By LOGIN_LINK_SUBMIT=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");

}
