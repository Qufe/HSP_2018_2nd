package com.cookieinteractive.simplelistview4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;  // ListView 선언

    MyCar mySportsCar;

    ArrayList<MyCar> myArrayList2;  // 커스텀 리스트 뷰를 위한 데이터 저장소
    MyCar myCar_1;
    MyCar myCar_2;
    MyCar myCar_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        myArrayList2 = new ArrayList<>();
        myCar_1 = new MyCar(10);
        myCar_2 = new MyCar(20);
        myCar_3 = new MyCar(30);

        myArrayList2.add(myCar_1);
        myArrayList2.add(myCar_2);
        myArrayList2.add(myCar_3);

        MyAdapter my_my_Adapter = new MyAdapter(this, myArrayList2);

        listView.setAdapter(my_my_Adapter);

    }
}
