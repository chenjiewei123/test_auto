package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by chenjiewei on 2018/5/7.
 */
public class LogConfiguration {
    public static void  initLog(){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String date=dateFormat.format(new Date());
        //定义一个文件路径
        String logFileName="./Log/logs"+date+".log";
        Properties pro=new Properties();
        pro.setProperty("log4j.rootLogger","info,toConsole,toFile");
        pro.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        pro.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd-HH:mm:ss}] [%p] %m%n");

        pro.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");

        pro.setProperty("log4j.appender.toFile.file",logFileName);
        pro.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd-HH:mm:ss}] [%p] %m%n");

        PropertyConfigurator.configure(pro);


    }
}
