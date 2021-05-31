package com.rtoexam.bengali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView Qurstion, paktic, Exem, pp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        casting();
        Qurstion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Qurtionbak.class));
            }
        });
        paktic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,QuizePaktis.class));
            }
        });



    }

    private void casting() {
        Qurstion = (CardView) findViewById(R.id.qurstion);
        paktic = (CardView) findViewById(R.id.paktic);
        Exem = (CardView) findViewById(R.id.exem);
        pp = (CardView) findViewById(R.id.pp);

    }


}