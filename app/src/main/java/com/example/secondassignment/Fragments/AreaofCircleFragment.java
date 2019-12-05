package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaofCircleFragment extends Fragment implements View.OnClickListener{
EditText etRadius;
Button btnCalculate;
TextView tvresult;

    public AreaofCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_areaof_circle, container, false);

        etRadius= view.findViewById(R.id.etRadius);
        btnCalculate= view.findViewById(R.id.btnCalculate);
        tvresult= view.findViewById(R.id.tvresult);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius= Float.parseFloat(etRadius.getText().toString());
        float result = 3.14f * radius*radius;
        tvresult.setText("Area of Circle is" + Float.toString(result));
    }
}
