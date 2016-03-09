package com.example.xyzreader.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by iluz on 3/8/16.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
