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
        userList.add(new ModelClass(R.drawable.p3,"Aravinth","1.00p","hi","_______________________________________"));
        userList.add(new ModelClass(R.drawable.p1,"Brijesh","2.00pm","hello","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p2,"Sam","3.00pm","good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p4,"Divya","4.00pm","I am fine","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p5,"Simran","5.00pm","nice","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p6,"Kiran","6.00pm","How are you?","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p7,"Sameer","7.00pm","good","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p8,"Baby","8.00pm","hii","_______________________________________"));
        userList.add(new ModelClass(R.drawable.p3,"Aravinth","9.00pm","how are you","_______________________________"));
        userList.add(new ModelClass(R.drawable.p1,"Brijesh","11.00am","hlo","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p2,"Sam","10.00am"," hi","_______________________________________"));

        userList.add(new ModelClass(R.drawable.p4,"Akash","12.00pm","hello","_______________________________________"));



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