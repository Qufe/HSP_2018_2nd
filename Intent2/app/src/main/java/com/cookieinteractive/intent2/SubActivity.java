package com.cookieinteractive.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intentFromMainActivity;  // Intent 선언.
    Toast toastForIntentMessage;  // Toast 선언.
    Button buttonRevealIntentMessage;  // Button 선언.
    String messageBox;  // String 변수 선언.
    int counterButtonClicked;  // 버튼을 몇 번째 클릭하는지 카운트 할 변수.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        // 인텐트 관련 처리.
        intentFromMainActivity = getIntent();  // SubActivity class 의 intent 를 얻어와서 왼쪽에 할당한다.
        messageBox = intentFromMainActivity.getStringExtra("Put Extra Message");

        // 버튼 관련 처리.
        buttonRevealIntentMessage = findViewById(R.id.buttonShowMessageIntent);
        buttonRevealIntentMessage.setOnClickListener(this);

        counterButtonClicked = 0;  // 변수 초기화.

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonShowMessageIntent) {  // 사용자가 입력한 버튼 확인.
            if (toastForIntentMessage != null) {  // 기존 토스트 메시지가 화면에 표시되고 있다면,
                toastForIntentMessage.cancel();  // 취소해서 지운다.
            }
            counterButtonClicked += 1;  // 버튼 클릭 횟수 1 증가.
            toastForIntentMessage = Toast.makeText(getApplicationContext(), messageBox + counterButtonClicked, Toast.LENGTH_LONG);  // 새로운 토스트 메시지를 만들고,
            toastForIntentMessage.show();  // 화면에 표시한다.
        }
    }
}
