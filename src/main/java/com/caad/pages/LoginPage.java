package com.caad.pages;

import com.caad.base.PageAppium;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * ui界面类，界面在这里处理
 * Created by LITP on 2016/9/22.
 */
public class LoginPage extends PageAppium {

    //用户名输入
    public final String LOGIN_BUTTON_ID = "com.caad.viss.androidapp:id/user_name";
    //密码输入框
    public final String WELCOME_LOGIN_BUTTON_ID = "com.caad.viss.androidapp:id/user_pwd";
    //classname
    public final String LOGIN_CLASSNAME = "android.widget.EditText";

    //成功登录到首页标识
    public final String INDEX_TEXT = "首页";

    //登录完成之后的activity名字
    public final String INDEX_ACTIVITY_NAME = "IndexActivity";

    public LoginPage(AndroidDriver driver){
        super(driver);
    }

    /**
     * 是否在欢迎界面
     */
    public boolean isWelcome(){
        return isIdElementExist(WELCOME_LOGIN_BUTTON_ID,3,true);
    }

    public AndroidElement getWelcmoeLoginButton(){
        return findById(WELCOME_LOGIN_BUTTON_ID);
    }


    public AndroidElement getLoginButton(){
        return findById(LOGIN_BUTTON_ID);
    }

    /**
     * 获取账号密码框的控件
     * @return
     */
    public List<AndroidElement> getNamePassElement(){
        return getManyElementByClassName(LOGIN_CLASSNAME,2);
    }


    /**
     * 首页标识，是否成功登录
     * @return
     */
/*    public boolean getIndexflag(){
        AndroidElement element =  waitAutoByXp(LoginPage.INDEX_TEXT);
        return  element != null;

        AndroidElement element = findById(INDEX_ELEMENT);
        return element != null;
    }*/


    /**
     * 获取首页的一个元素，让操作程序等待
     */
/*    public String getIndexElementId(){
        return INDEX_ELEMENT;
    }*/

    /**
     * 获取首页的一个元素，让操作程序等待
     */
/*    public AndroidElement getIndexElement(){
        return findById(INDEX_ELEMENT);
    }*/


    public String getIndexActivity(){
        return INDEX_ACTIVITY_NAME;
    }

}
