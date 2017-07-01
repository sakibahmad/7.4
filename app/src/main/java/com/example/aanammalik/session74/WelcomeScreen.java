package com.example.aanammalik.session74;

/**
 * Created by Aanam Malik on 7/1/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;




public class WelcomeScreen extends AppCompatActivity{

    TextView welcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        welcomeMsg = (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            welcomeMsg.setTextSize(50.00f);
            welcomeMsg.setText("Welcome"+System.getProperty("line.separator")+"to " + System.getProperty("line.separator")+ bundle.getString(MainActivity.BUNDLE_KEY_NAME));
            ;
        }
    }
}