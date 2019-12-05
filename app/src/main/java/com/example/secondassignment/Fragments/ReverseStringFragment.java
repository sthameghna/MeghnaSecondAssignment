package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.Class.ReverseString;
import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseStringFragment extends Fragment implements View.OnClickListener{

    EditText etText;
    Button btnReversetext;
    TextView tvresult;

    private String reversestring="";

    public ReverseStringFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_string, container, false);

        etText= view.findViewById(R.id.etText);
        btnReversetext= view.findViewById(R.id.btnReversetext);
        tvresult= view.findViewById(R.id.tvresult);

        btnReversetext.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etText.getText()))
        {
            etText.setError("Enter any alphabets");
            return;
        }
        else {
            String revStr, result;

            revStr = etText.getText().toString();

            //calling the function from another class

            result = ReverseString.reverseString(revStr);

            tvresult.setText(" The reverse value is"+ result );


        }
        }
}
