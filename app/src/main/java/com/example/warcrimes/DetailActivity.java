package com.example.warcrimes;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public TextView tvDetail;
    public ImageView imgCrimes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvDetail = findViewById(R.id.txt_detail);
        Crime extra = getIntent().getParcelableExtra("objek");
        tvDetail.setText(extra.getDetail());

        imgCrimes = findViewById(R.id.img_detail);
        imgCrimes.setImageResource(extra.getPhoto());
    }
}
