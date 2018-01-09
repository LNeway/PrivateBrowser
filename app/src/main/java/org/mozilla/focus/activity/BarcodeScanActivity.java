package org.mozilla.focus.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import org.mozilla.focus.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by liuwei64 on 2018/1/9.
 */

public class BarcodeScanActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.backImg, R.id.galleryImg})
    public void onClickView(View view) {
        switch (view.getId()) {
            case R.id.backImg:
                finish();
                break;
            case R.id.galleryImg:

                break;
            default:
        }
    }
}
