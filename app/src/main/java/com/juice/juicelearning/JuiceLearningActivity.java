package com.juice.juicelearning;

import android.provider.SyncStateContract;
import android.view.View;
import android.widget.TextView;

import com.juice.baselib.BaseActivity;
import com.juice.baselib.UIUtils;
import com.juice.juicelearning.java.JavaActivity;

public class JuiceLearningActivity extends BaseActivity implements View.OnClickListener {

    TextView mTvJuiceLearningJava;
    TextView mTvJuiceLearningNdk;
    TextView mTvJuiceLearningFramework;
    TextView mTvJuiceLearningHighLevelUI;
    TextView mTvJuiceLearningOpenFrame;
    TextView mTvJuiceLearningJetpack;
//    TextView mTvJuiceLearningJuiceSecret;

    @Override
    public int setLayout() {
        return R.layout.activity_juice_learning;
    }

    @Override
    protected void initView() {

        mTvJuiceLearningJava = findViewById(R.id.id_juicelearning_java);
        mTvJuiceLearningNdk = findViewById(R.id.id_juicelearning_ndk);
        mTvJuiceLearningFramework = findViewById(R.id.id_juicelearning_framework);
        mTvJuiceLearningHighLevelUI = findViewById(R.id.id_juicelearning_high_level_ui);
        mTvJuiceLearningOpenFrame = findViewById(R.id.id_juicelearning_open_frame);
        mTvJuiceLearningJetpack = findViewById(R.id.id_juicelearning_jetpack);

        mTvJuiceLearningJava.setOnClickListener(this);
        mTvJuiceLearningNdk.setOnClickListener(this);
        mTvJuiceLearningFramework.setOnClickListener(this);
        mTvJuiceLearningHighLevelUI.setOnClickListener(this);
        mTvJuiceLearningOpenFrame.setOnClickListener(this);
        mTvJuiceLearningJetpack.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {

        if (UIUtils.isNotFastClick()) {

            int id = view.getId();
            if (id == R.id.id_juicelearning_java) {

                JavaActivity.openActivity(this, JavaActivity.class);
            } else if (id == R.id.id_juicelearning_ndk) {

            } else if (id == R.id.id_juicelearning_framework) {

            } else if (id == R.id.id_juicelearning_high_level_ui) {

            } else if (id == R.id.id_juicelearning_jetpack) {

            }
        }
    }
}
