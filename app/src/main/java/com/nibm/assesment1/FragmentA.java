package com.nibm.assesment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment {

    public FragmentA() {
        // Required empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        // Find button inside view
        Button btnMove = view.findViewById(R.id.btnMove);

        // Click event
        btnMove.setOnClickListener(v -> {

            FragmentB fragmentB = new FragmentB();

            FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
            transaction.replace(R.id.act3, fragmentB);
            transaction.addToBackStack(null); // enables back navigation
            transaction.commit();
        });

        return view;
    }
}