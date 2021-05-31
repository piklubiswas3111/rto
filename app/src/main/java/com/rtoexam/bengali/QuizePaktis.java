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
        Q1.setQurstion("উল্লিখিত গাড়ির ক্ষেত্রে , রাস্তা করে দিতে হবে");
        Q1.setA("1 দ্রুত,অতিদ্রুত গামী বাস");
        Q1.setB("2 পুলিশের গাড়ি");
        Q1.setC("3 যেকোনো গাড়ির ক্ষেত্রে");
        Q1.setD("4 আপদকালীন সংকেত যুক্ত গাড়ি");
        Q1.setAns("4 আপদকালীন সংকেত যুক্ত গাড়ি");
        alldata.add(Q1);

        QurtionModal Q2 = new QurtionModal();
        Q2.setQurstion("নিচের চিহ্নটির মানে হচ্ছে");
        Q2.setA("1 গাড়ী পার্ক করে রাখা যাবেনা");
        Q2.setB("2 সামনে হাসপাতাল");
        Q2.setC("3 থামুন");
        Q2.setD("4 চলুন");
        Q2.setImq(R.drawable.tamun);
        Q2.setAns("3 থামুন");
        alldata.add(Q2);


        QurtionModal Q3 = new QurtionModal();
        Q3.setQurstion("ফুটপাথ বিহীন রাস্তায় পদচারীরা ");
        Q3.setA("1 রাস্তায় ডানদিক দিয়ে হাঁটবেন রাস্তার ");
        Q3.setB("2 যেকোনাে দিক দিয়েই হাটতে পারেন");
        Q3.setC("3 রাস্তায় বাদিক দিয়ে হাঁটবেন");
        Q3.setD("4 রাস্তায় হাঁটা বারণ");
        Q3.setAns("3 রাস্তায় বাদিক দিয়ে হাঁটবেন");
        alldata.add(Q3);

        QurtionModal Q4 = new QurtionModal();
        Q4.setQurstion("নিচের চিহ্নটির  মানে হচ্ছে");
        Q4.setA("1 ট্রাফিক আইন সামনে ");
        Q4.setB("2 রাস্তা দিন");
        Q4.setC("3 সামনে হাসপাতাল");
        Q4.setD("4 দ্রুত চালান");
        Q4.setImq(R.drawable.rastadin);
        Q4.setAns("2 রাস্তা দিন");
        alldata.add(Q4);

        QurtionModal Q5 = new QurtionModal();
        Q5.setQurstion("নিচের চিহ্নটির fift মানে হচ্ছে");
        Q5.setA("1 ট্রাফিক আইন সামনে ");
        Q5.setB("2 রাস্তা দিন");
        Q5.setC("3 সামনে হাসপাতাল");
        Q5.setD("4 দ্রুত চালান");
        Q5.setAns("4 দ্রুত চালান");
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