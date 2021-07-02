package com.Arkus.Pedro.SeleniumAvanzado;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotApi {

   WebDriver driver;

    @Test
    public void robotApiTest () throws AWTException, InterruptedException {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://spreadsheetpage.com/timesheet/employee/");

        driver.findElement(By.linkText("Download this template for free")).click();

        Robot robot = new Robot();

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);

        Thread.sleep(2000);
        for (int i = 0; i <=2; i++){
            robot.keyPress(KeyEvent.VK_TAB);
        }

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
        driver.quit();
    }

}
