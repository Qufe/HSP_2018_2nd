package com.cookieinteractive.simplelistview4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;  // ListView 선언

    ArrayList<MyCar> myArrayList2;  // 커스텀 리스트 뷰를 위한 데이터 저장소
    MyCar myCar_1;  // 세부 데이터 - 서랍 한 칸에 해당.
    MyCar myCar_2;
    MyCar myCar_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);  // 객체 연결.

        myArrayList2 = new ArrayList<>();  // ArrayList 객체 생성.
        myCar_1 = new MyCar(10, "AAA");  // myCar 객체 생성 + 내부 데이터 지정. (스피드, 메이커)
        myCar_2 = new MyCar(20, "BBB");
        myCar_3 = new MyCar(30, "CCC");

        myArrayList2.add(myCar_1);  // 데이터 저장소에 세부 데이터(서랍 1칸씩) 추가.
        myArrayList2.add(myCar_2);  // 두 번째 서랍도 추가.
        myArrayList2.add(myCar_3);  // 세 번째도.

        // 종류가 MyAdapter 이고, 변수명이 my_my_Adapter 인 커스텀 어댑터를,
        // this(MainActivity)와 myArrayList2를 재료로 사용하여 만든다.
        MyAdapter my_my_Adapter = new MyAdapter(this, myArrayList2);

        listView.setAdapter(my_my_Adapter);  // 리스트뷰에 어댑터 연결(할당).
    }
}
