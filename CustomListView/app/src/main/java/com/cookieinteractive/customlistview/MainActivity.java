package com.cookieinteractive.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView myListView;  // 리스트뷰 선언.
    ArrayList<MyObject> myArrayList;  // 데이터를 담을 ArrayList 선언
    MyAdapter myCustomAdapter;  // Custom ListView 에 사용할 Custom Adapter 선언.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = findViewById(R.id.my_list_view);  // Layout 객체 연결.

        myArrayList = new ArrayList<>();  // ArrayList 객체 생성

        // drawable 폴더의 파일들의 리스트를 얻어온다.
        Field[] drawableFilesList = R.drawable.class.getFields();  // res/drawable 에 있는 요소들에 대한 정보를 얻어온다.
        for (Field aDrawableFile : drawableFilesList) {  // 얻어 온 요소들에대해 하나씩 순환하면서 실행한다.
            try {
                if (aDrawableFile.getName().contains("abc_")) {  // 시스템 파일의 머릿말과 일치하는 파일이 검색되면 패스.
                    Log.d("my_tag", "Avoid this file: " + aDrawableFile.getName());
                } else if (aDrawableFile.getName().contains("ic_")) {  // 시스템 파일의 머릿말과 일치하는 파일이 검색되면 패스.
                    Log.d("my_tag", "Avoid this file: " + aDrawableFile.getName());
                } else if (aDrawableFile.getName().contains("notification_")) {  // 시스템 파일의 머릿말과 일치하는 파일이 검색되면 패스.
                    Log.d("my_tag", "Avoid this file: " + aDrawableFile.getName());
                } else {  // 위의 2 경우에 걸리지 않았다면 사용자가 추가한 파일.
                    MyObject myObject = new MyObject(aDrawableFile.getName(), aDrawableFile.getInt(null));
                    // 한 요소에서 파일 이름을 얻어오고(getName), 파일 ID를 얻어와서(getInt), 그 데이터를 이용해서 MyObject 형식의 myObject 를 생성하고,
                    myArrayList.add(myObject);  // myArrayList 에 담는다.
                }
            } catch (IllegalAccessException e) {  // 에러처리구문.
                Log.d("my_tag", "IllegalAccessException Error");
            }
        }

        myCustomAdapter = new MyAdapter(this, myArrayList);  // 어댑터를 만들고,

        myListView.setAdapter(myCustomAdapter);  // 리스트뷰에 지정해준다.
    }
}
