package com.nibm.assesment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentB extends Fragment {

    public FragmentB() {
        // Required empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b, container, false);

        Button btnBack = view.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {

            FragmentA fragmentA = new FragmentA();

            FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
            transaction.replace(R.id.act3, fragmentA);
            transaction.addToBackStack(null);
            transaction.commit();
        });

        return view;
    }
}