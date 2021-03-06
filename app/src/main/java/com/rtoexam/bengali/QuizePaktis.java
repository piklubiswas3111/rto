package com.rtoexam.bengali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizePaktis extends AppCompatActivity {
    private TextView Qurstion, A, B, C, D, total;
    private CardView OptionA, OptionB, OptionC, OptionD;
    private List<QurtionModal> alldata;
    private ImageView imageView;
    private Button fast, last;
    private int i = 0, counter=0;
    private final int l = 0;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize_paktis);

        getSupportActionBar().hide();
        casting();
        arrayli();
        total.setText(1 + "/" + (alldata.size()));
//        Qurstion.setText(alldata.get(i).getQurstion());
//        A.setText(alldata.get(i).getA());
//        B.setText(alldata.get(i).getB());
//        C.setText(alldata.get(i).getC());
//        D.setText(alldata.get(i).getD());
//        try {
//            imageView.setImageResource(alldata.get(i).getImq());
//        } catch (Exception e) {
//
//        }
        //onetimefuntion for 0 i value
//        onefun();

        function();


        OptionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                atextclick();


            }
        });
        OptionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btextclick();

            }
        });
        OptionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctextclick();

            }
        });
        OptionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dtextclick();

            }
        });


        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int ii=counter+1;
                total.setText("" + ii + "/" + alldata.size());
                if (counter == (alldata.size())) {
                    startActivity(new Intent(QuizePaktis.this, MainActivity.class));
                }
                imageView.setImageResource(0);

                increment();
                function();
                if (counter == (alldata.size())) {
                    last.setText("Finish");
                }




            }
        });

        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizePaktis.this, MainActivity.class));

            }
        });

    }

    public void increment() {
        i = (i + 1) % alldata.size();
    }


    public void function() {

        counter++;

        Qurstion.setText(alldata.get(i).getQurstion());
        A.setText(alldata.get(i).getA());
        B.setText(alldata.get(i).getB());
        C.setText(alldata.get(i).getC());
        D.setText(alldata.get(i).getD());
        try {
            imageView.setImageResource(alldata.get(i).getImq());
        } catch (Exception e) {


        }
        OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
        OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
        OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
        OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));


//
    }


    //Chacking funtion
    private void atextclick() {


        if (A.getText().toString().equals(alldata.get(i).getAns())) {

            OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
            OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            Toast.makeText(getApplicationContext(), "Answer A is right", Toast.LENGTH_SHORT).show();
        } else {


            if (B.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            } else if (C.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));

            } else if (D.getText().toString() == alldata.get(i).ans) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));

            }
        }

    }

    private void btextclick() {
        if (B.getText().toString().equals(alldata.get(i).getAns())) {

            OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
            OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));

            Toast.makeText(getApplicationContext(), "Answer is right", Toast.LENGTH_SHORT).show();
        } else {


            if (A.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            } else if (C.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));

            } else if (D.getText().toString() == alldata.get(i).ans) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));

            }
        }

    }

    private void ctextclick() {
        if (C.getText().toString().equals(alldata.get(i).getAns())) {

            OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
            OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));

            Toast.makeText(getApplicationContext(), "Answer is right", Toast.LENGTH_SHORT).show();
        } else {


            if (A.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            } else if (B.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));

            } else if (D.getText().toString() == alldata.get(i).ans) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));

            }
        }


    }

    private void dtextclick() {
        if (D.getText().toString().equals(alldata.get(i).getAns())) {
            OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
            OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
            OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));

            Toast.makeText(getApplicationContext(), "Answer is right", Toast.LENGTH_SHORT).show();
        } else {


            if (A.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));
            } else if (B.getText().toString().equals(alldata.get(i).ans)) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));

            } else if (C.getText().toString() == alldata.get(i).ans) {
                Toast.makeText(getApplicationContext(), "This is wrong ans", Toast.LENGTH_SHORT).show();
                vibrator.vibrate(700);
                OptionB.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionA.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
                OptionC.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Green));
                OptionD.setCardBackgroundColor(ContextCompat.getColor(this, R.color.Red));

            }
        }

    }


    //list of qurtion and an
    private void arrayli() {
        alldata = new ArrayList<>();

        QurtionModal Q1 = new QurtionModal();
        Q1.setQurstion("???????????????????????? ?????????????????? ???????????????????????? , ?????????????????? ????????? ???????????? ?????????");
        Q1.setA("1 ???????????????,???????????????????????? ???????????? ?????????");
        Q1.setB("2 ????????????????????? ???????????????");
        Q1.setC("3 ?????????????????? ?????????????????? ????????????????????????");
        Q1.setD("4 ???????????????????????? ??????????????? ??????????????? ???????????????");
        Q1.setAns("4 ???????????????????????? ??????????????? ??????????????? ???????????????");
        alldata.add(Q1);

        QurtionModal Q2 = new QurtionModal();
        Q2.setQurstion("??????????????? ???????????????????????? ???????????? ???????????????");
        Q2.setA("1 ??????????????? ??????????????? ????????? ???????????? ??????????????????");
        Q2.setB("2 ??????????????? ????????????????????????");
        Q2.setC("3 ???????????????");
        Q2.setD("4 ????????????");
        Q2.setImq(R.drawable.tamun);
        Q2.setAns("3 ???????????????");
        alldata.add(Q2);


        QurtionModal Q3 = new QurtionModal();
        Q3.setQurstion("?????????????????? ??????????????? ???????????????????????? ???????????????????????? ");
        Q3.setA("1 ???????????????????????? ?????????????????? ??????????????? ????????????????????? ????????????????????? ");
        Q3.setB("2 ????????????????????? ????????? ?????????????????? ??????????????? ???????????????");
        Q3.setC("3 ???????????????????????? ??????????????? ??????????????? ?????????????????????");
        Q3.setD("4 ???????????????????????? ??????????????? ????????????");
        Q3.setAns("3 ???????????????????????? ??????????????? ??????????????? ?????????????????????");
        alldata.add(Q3);

        QurtionModal Q4 = new QurtionModal();
        Q4.setQurstion("??????????????? ????????????????????????  ???????????? ???????????????");
        Q4.setA("1 ????????????????????? ????????? ??????????????? ");
        Q4.setB("2 ?????????????????? ?????????");
        Q4.setC("3 ??????????????? ????????????????????????");
        Q4.setD("4 ??????????????? ???????????????");
        Q4.setImq(R.drawable.rastadin);
        Q4.setAns("2 ?????????????????? ?????????");
        alldata.add(Q4);

        QurtionModal Q5 = new QurtionModal();
        Q5.setQurstion("??????????????? ???????????????????????? fift ???????????? ???????????????");
        Q5.setA("1 ????????????????????? ????????? ??????????????? ");
        Q5.setB("2 ?????????????????? ?????????");
        Q5.setC("3 ??????????????? ????????????????????????");
        Q5.setD("4 ??????????????? ???????????????");
        Q5.setAns("4 ??????????????? ???????????????");
        alldata.add(Q5);
    }


    private void casting() {
        OptionA = (CardView) findViewById(R.id.opationA);
        OptionB = (CardView) findViewById(R.id.opationB);
        OptionC = (CardView) findViewById(R.id.opationC);
        OptionD = (CardView) findViewById(R.id.opationD);

        Qurstion = (TextView) findViewById(R.id.qurtion);
        A = (TextView) findViewById(R.id.A);
        B = (TextView) findViewById(R.id.B);
        C = (TextView) findViewById(R.id.C);
        D = (TextView) findViewById(R.id.D);
        imageView = (ImageView) findViewById(R.id.imq);
        total = (TextView) findViewById(R.id.total);

        fast = (Button) findViewById(R.id.Previous);
        last = (Button) findViewById(R.id.next);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);


    }

}