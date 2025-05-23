package com.juice.juicelearning.java.annotation;

import androidx.annotation.DrawableRes;
import androidx.annotation.IntDef;

import com.juice.juicelearning.R;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author juice
 * @date 2025年5月22日 19:06:08
 * @desc 语法检查
 */
public class JuiceIntDef {

    private static WeekDay mCurrentDay;
    private static int mCurrentIntDay;

    enum WeekDay {
        SUNDAY, MONDAY
    }

    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;

    @IntDef({SUNDAY, MONDAY})
    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @interface WekDay {//注解

    }

    public static void setCurrentDay(WeekDay currentDay) {
        mCurrentDay = currentDay;
    }

    public static void setCurrentIntDay(@WekDay int currentDay) {
        mCurrentIntDay = currentDay;
    }

    public static void setDrawable(@DrawableRes int id) {

    }

    public static void main(String[] args) {

        setDrawable(R.drawable.ic_launcher);
        setCurrentDay(WeekDay.MONDAY);
        setCurrentIntDay(MONDAY);
//        setCurrentIntDay(222);//Must be one of: JuiceIntDef.SUNDAY, JuiceIntDef.MONDAY
    }
}
