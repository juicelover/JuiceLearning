package com.juice.baselib;

public class UIUtils {

    public static long lastClickTime = 0;

    /**
     * 判断是否连点
     * @return true：非连点  false：连点
     */
    public static boolean isNotFastClick(){

        long currentTime = System.currentTimeMillis();
        if (currentTime - lastClickTime > JuiceConstants.DELAY){

            lastClickTime = currentTime;
            return true;
        }else {

            return false;
        }
    }
}
