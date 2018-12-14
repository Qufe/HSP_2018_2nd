package com.cookieinteractive.simplelistview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView myListView;  // ListView 선언.

    ArrayList<HashMap<String, String>> myArrayList;  // ArrayList 선언.
    HashMap<String, String> hashMap_1;  // HashMap 선언.
    HashMap<String, String> hashMap_2;
    HashMap<String, String> hashMap_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = findViewById(R.id.my_list_view);  // ListView 연결.

        myArrayList = new ArrayList<>();  // 객체 생성
        hashMap_1 = new HashMap<>();
        hashMap_2 = new HashMap<>();
        hashMap_3 = new HashMap<>();

        hashMap_1.put("school", "자유");
        hashMap_1.put("name", "HS");
        myArrayList.add(hashMap_1);

        hashMap_2.put("school", "MK");
        hashMap_2.put("name", "TM");
        myArrayList.add(hashMap_2);

        hashMap_3.put("school", "MK");
        hashMap_3.put("name", "GB");
        myArrayList.add(hashMap_3);

        SimpleAdapter mySimpleAdapter = new SimpleAdapter(this, myArrayList,
                android.R.layout.simple_list_item_2, new String[]{"school", "name"},
                new int[]{android.R.id.text1, android.R.id.text2});

        myListView.setAdapter(mySimpleAdapter);
    }
}
