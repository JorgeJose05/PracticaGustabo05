package com.example.practica05_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Onboarding2Fragment extends Fragment {

    Button bontonfin;
    NavController navControler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding2, container, false);
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navControler = Navigation.findNavController(view);

        bontonfin = view.findViewById(R.id.botonFinalizar);

        bontonfin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navControler.navigate(R.id.action_onboarding2Fragment_to_homeFragment);
            }
        });



    }



}