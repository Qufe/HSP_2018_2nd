package com.cookieinteractive.carclass;

import android.util.Log;

public class MyCar {
    int seat;
    int engine;
    int speed;
    String maker;

    void speedUp() {
        speed = speed +1;
        Log.d("my_tag_car", "Speed Up!! 현재 속도는 " + speed + "Km/h 입니다.");
    }

    void speedDown() {
        speed -= 1;
        Log.d("my_tag_car", "Speed Down!! 현재 속도는 " + speed + "Km/h 입니다.");
    }
}
