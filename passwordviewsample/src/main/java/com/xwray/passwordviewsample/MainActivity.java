package com.xwray.passwordviewsample;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout passwordView = (TextInputLayout) findViewById(R.id.password);
        TextInputLayout passwordViewWithStrikeThrough = (TextInputLayout) findViewById(R.id.password_strike);

        Typeface roboto = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
        passwordView.setTypeface(roboto);
        passwordViewWithStrikeThrough.setTypeface(roboto);
    }
}
