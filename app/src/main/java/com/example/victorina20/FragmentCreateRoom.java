package com.example.victorina20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;

public class FragmentCreateRoom extends Fragment implements View.OnClickListener {

    LinearLayout layout;
    Switch switchOfPrivate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_room, container, false);

        

    }

    @Override
    public void onClick(View v) {

    }
}