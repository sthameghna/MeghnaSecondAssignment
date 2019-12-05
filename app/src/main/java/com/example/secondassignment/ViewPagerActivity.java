package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.secondassignment.Adapter.ViewPagerAdapter;
import com.example.secondassignment.Fragments.AreaofCircleFragment;
import com.example.secondassignment.Fragments.AutomorphicFragment;
import com.example.secondassignment.Fragments.PalindromORnotFragment;
import com.example.secondassignment.Fragments.ReverseNumFragment;
import com.example.secondassignment.Fragments.ReverseStringFragment;
import com.example.secondassignment.Fragments.SumFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.viewPager);
        tabLayout= findViewById(R.id.tabId);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new SumFragment(),"SUM");
        viewPagerAdapter.addFragment(new AreaofCircleFragment(),"Area of circle");
        viewPagerAdapter.addFragment(new ReverseNumFragment(),"Reverse Num");
        viewPagerAdapter.addFragment(new ReverseStringFragment(),"Reverse String");
        viewPagerAdapter.addFragment(new PalindromORnotFragment(),"Palindrome or not");
        viewPagerAdapter.addFragment(new AutomorphicFragment(),"Automorphic");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
