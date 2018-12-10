package com.accenture.androidshowcase.ui.act_bottombar;

import android.os.Bundle;

import com.accenture.androidshowcase.R;
import com.accenture.androidshowcase.databinding.ActivityBottombarBinding;
import com.accenture.androidshowcase.ui.base.BaseActivity;

import javax.inject.Inject;

import androidx.annotation.Nullable;

public class BottomBarActivity extends BaseActivity<ActivityBottombarBinding> {

    @Inject
    IBottomBarNav fragNavController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragNavController.init(savedInstanceState, getBinding().bottombar);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        fragNavController.clear();
    }

    @Override
    public int layoutRes() {
        return R.layout.activity_bottombar;
    }

    @Override
    public boolean doubleClickToExitEnabled() {
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        fragNavController.onSaveInstanceState(outState);
    }

    @Override
    public void onBackPressed() {
        if (!fragNavController.onBackPressed()) {
            super.onBackPressed();
        }
    }
}