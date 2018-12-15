package com.cookieinteractive.simplelistview4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {  // 이 어댑터는 누가 사용? = 커스텀 리스트뷰
    // 아까까지는 안드로이드에서 미리 만들어 둔 Simple List View 사용
    // 저걸 사용하면서 Simple List Adapter 를 사용했다.
    // 그 Simple List Adapter 도 안드로이드에서 미리 만들어 둔 것.

    // 지금 만들고 있는 MyAdapter 는 커스텀 리스트뷰에서 사용할 어댑터이고,
    // 내가 직업 만들어야 함.

    // 이걸 누가 쓰냐? = 커스텀 리스트 뷰가 사용
    // 그럼 이건 뭐냐? 리스트뷰 어댑터

    Activity activity;  // 액티비티 선언.

    ArrayList<MyCar> myArrayList;  // 여기 안에 있는 내용을 리스트뷰에 표현.

    MyAdapter(Activity activity_B, ArrayList arrayList_B){
        activity = activity_B;
        myArrayList = arrayList_B;
    }

    @Override
    public int getCount() {  // 겟(얻어와라, 가져와라) 카운드 = 데이터가 몇개나 들었는가?
        return myArrayList.size();
    }

    @Override
    public Object getItem(int position) {  // 아이템을 얻어와라.
        // ArrayList 안에 서랍 - 안의 내용
        return myArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view_item = layoutInflater.inflate(R.layout.listview_item, null);

        TextView textView1 = view_item.findViewById(R.id.textView1);
        TextView textView2 = view_item.findViewById(R.id.textView2);

        textView1.setText("" + myArrayList.get(position).speed);
        textView2.setText(myArrayList.get(position).maker);

        return view_item;
    }
}
