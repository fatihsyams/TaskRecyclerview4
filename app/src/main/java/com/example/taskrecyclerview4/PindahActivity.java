package com.example.taskrecyclerview4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PindahActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah);
        imageView = findViewById(R.id.imgPindah);
        textView = findViewById(R.id.txtPindah);
        textView2 = findViewById(R.id.txtDetailPindah);

        textView.setText(getIntent().getStringExtra("namaClub"));
        textView2.setText(getIntent().getStringExtra("ketClub"));
        imageView.setImageResource(getIntent().getIntExtra("logoClub" ,0));
    }
}
