package com.handy.widget.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.handy.widget.app.dialog.DialogActivity;
import com.handy.widget.app.material.demo.MaterialActivity;
import com.handy.widget.app.picker.PickerActivity;
import com.handy.widget.app.spinner.SpinnerActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by LiuJie on 2017/5/23.
 */

public class DemoActivity extends AppCompatActivity {
    @BindView(R.id.Dialog)
    Button Dialog;
    @BindView(R.id.Picker)
    Button Picker;
    @BindView(R.id.Spinner)
    Button Spinner;
    @BindView(R.id.Material)
    Button Material;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Dialog, R.id.Picker, R.id.Spinner, R.id.Material})
    public void onViewClicked(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.Dialog:
                intent.setClass(DemoActivity.this, DialogActivity.class);
                break;
            case R.id.Picker:
                intent.setClass(DemoActivity.this, PickerActivity.class);
                break;
            case R.id.Spinner:
                intent.setClass(DemoActivity.this, SpinnerActivity.class);
                break;
            case R.id.Material:
                intent.setClass(DemoActivity.this, MaterialActivity.class);
                break;
        }
        startActivity(intent);
    }
}
