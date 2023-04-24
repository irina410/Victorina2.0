package com.example.victorina20;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.example.victorina20.databinding.FragmentCreateRoomBinding;
import com.example.victorina20.databinding.FragmentMainMenuBinding;

public class FragmentCreateRoom extends Fragment implements View.OnClickListener {
    LinearLayout layout;
    Switch switchOfPrivate;
    private FragmentCreateRoomBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCreateRoomBinding.inflate(inflater, container, false);

        return inflater.inflate(R.layout.fragment_create_room, container, false);

        

    }

    @Override
    public void onClick(View v) {

    }
}