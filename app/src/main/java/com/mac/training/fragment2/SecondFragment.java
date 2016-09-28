package com.mac.training.fragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    TextView mST;


    public SecondFragment() {
        // Required empty public constructor
    }

    public void setTheValue(String val){
        mST.setText(val);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second, container, false);

        mST = (TextView) v.findViewById(R.id.ScdLbl);

        return v;
    }

}
