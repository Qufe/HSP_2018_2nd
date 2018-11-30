package com.cookieinteractive.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;

    Button buttonStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStartActivity = findViewById(R.id.button);

        buttonStartActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);
    }
}
