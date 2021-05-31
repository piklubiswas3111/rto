package com.rtoexam.bengali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Qurtionan extends AppCompatActivity {
private RecyclerView recyclerView;
private QMyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qurtionan);
        getSupportActionBar().hide();
        recyclerView=(RecyclerView)findViewById(R.id.qurtionanrv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter=new QMyAdapter(datastoree());
        recyclerView.setAdapter(mAdapter);

    }

    private ArrayList<QModal> datastoree(){
        ArrayList<QModal> holder=new ArrayList<>();

        QModal f1=new QModal();
        f1.setQur("1. যখন পদচারীরা , পদচারীদের রাস্তা পারাপারের জন্য নির্দিষ্ট স্থানে অপেক্ষা করছেন , তখন আপনি ");
        f1.setAn("উ .গাড়ী থামান , পদচারীরা রাস্তা পার হওয়া অবধি অপেক্ষা করুন এবং তারপরে এগােন ।");
        holder.add(f1);

        QModal f2=new QModal();
        f2.setQur("2.আপনি একটি সংকীর্ণ সেতুর দিকে গাড়ী নিয়ে এগােচ্ছেন , অন্য একটি গাড়ী , উল্টোদিক থেকে সেতুতে ঢােকবার মুখে , তখন আপনি");
        f2.setAn(" উ . অন্য গাড়িটি সেতু পার হয়ে আসা অবধি অপেক্ষা করুন এবং তারপর এগােন ।");
        holder.add(f2);

        QModal f3=new QModal();
        f3.setQur("3. যখন একটি গাড়ী দুরঘটনাগ্রস্থ হয়ে কোনাে মানুষ আহত হয়েছেন । ");
        f3.setAn("উ.আহত মানুষ্টির চিকিতসার জন্য সকল প্রকার প্রয়ােজনিয় পদক্ষেপ নিন এবং ২৪ ঘন্টার মধ্যে সবচেয়ে কাছের থানায় জানান ।");
        holder.add(f3);

        QModal f4=new QModal();
        f4.setQur("4. যে রাস্তা এঝুঁখি যান চলাচলের জন্য নির্দিষ্ট ");
        f4.setAn("উ . রিভার্স বা ব্যক গিয়ারে গাড়ী চালানাে যাবেনা ");
        holder.add(f4);



        return holder;

    }
}