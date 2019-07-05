package ru.sbtqa.tag.tutorials.allure;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CommonFunctions {
    private static final String RESOURCES = "src/test/resources/attachments";
    private static final String SCREENSHOT = "target/screenshots";

    private CommonFunctions() {
        throw new IllegalAccessError("Utility class");
    }

    @Attachment
    public static byte[] getBytes(String resourceName) throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES, resourceName));
    }

    @Attachment(value = "{allureName}")
    public static byte[] getBytesScreenshot(String resourceName, String allureName) throws IOException {
        return Files.readAllBytes(Paths.get(SCREENSHOT, resourceName));
    }

    @Attachment(value = "azaz", type = "text/plain", fileExtension = ".doc")
    public static byte[] getBytesAnnotationWithArgs(String resourceName) throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES, resourceName));
    }

    public static void getScreen(String allureName) {
        WorkWithScreenshot workWithScreenshot = new WorkWithScreenshot();
        workWithScreenshot.addScreenshotToAllure(allureName);
    }
}
