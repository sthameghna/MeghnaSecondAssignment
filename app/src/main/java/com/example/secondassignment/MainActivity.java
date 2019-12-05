package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignment.Fragments.AreaofCircleFragment;
import com.example.secondassignment.Fragments.AutomorphicFragment;
import com.example.secondassignment.Fragments.PalindromORnotFragment;
import com.example.secondassignment.Fragments.ReverseNumFragment;
import com.example.secondassignment.Fragments.ReverseStringFragment;
import com.example.secondassignment.Fragments.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSum, btnAreaofcircle, btnReversenum, btnReverseString, btnPalindrome, btnAutomorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = findViewById(R.id.btnSum);
        btnAreaofcircle = findViewById(R.id.btnAreaofcircle);
        btnReversenum = findViewById(R.id.btnReversenum);
        btnReverseString = findViewById(R.id.btnReverseString);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);

        btnSum.setOnClickListener(this);
        btnAreaofcircle.setOnClickListener(this);
        btnReversenum.setOnClickListener(this);
        btnReverseString.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnAutomorphic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnSum:
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, sumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnAreaofcircle:
                AreaofCircleFragment areaFragment = new AreaofCircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, areaFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnReversenum:
                ReverseNumFragment reverseNumFragment = new ReverseNumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, reverseNumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnPalindrome:
                PalindromORnotFragment palindromeFragment = new PalindromORnotFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnAutomorphic:
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphicFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnReverseString:
                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, reverseStringFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;


        }
    }
}