package com.caad.operation;

import com.caad.base.OperateAppium;
import com.caad.pages.LoginPage;

import io.appium.java_client.android.AndroidDriver;

/**
 * 登录逻辑处理
 * Created by LITP on 2016/9/23.
 */

public class LoginOperate extends OperateAppium {

    private LoginPage loginPage;

    AndroidDriver driver;

    public LoginOperate(AndroidDriver driver){
        super(driver);
        loginPage = new LoginPage(driver);
        this.driver = driver;
    }

    /**
     * 传递帐号密码
     * @param name 帐号
     * @param pass 密码
     * @return 是否成功登录到主页
     */
    public boolean login(String name,String pass){

        sleep(1000);
        //是否在欢迎页面
        if(getCurrActivity().equals(loginPage.getAboutText())){
            print("关于界面");
            for(int i=0; i<4; i++){
                swipeToLeft(300);
                sleep(500);
            }
            clickView(loginPage.getAboutButton());
            //点击欢迎页面的登录
            clickView(loginPage.getWelcmoeLoginButton());

            //在欢迎界面
        }else if(loginPage.isWelcome()){
            print("点击登录");
            clickView(loginPage.getWelcmoeLoginButton());
        }else if(loginPage.getLoginButton() == null){//自动登录了就输出成功，返回
            print("自动登录了，返回,执行注销");
            return true;

        }

        //输入内容
        inputManyText(name,pass);

        //点击登录
        clickView(loginPage.getLoginButton());

        //等待到首页
        waitAutoById(loginPage.getIndexElementId());

        //如果在登录完的界面没有第一屏就点击一下中间，关闭引导屏
        if(loginPage.getIndexElement() == null &&
                getCurrActivity().equals(loginPage.getIndexActivity())){
            press();
        }
        //返回是否成功到主页
        return loginPage.getIndexflag();
    }


}
