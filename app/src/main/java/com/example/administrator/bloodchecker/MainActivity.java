package com.example.administrator.bloodchecker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonLogIn(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivityTab.class);
        startActivity(intent);
    }

    public void onButtonCancel(View v)
    {
        finish();
    }
}
