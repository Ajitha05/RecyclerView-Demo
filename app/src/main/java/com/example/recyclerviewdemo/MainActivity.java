package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();




    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.p3,"Aravinth","10:45am","How are you?","_______________________"));
        userList.add(new ModelClass(R.drawable.p1,"Brijesh","1:20","I am good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p2,"Sam","6:50","hi How are You?","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p4,"Divya","4:50","good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p5,"Simran","3:00","I am good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p6,"Karan","11.00","I am good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p7,"Sameer","4:00","I am good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p8,"Baby","8:00","I am good","_______________________________________"));
        userList.add(new ModelClass(R.drawable.p3,"Aravinth","10:45am","How are you?","_______________________"));
        userList.add(new ModelClass(R.drawable.p1,"Brijesh","7:00","I am good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p2,"Sam","9:40","I am good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p4,"Divya","1:00","I am good","_______________________________________"));



    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}