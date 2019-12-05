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

import com.example.secondassignment.Class.palindromeORnot;
import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromORnotFragment extends Fragment implements View.OnClickListener {

    EditText etNumber;
    Button btncheck;
    TextView tvresult;

    public PalindromORnotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrom_ornot, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        btncheck = view.findViewById(R.id.btncheck);
        tvresult = view.findViewById(R.id.tvresult);

        btncheck.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int palindromeNumber = Integer.parseInt(String.valueOf(etNumber.getText()));
        boolean isPalindrome = palindromeORnot.isPalindrome(palindromeNumber);

        if (isPalindrome) {
            tvresult.setText(etNumber.getText() + "is a palindrome number");
        } else {
            tvresult.setText(etNumber.getText() + "is not a palindrome number");
        }
    }

}