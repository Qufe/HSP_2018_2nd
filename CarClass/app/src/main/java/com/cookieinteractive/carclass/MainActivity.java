package com.cookieinteractive.carclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyCar mySportsCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySportsCar = new MyCar(10);
//        mySportsCar.speed_A = 10;
        mySportsCar.speedUp();
        mySportsCar.speedDown();
    }
}
