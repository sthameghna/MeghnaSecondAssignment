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

import com.example.secondassignment.Class.ReverseNumber;
import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseNumFragment extends Fragment implements View.OnClickListener{
    EditText etNum;
    Button btnReversenum;
    TextView tvresult;
    private int reversenum;

    public ReverseNumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_num, container, false);

        etNum= view.findViewById(R.id.etNum);
        btnReversenum= view.findViewById(R.id.btnReversenum);
        tvresult= view.findViewById(R.id.tvresult);

        btnReversenum.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etNum.getText()))
        {
            etNum.setError("Enter number");
            return;
        }
        else{
            int reverseNum, result;

            reverseNum = Integer.parseInt(etNum.getText().toString());

            //calling the function from another class

            result = ReverseNumber.reverseNumber(reverseNum);

            tvresult.setText(" The reverse number is"+result);
        }
    }
}
