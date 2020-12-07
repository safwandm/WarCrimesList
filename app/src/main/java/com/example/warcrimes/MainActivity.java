package com.example.warcrimes;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCrimes;
    private ArrayList<Crime> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCrimes = findViewById(R.id.rv_crimes);
        rvCrimes.setHasFixedSize(true);

        list.addAll(CrimesData.getCrimesData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvCrimes.setLayoutManager(new LinearLayoutManager(this));
        ListCrimeAdapter listCrimeAdapter = new ListCrimeAdapter(list);
        rvCrimes.setAdapter((listCrimeAdapter));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_Profile:
                Intent moveIntent = new Intent(MainActivity.this, Profile.class);
                startActivity(moveIntent);
                break;
        }
    }
}