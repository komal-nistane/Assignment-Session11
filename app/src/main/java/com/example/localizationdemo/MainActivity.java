package com.example.localizationdemo;

import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Locale primaryLocale = getApplicationContext().getResources().getConfiguration().getLocales().get(0);
        String locale = primaryLocale.getDisplayName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
