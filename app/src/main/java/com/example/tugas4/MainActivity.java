package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private ArrayList<Item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView=(RecyclerView)findViewById(R.id.recycleview);
        adapter = new ItemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("Rex Regum Qeon","ceo : Andrian Pauline_(AP)","negara : indonesia",R.drawable.rrq));
        itemArrayList.add(new Item("Evos Esport","ceo : Ivan Yeo","negara : indonesia",R.drawable.evos));
        itemArrayList.add(new Item("todak","ceo : senna","negara : malaysia",R.drawable.todak));
        itemArrayList.add(new Item("GPX Basreng ","ceo : yurino","negara : Indonesia",R.drawable.gpx));
        itemArrayList.add(new Item("Blakclist"," ceo : sahrul","negara : filipina",R.drawable.blacklist));
        itemArrayList.add(new Item("Onic PH","ceo : sandi","negara : pilipin",R.drawable.onic));
        itemArrayList.add(new Item("Akatsuki","ceo : itchi","negara : arabian",R.drawable.akatsuki));
    }
}
