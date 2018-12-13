package com.cookieinteractive.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView mySimpleListView;  // 리스트뷰 선언.
    SimpleAdapter mySimpleAdapter;  // 리스트뷰에 사용할 심플어댑터 선언.

    ArrayList<HashMap<String, String>> myListArray;  // 리스트 어레이 선언.
    HashMap<String, String> myHashMap1;  // 해쉬맵 선언.
    HashMap<String, String> myHashMap2;
    HashMap<String, String> myHashMap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySimpleListView = findViewById(R.id.list_view);

        myListArray = new ArrayList();  // ArrayList 생성
        myHashMap1 = new HashMap<>();  // HashMap 생성
        myHashMap2 = new HashMap<>();
        myHashMap3 = new HashMap<>();

        myHashMap1.put("school", "Happy");
        myHashMap1.put("name", "JY");
        myListArray.add(myHashMap1);

        myHashMap2.put("school", "Good");
        myHashMap2.put("name", "HS");
        myListArray.add(myHashMap2);

        myHashMap3.put("school", "Great");
        myHashMap3.put("name", "HS");
        myListArray.add(myHashMap3);

        mySimpleAdapter = new SimpleAdapter(this, myListArray,
                android.R.layout.simple_list_item_2,
                new String[]{"school", "name"},
                new int[]{android.R.id.text1, android.R.id.text2});

        mySimpleListView.setAdapter(mySimpleAdapter);

    }
}
