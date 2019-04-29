package ru.sbtqa.tag.tutorials.allure;

import io.qameta.allure.Step;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
}
