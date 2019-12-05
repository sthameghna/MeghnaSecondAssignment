package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.Class.Automorphic;
import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment implements View.OnClickListener {

Button btnCalculate;
EditText etnumber;
TextView tvresult;

    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);

        etnumber= view.findViewById(R.id.etnumber);
        btnCalculate= view.findViewById(R.id.btnCalculate);
        tvresult= view.findViewById(R.id.tvresult);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int automorphicNumber = Integer.parseInt(String.valueOf(etnumber.getText()));
        boolean isAutomorphic = Automorphic.isAutomorphic(automorphicNumber);

        if(isAutomorphic)
        {
            tvresult.setText(etnumber.getText()+" is automorphic number");
        }
        else{
            tvresult.setText(etnumber.getText()+" is not automorphic number");
        }
    }
}
