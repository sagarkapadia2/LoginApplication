package com.sagar.loginapplication;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by SaGaR on 14-07-2017.
 */

public class SecondActivity extends Activity {
    TextView displayMsg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.google_layout);

        displayMsg= (TextView) findViewById(R.id.displayMsgTextView);

        Bundle extras=getIntent().getExtras();
        displayMsg.setText("Welcome :" +extras.get("user"));
    }
}
