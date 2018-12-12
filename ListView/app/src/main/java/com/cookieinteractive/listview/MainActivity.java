package com.cookieinteractive.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
//public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<HashMap<String, String>> simpleListData;  // ArrayList 선언.
    HashMap<String, String > firstHashMapData;  // HashMap 선언.
    HashMap<String, String > secondHashMapData;
    HashMap<String, String > thirdHashMapData;

    ListView myListView;  // 리스트뷰 선언.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = findViewById(R.id.list_view);

        simpleListData = new ArrayList<>();
        firstHashMapData = new HashMap<>();
        secondHashMapData = new HashMap<>();
        thirdHashMapData = new HashMap<>();

        firstHashMapData.put("school", "마공");  // HashMap 에 내용 추가.
        firstHashMapData.put("name", "식");

        secondHashMapData.put("school", "마공");
        secondHashMapData.put("name", "민");

        thirdHashMapData.put("school", "자유");
        thirdHashMapData.put("name", "수");

        simpleListData.add(firstHashMapData);  // 내용 추가가 완료 된 HashMap 을 ArrayList 에 담는다.
        simpleListData.add(secondHashMapData);
        simpleListData.add(thirdHashMapData);

        // ListView 를 구동할 어댑터 구성.
        SimpleAdapter my_SimpleAdapter = new SimpleAdapter(this, simpleListData, android.R.layout.simple_list_item_2,
                new String[]{"school", "name"}, new int[]{android.R.id.text1, android.R.id.text2});

        myListView.setAdapter(my_SimpleAdapter);
//        myListView.setOnItemClickListener(this);

    }

//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//    }

}


