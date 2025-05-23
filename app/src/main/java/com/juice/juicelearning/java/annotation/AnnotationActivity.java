package com.juice.juicelearning.java.annotation;

import com.juice.baselib.BaseActivity;
import com.juice.javalib.annotation.Juice;
import com.juice.juicelearning.R;

/**
 * @author juice
 * @date 2025年5月22日 13:28:58
 * @desc 注解
 */
@Juice(value = 1,id = "2")
public class AnnotationActivity extends BaseActivity {

    @Override
    public int setLayout() {
        return R.layout.activity_annotation;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
