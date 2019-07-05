package ru.sbtqa.tag.tutorials.allure;

import io.qameta.allure.Step;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.management.snmp.util.MibLogger;

import java.util.logging.Logger;

public class TestClass3 {
    private static final Logger LOG = Logger.getLogger(TestClass.class.getName());
    private static final org.slf4j.Logger logger1 = LoggerFactory.getLogger(TestClass.class);



    @BeforeMethod
    public void beforeTest() {
        LOG.info("Logged to allure: " + "AZAZA");
    }

    @AfterMethod
    public void afterTest() {
        LOG.info("Тест завершен!");
    }


    @Step(value = "Проверка суммы числа {num1} и числа {num2}")
    public static void checkS(int num1, int num2, int expectedSum) {
        Assert.assertTrue(num1 + num2 == expectedSum,"Сумма слагаемых не соответствует ожидаемому значению");
    }
    @Test
    public void aazazaz(){
        System.out.println("---------------");
        System.out.println("user.dir = " + System.getProperty("user.dir"));
        System.out.println("JDK.version = " + System.getProperty("java.version"));
        System.out.println("OS.name = " + System.getProperty("os.name"));
        System.out.println("OS.version = " + System.getProperty("os.version"));
        System.out.println("OS.arch = " + System.getProperty("os.arch"));
        System.out.println("testNG.version = " + System.getProperty("testNG.version"));
        System.out.println("allure.testNG.version = " + System.getProperty("allure.testNG.version"));
        System.out.println("maven-surefire-plugin.version = " + System.getProperty("maven-surefire-plugin.version"));
        System.out.println("maven-resources-plugin.version = " + System.getProperty("maven-resources-plugin.version"));

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        System.out.println("browserName = " + cap.getBrowserName());
        System.out.println("browserVersion = " + cap.getVersion());
        driver.close();
        System.out.println("---------------");
    }
}
