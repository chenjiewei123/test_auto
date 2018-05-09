package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

//import org.apache.xpath.operations.String;
//import org.apache.xpath.operations.String;
/**
 * Created by chenjiewei on 2018/5/7.
 */
public class SeleniumUtil {
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver=null;
    public WebDriver getDriver(String driverType){

        if (driverType.equals("chrome")){
          driver=new ChromeDriver();
            logger.info("正在启动谷歌浏览器....");
        }else if (driverType.equals("firefox")){

            driver=new FirefoxDriver();
            logger.info("正在启动火狐浏览器");
        }else{
            logger.error("启动错误浏览器");
        }
        return driver;
    }

    public String getLacatorByElement(WebElement ele1,String expectText){
        String test=ele1.toString();
        String except=null;
        try{
            except=test.substring(test.indexOf(expectText)+1,test.length()-1);

        }catch(Exception e){
            e.printStackTrace();
            logger.info("不能找见String"+expectText);
        }
        return except;
    }
public WebElement findElement(By by){
    WebElement ele2=null;
    try{
        ele2=driver.findElement(by);
        logger.info("元素找到"+getLacatorByElement(ele2,">"));
        return ele2;
    }catch (NoSuchElementException e){
        e.printStackTrace();
        logger.info("元素未找到");
        return null;
    }



}
    public void alert(By by){

        Assert alert= (Assert) driver.switchTo().alert();


    }
    public void url(String url){
        driver.get(url);
        logger.info("打开网址"+url);
    }

    public List<WebElement> findElements(By by){
        List ele3=null;
        ele3=driver.findElements(by);
        logger.info("返回一组元素");
        return ele3;
    }

    //对元素进行点击操作
    public void click(By by){
        WebElement webElement=findElement(by);
        webElement.click();
        logger.info("已点击加载");
    }
    //进行清除操作
    public void clear(By by){
        WebElement webElement=findElement(by);
        webElement.clear();
        logger.info("已清除"+getLacatorByElement(webElement,"-->")+"内容");

    }
    //获取控件内容
    public String getText(By by){
        WebElement webElement=findElement(by);
       String test= webElement.getText();
        logger.info("获得的内容为"+test);
        return test;
    }

    //刷新refer
    public void refresh(){
        driver.navigate().refresh();
        logger.info("以点击刷新");
    }

    //在文本框中输入sendKeys
    public void sendKeys(By by,String text){
        WebElement webElement=findElement(by);
        clear(by);
        webElement.sendKeys(text);
        logger.info("输入"+getLacatorByElement(webElement,text));

    }
    //根据顶部title判断当前页面是哦否是预期页面
    public void assertpage(String expect){
        String actual=driver.getTitle();
        try{
            Assert.assertEquals(actual,expect);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.info("实际是"+actual+"预期是"+expect);
        }
        logger.info("找到当前页面符合预期页面"+actual);
    }

    //校验元素是否存在
    public boolean isExist(By by){
        try {
            driver.findElement(by);
            return true;
        }catch (NoSuchElementException e){
            logger.info("元素不存在。。。");
            return false;
        }

    }

    //校验文本是否与预期一致
    public void assetForText(By by,String expect){
        try {
            WebElement ele5 = findElement(by);
            String acturl = ele5.getText();
            Assert.assertEquals(acturl, expect);
            logger.info("找到了期望的文字"+expect);
        }catch (AssertionError e){
            logger.error("预期文本错误");
        }
    }


    public void newPage(){
        Set<String> windows=driver.getWindowHandles();
        for(String handle:windows){
            driver.switchTo().window(handle);
        }
        logger.info("跳转到新的页面");
    }

  public void iframe(String id){
    driver.switchTo().frame(id);
      logger.info("进入iframe页面");
}
public void iframe(){
    driver.switchTo().defaultContent();
}
    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 3000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }
    /**设置显示等待元素,默认10秒
     * @param by*/
    public void waitForElementLoad(By by){
        waitForElementLoad(by, 10);
    }


}
