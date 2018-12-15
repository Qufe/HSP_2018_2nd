package com.cookieinteractive.simplelistview4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;  // ListView 선언

    MyCar mySportsCar;

    ArrayList<HashMap<String, String>> myArrayList;
    HashMap<String, String> hashMap_1;
    HashMap<String, String> hashMap_2;

    ArrayList<MyCar> myArrayList2;  // 커스텀 리스트 뷰를 위한 데이터 저장소
    MyCar myCar_1;
    MyCar myCar_2;
    MyCar myCar_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySportsCar = new MyCar(20);
        mySportsCar.speedUp();
        mySportsCar.speedDown();

        listView = findViewById(R.id.list_view);

        myArrayList = new ArrayList<>();
        hashMap_1 = new HashMap<>();
        hashMap_2 = new HashMap<>();

        hashMap_1.put("school", "MK");
        hashMap_1.put("name", "NHS");

        hashMap_2.put("school", "Free");
        hashMap_2.put("name", "KHS");

        myArrayList.add(hashMap_1);
        myArrayList.add(hashMap_2);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, myArrayList,
                android.R.layout.simple_list_item_2, new String[]{"school", "name"},
                new int[]{android.R.id.text1, android.R.id.text2});

        listView.setAdapter(simpleAdapter);
    }
}
