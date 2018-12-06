package com.cookieinteractive.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SubActivity extends AppCompatActivity {

    Intent intentFromMainActivity;  // Intent 선언.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        intentFromMainActivity = getIntent();  // SubActivity class 의 intent 를 얻어와서 왼쪽에 할당한다.
        String messageBox = intentFromMainActivity.getStringExtra("Put Extra Message");

        Log.d("my_tag", "Message from MainActivity = " + messageBox);
    }
}
