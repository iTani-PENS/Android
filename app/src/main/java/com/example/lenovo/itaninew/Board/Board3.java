package com.example.lenovo.itaninew.Board;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.itaninew.SignUp.SignUp;
import com.example.lenovo.itaninew.R;


public class Board3 extends Fragment {

    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_board3, container, false);
        TextView button = (TextView) view.findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getstart();
            }
        });

        return view;
    }

    public void getstart() {
        Intent intent = new Intent(getActivity(), SignUp.class);
        startActivity(intent);
    }

}
