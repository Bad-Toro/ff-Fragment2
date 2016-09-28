package com.mac.training.fragment2;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.myContainer) != null){


            BlankFragment bFF = new BlankFragment();

            FragmentManager fM = getSupportFragmentManager();
            FragmentTransaction tR = fM.beginTransaction();
            tR.add(R.id.myContainer, bFF);
            //tR.addToBackStack(null);
            tR.commit();

//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.myContainer, bFF)
//                    .commit();

        }

    }
}
