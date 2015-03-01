package com.androidpractice.fonticons;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

    TextView tvCamera,tvPlay,tvHeadPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvHeadPhone = (TextView) findViewById(R.id.tv_headPhone);
        tvCamera = (TextView) findViewById(R.id.tv_camera);
        tvPlay   = (TextView) findViewById(R.id.tv_play);


        FontUtils.applyIconmoonFont(this,tvHeadPhone);
        FontUtils.applyIconmoonFont(this,tvCamera);
        FontUtils.applyIconmoonFont(this,tvPlay);


        //Setting value with java
        tvHeadPhone.setText((getString(R.string.icon_headphone)));
        //OR
        // tvHeadPhone.setText(Html.fromHtml(getString(R.string.icon_headphone)));
    }

}
