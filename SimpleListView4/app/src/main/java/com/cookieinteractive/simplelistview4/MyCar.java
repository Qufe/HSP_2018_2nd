package com.cookieinteractive.simplelistview4;

import android.util.Log;

public class MyCar {  // 클래스
    int speed;
    int engine;
    String maker;

    MyCar(int speed_B) {  // 메서드
        speed = speed_B;
    }

    void speedUp() {  // 메서드
        speed = speed + 1;
        speed += 1;
        Log.d("my_tag", "Speed Up! Speed = " + speed);
    }

    void speedDown() {
        speed = speed - 1;
        speed -= 1;
        Log.d("my_tag", "Speed Down! Speed = " + speed);
    }
}
