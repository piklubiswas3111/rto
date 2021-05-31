package com.rtoexam.bengali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Qurtionbak extends AppCompatActivity {
CardView qurtion,traffic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qurtionbak);
        qurtion=(CardView)findViewById(R.id.qr);
        traffic=(CardView)findViewById(R.id.trfci);
        qurtion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Qurtionbak.this,Qurtionan.class));
            }
        });
        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Qurtionbak.this,Traficsymble.class));
            }
        });

    }
}