//package com.example.victorina20;
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.LinearLayout;
//import android.widget.Switch;
//
//import com.example.victorina20.databinding.FragmentCreateRoomBinding;
//import com.example.victorina20.databinding.FragmentMainMenuBinding;
//
//public class FragmentCreateRoom extends Fragment implements View.OnClickListener {
//    LinearLayout layout;
//    Switch switchOfPrivate;
//    private FragmentCreateRoomBinding binding;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        binding = FragmentCreateRoomBinding.inflate(inflater, container, false);
//
//
//    binding.buttonCreateRoom.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent intent = new Intent(getActivity(),Room.class);
//            startActivity(intent);
//        }
//    });
//    return binding.getRoot();
//
//    }
//
//    @Override
//    public void onClick(View v) {
//
//    }
//}