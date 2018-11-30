package com.cookieinteractive.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonToastToast;  // 버튼 선언.
    Button buttonToastCancel;  // 버튼 선언.

    Toast toastMessage;  // 토스트 객체 선언.

    int counterVariable;  // 토스트 버튼을 몇 번 눌렀는지 세어보자!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToastToast = findViewById(R.id.button_toast_toast);  // xml 객체 할당.
        buttonToastCancel = findViewById(R.id.button_toast_cancel);

        buttonToastToast.setOnClickListener(this);  // 온 클릭 리스너 셋팅.
        buttonToastCancel.setOnClickListener(this);

        counterVariable = 0;  // 카운터 변수 초기화.
    }

    @Override
    public void onClick(View v) {
        // Cancel 기능이 없는 토스트 메시지
        if (v.getId() == R.id.button_toast_toast) {
            toastMessage = Toast.makeText(getApplicationContext(), "This is Toast!! - " + counterVariable, Toast.LENGTH_LONG);
            toastMessage.show();
            counterVariable += 1;  // 예전에 speedUp 메서드에서 speed = speed +1; 과 같은 문법 (줄여쓰기)
        }

        // Cancel 기능이 있는 토스트 메시지 = 이전 토스트가 화면에 떠있으면 취소해서 없애고, 다음 토스트를 띄워서 보여준다.
        if (v.getId() == R.id.button_toast_cancel) {
            // 아래 문장이 Cancel 기능 수행.
            if (toastMessage != null) {
                toastMessage.cancel();
            }
            toastMessage = Toast.makeText(getApplicationContext(), "This is Toast!! - " + counterVariable, Toast.LENGTH_LONG);
            toastMessage.show();
            counterVariable += 1;
        }
    }
}
