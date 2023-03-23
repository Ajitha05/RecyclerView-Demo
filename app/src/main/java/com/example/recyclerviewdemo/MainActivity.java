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
        userList.add(new ModelClass(R.drawable.p3,"Aravinth","how are you","10:45Am","________________________________"));
        userList.add(new ModelClass(R.drawable.p1,"Brijesh","hi","1:00Pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p2,"Sam","hello","good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p4,"Divya","good","I am fine","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p5,"Simran","fine","nice","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p6,"Kiran","I am fine","How are you?","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p7,"Sameer","hi","good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p8,"Baby","Tell","hii","_______________________________________"));
        userList.add(new ModelClass(R.drawable.p3,"Aravinth","good","how are you","_______________________________"));
        userList.add(new ModelClass(R.drawable.p1,"Brijesh","How are you","hlo","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p2,"Sam","fine"," hi","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p4,"Akash","good","hello","_______________________________________"));



    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);



    }
}