package com.xwray.passwordviewsample;

import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xwray.passwordview.PasswordView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PasswordView passwordView = (PasswordView) findViewById(R.id.password);
        TextInputLayout passwordViewTIL = (TextInputLayout) findViewById(R.id.password_til);

        PasswordView passwordViewWithStrikeThrough = (PasswordView) findViewById(R.id.password_strike);
        TextInputLayout passwordViewWithStrikeThroughTIL = (TextInputLayout) findViewById(R.id.password_strike_til);

        Typeface roboto = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
        passwordView.setTypeface(roboto);
        passwordViewTIL.setTypeface(roboto);
        passwordViewWithStrikeThrough.setTypeface(roboto);
        passwordViewWithStrikeThroughTIL.setTypeface(roboto);
    }
}
