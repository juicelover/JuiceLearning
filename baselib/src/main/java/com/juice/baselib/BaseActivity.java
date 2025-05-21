package com.juice.baselib;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

public abstract class BaseActivity extends ComponentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initView();
        initData();
    }

    public abstract int setLayout();

    protected abstract void initView();

    protected abstract void initData();

    public static void openActivity(Context context,Class<?> cls){

        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }
}
