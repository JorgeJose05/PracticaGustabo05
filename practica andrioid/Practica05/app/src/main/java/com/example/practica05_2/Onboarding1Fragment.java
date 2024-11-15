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


public class Onboarding1Fragment extends Fragment {

    Button botonSigiente;
    NavController navControler;

 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navControler = Navigation.findNavController(view);

        botonSigiente = view.findViewById(R.id.botonSiguiente);

        botonSigiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            navControler.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment);
            }
        });



    }



}