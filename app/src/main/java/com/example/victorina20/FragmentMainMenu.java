package com.example.victorina20;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.victorina20.databinding.FragmentMainMenuBinding;

public class FragmentMainMenu extends Fragment {
    private FragmentMainMenuBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainMenuBinding.inflate(inflater, container, false);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCreateRoom();
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToRoomList();
            }
        });
        return binding.getRoot();
    }
    private void moveToCreateRoom() {
        Navigation
                .findNavController(binding.getRoot())
                .navigate(R.id.action_fragmentMainMenu_to_fragmentCreateRoom); // Здесь указан id action из nav_graph
    }
    private  void moveToRoomList() {
        Navigation
                .findNavController(binding.getRoot())
                .navigate(R.id.action_fragmentMainMenu_to_fragmentRoomList);
    }
}