package com.alejandro.fragments;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Onboarding1Fragment} factory method to
 * create an instance of this fragment.
 */
public class Onboarding1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters


    private String mParam1;
    private String mParam2;

    private Button botonSiguiente;

    private Button botonSkip;

    private NavController navController;
    public Onboarding1Fragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonSiguiente = view.findViewById(R.id.botonSiguiente);

        botonSiguiente.setOnClickListener(view1 ->
                navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment));

        botonSkip = view.findViewById(R.id.botonSkip);

        botonSkip.setOnClickListener(view1 ->
                navController.navigate(R.id.action_onboarding1Fragment_to_homeFragment));
    }
}