package com.cookieinteractive.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStartNewActivity;  // 버튼 선언.
    Intent intentSubActivity;  // 인텐트 선언.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStartNewActivity = findViewById(R.id.buttonStartSubActivity);  // 객체 연결
        buttonStartNewActivity.setOnClickListener(this);  // OnClick 리스너 셋팅

        intentSubActivity = new Intent(getApplicationContext(), SubActivity.class);  // 앱이 시작될 때 서브액티비티를 위한 인텐트를 생성.

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonStartSubActivity) {  // 사용자가 누른 버튼의 ID가 buttonStartSubActivity 라면,
            startActivity(intentSubActivity);  // 버튼을 누르면 onCreate 에서 만들어둔 인텐트 시작.
        }
    }
}
