package com.cookieinteractive.simplelistview4;

// 메뉴 표시줄의 Code >> Implement Methods (단축키 컨트롤 + i) 로 필수 메서드들을 자동생성할 수 있다.

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Activity activity_a;  // 액티비티 선언 - 외부에서 재료로 전달받은 액티비티를 내부에서 사용하려는 목적.

    ArrayList<MyCar> myArrayList_a;  // 마찬가지로 외부에서 재료로 전달받은 데이터를 내부에서 사용하려는 목적.

    MyAdapter(Activity activity_b, ArrayList<MyCar> arrayList_b) {
        activity_a = activity_b;  // 외부에서 받은 액티비티(activity_b)를 내부의 액티비티 변수(activity_a)로 연결.
        myArrayList_a = arrayList_b;  // 외부에서 전달받은 데이터 저장소(arrayList_b)를 내부 데이터 저장소 변수(myArrayList_a)로 복사(연결).
    }

    @Override
    public int getCount() {
        return myArrayList_a.size();  // 리스트에 표시해야 할 데이터가 몇개인지 리턴.
    }

    @Override
    public Object getItem(int position) {
        // ArrayList 안에 서랍 - 안의 내용
        return myArrayList_a.get(position);  // position 에 해당하는 데이터를 러턴.
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = activity_a.getLayoutInflater();  // 어댑터가 생성될 때 받은 액티비티로 레이아웃 인플레이터를 만든다.
        View view_item = layoutInflater.inflate(R.layout.listview_item, null);  // 방금 생성한 레이아웃 인플레이터로 listview_item.xml 를 만들어서 view_item 에 할당.

        TextView textView1 = view_item.findViewById(R.id.textView1);  // 예전에 MainActivity.java 에서 버튼을 연결해줬던 것 처럼 여기서도 listview_item.xml 의 텍스트뷰를
        TextView textView2 = view_item.findViewById(R.id.textView2);  // 가져와서 연결해준다.

        textView1.setText("" + myArrayList_a.get(position).speed);  // 텍스트뷰의 내용을 알맞게 설정한다. (각 셀에 맞게)
        textView2.setText(myArrayList_a.get(position).maker);

        return view_item;  // 다되었으면 리턴해준다.
    }
}
