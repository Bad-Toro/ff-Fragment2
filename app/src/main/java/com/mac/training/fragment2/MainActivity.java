package com.mac.training.fragment2;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements commI{
    SecondFragment sFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.myContainer) != null){


            BlankFragment bFF = new BlankFragment();
            sFF = new SecondFragment();


            FragmentManager fM = getSupportFragmentManager();
            FragmentTransaction tR = fM.beginTransaction();
            tR.add(R.id.myContainer, bFF);
            tR.add(R.id.myContainer2, sFF);
            //tR.addToBackStack(null);
            tR.commit();

//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.myContainer, bFF)
//                    .commit();

        }

    }

    @Override
    public void sendValue(String val) {
        sFF.setTheValue(val);
    }
}
