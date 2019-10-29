package com.briand.tugas_1718060_family;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFamily;
    private ArrayList<family> list = new ArrayList<>();
    private String title = "Briand Royal Family";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(title);

        rvFamily = findViewById(R.id.rv_family);
        rvFamily.setHasFixedSize(true);

        list.addAll(familyData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvFamily.setLayoutManager(new LinearLayoutManager(this));
        familyAdapter listFamilyAdapter = new familyAdapter(list);
        rvFamily.setAdapter(listFamilyAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }
}
