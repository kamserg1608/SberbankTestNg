package ru.sbtqa.tag.tutorials.allure;

import io.qameta.allure.Step;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TestClass2 {
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
    public static void checkSummationStep123PPPPPPPPP(int num1, int num2, int expectedSum) {
        Assert.assertTrue(num1 + num2 == expectedSum,"Сумма слагаемых не соответствует ожидаемому значению");
    }
    @Test
    public void testDemoSteps1() {
        Steps.checkSumStep(3, 2, 5);
        Steps.checkSumStep(5, 4, 9);
    }

    @Test
    public void testDemoSteps2() {
        Steps.checkSubtractionStep(10, 8, 2);
    }
}
