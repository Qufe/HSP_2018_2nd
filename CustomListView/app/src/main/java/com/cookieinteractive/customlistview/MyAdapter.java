package com.cookieinteractive.customlistview;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends BaseAdapter {

    Activity activity;
    ArrayList<MyObject> myObjectArrayList;

    MyAdapter(Activity activity_A, ArrayList<MyObject> objectArrayList) {
        this.activity = activity_A;
        this.myObjectArrayList = objectArrayList;
    }

    @Override
    public int getCount() {
        return this.myObjectArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.myObjectArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view_item = layoutInflater.inflate(R.layout.listview_item, null);

        ImageView imageView;
        TextView textView;
        TextView textView1;

        imageView = view_item.findViewById(R.id.myCustomListView_item_ImageView);
        textView = view_item.findViewById(R.id.myCustomListView_item_TextView1);
        textView1 = view_item.findViewById(R.id.myCustomListView_item_TextView2);

        imageView.setImageResource(myObjectArrayList.get(position).fileID_A);
        textView.setText(myObjectArrayList.get(position).movieName_A);
        textView1.setText("" + myObjectArrayList.get(position).fileID_A);

        return view_item;
    }
}
