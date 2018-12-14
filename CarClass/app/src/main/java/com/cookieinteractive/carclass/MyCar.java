package com.cookieinteractive.carclass;

import android.util.Log;

public class MyCar {
    int seat_A;
    int engine_A;
    int speed_A;
    String maker_A;

    MyCar(int speed_B) {
        speed_A = speed_B;
    }

    void speedUp() {
        speed_A = speed_A +1;
        Log.d("my_tag_car", "Speed Up!! 현재 속도는 " + speed_A + "Km/h 입니다.");
    }

    void speedDown() {
        speed_A -= 1;
        Log.d("my_tag_car", "Speed Down!! 현재 속도는 " + speed_A + "Km/h 입니다.");
    }
}
