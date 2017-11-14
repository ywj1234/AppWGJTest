package com.caad.test;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.caad.base.InitAppium;

public class AndroidContactsTest extends InitAppium{

    @Test
    public void addContact() throws Exception{
    	Thread.sleep(2000);
        driver.findElement(By.id("com.caad.viss.androidapp:id/user_name")).click();
        System.out.println("==========");
        Thread.sleep(1000);
        driver.findElement(By.id("com.caad.viss.androidapp:id/user_name")).sendKeys("vcyk002");
        Thread.sleep(1000);
        driver.findElement(By.id("com.caad.viss.androidapp:id/user_pwd")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("com.caad.viss.androidapp:id/user_pwd")).sendKeys("vcyk002123");
        Thread.sleep(1000);
        driver.findElement(By.id("com.caad.viss.androidapp:id/user_name")).click();
		Thread.sleep(1000);
        driver.findElementById("com.caad.viss.androidapp:id/btn_login").click();
		Thread.sleep(10000);
		System.out.println(driver.currentActivity());
    }
}
