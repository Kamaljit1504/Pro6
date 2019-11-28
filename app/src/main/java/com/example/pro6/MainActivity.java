package com.example.pro6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private RecyclerView mCountryList;
    private List<Country> countryList;
    private RecyclerViewDemoAdapter demoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews()
    {
        populateData();
        mCountryList = findViewById(R.id.recycler_view);
        demoAdapter = new RecyclerViewDemoAdapter(countryList);
        //set Liner Layout
       // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL);
        //rvCountryList.setLayoutmanager(mLayoutManager);

       // set Grid layout
       // GridLayoutManager mGridLayoutManager
       // StaggeredGridLayoutManager mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
       mCountryList.setLayoutManager(layoutManager);
        mCountryList.setAdapter(demoAdapter);

    }



    private void populateData()
    {
        countryList = new ArrayList<>();

        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("USA",R.drawable.us));
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("USA",R.drawable.us));
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("USA",R.drawable.us));
    }
}
