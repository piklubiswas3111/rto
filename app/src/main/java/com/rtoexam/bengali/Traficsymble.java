package com.rtoexam.bengali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Traficsymble extends AppCompatActivity {
private RecyclerView recyclerView;
private Adptertraficsymble myAdpter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traficsymble);
        getSupportActionBar().hide();
        recyclerView=(RecyclerView)findViewById(R.id.recyltrafic);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdpter=new Adptertraficsymble(datastore(),getApplicationContext());
        recyclerView.setAdapter(myAdpter);



    }
    public ArrayList<ReModal> datastore(){
        ArrayList<ReModal> holder= new ArrayList<>();

        ReModal f1=new ReModal();
        f1.setNumberr("1.");
        f1.setImageview(R.drawable.tamun);
        f1.setDescription("this is description");
        holder.add(f1);

        ReModal f2=new ReModal();
        f2.setNumberr("2.");
        f2.setImageview(R.drawable.badhotamulokgariguran);
        f2.setDescription("this is description");
        holder.add(f2);
        ReModal f3=new ReModal();
        f3.setNumberr("3.");
        f3.setImageview(R.drawable.rastadin);
        f3.setDescription("this is description");
        holder.add(f3);

        ReModal f4=new ReModal();
        f4.setNumberr("4.");
        f4.setImageview(R.drawable.ekmukhirasta);
        f4.setDescription("this is description");
        holder.add(f4);

        ReModal f5=new ReModal();
        f5.setNumberr("5.");
        f5.setImageview(R.drawable.utrunnised);
        f5.setDescription("this is description");
        holder.add(f5);

        ReModal f6=new ReModal();
        f6.setNumberr("6.");
        f6.setImageview(R.drawable.pothocariderrastaparhiyarjayga);
        f6.setDescription("this is description");
        holder.add(f6);

        ReModal f7=new ReModal();
        f7.setNumberr("7.");
        f7.setImageview(R.drawable.dandikegoranonised);
        f7.setDescription("this is description");
        holder.add(f7);


        ReModal f8=new ReModal();
        f8.setNumberr("8.");
        f8.setImageview(R.drawable.dandikegariparkkoraranumoti);
        f8.setDescription("this is description");
        holder.add(f8);

        ReModal f9=new ReModal();
        f9.setNumberr("9.");
        f9.setImageview(R.drawable.hornbajanonised);
        f9.setDescription("this is description");
        holder.add(f9);

        ReModal f10=new ReModal();
        f10.setNumberr("10.");
        f10.setImageview(R.drawable.samnesonkirnosetu);
        f10.setDescription("this is description");
        holder.add(f10);

        ReModal f11=new ReModal();
        f11.setNumberr("11.");
        f11.setImageview(R.drawable.badhotamulokgariguran);
        f11.setDescription("this is description");
        holder.add(f11);

        ReModal f12=new ReModal();
        f12.setNumberr("12.");
        f12.setImageview(R.drawable.badhotamulokgariguran);
        f12.setDescription("this is description");
        holder.add(f12);


        ReModal f13=new ReModal();
        f13.setNumberr("13.");
        f13.setImageview(R.drawable.badhotamulokgariguran);
        f13.setDescription("this is description");
        holder.add(f13);


        ReModal f14=new ReModal();
        f14.setNumberr("14.");
        f14.setImageview(R.drawable.badhotamulokgariguran);
        f14.setDescription("this is description");
        holder.add(f14);


        ReModal f15=new ReModal();
        f15.setNumberr("15.");
        f15.setImageview(R.drawable.badhotamulokgariguran);
        f15.setDescription("this is description");
        holder.add(f15);

        ReModal f16=new ReModal();
        f16.setNumberr("16.");
        f16.setImageview(R.drawable.badhotamulokgariguran);
        f16.setDescription("this is description");
        holder.add(f16);


        ReModal f17=new ReModal();
        f17.setNumberr("17.");
        f17.setImageview(R.drawable.badhotamulokgariguran);
        f17.setDescription("this is description");
        holder.add(f17);

        ReModal f18=new ReModal();
        f18.setNumberr("2.");
        f18.setImageview(R.drawable.badhotamulokgariguran);
        f18.setDescription("this is description");
        holder.add(f18);

        ReModal f19=new ReModal();
        f19.setNumberr("19.");
        f19.setImageview(R.drawable.badhotamulokgariguran);
        f19.setDescription("this is description");
        holder.add(f19);

        ReModal f20=new ReModal();
        f20.setNumberr("20.");
        f20.setImageview(R.drawable.badhotamulokgariguran);
        f20.setDescription("this is description");
        holder.add(f20);


        ReModal f21=new ReModal();
        f21.setNumberr("21.");
        f21.setImageview(R.drawable.badhotamulokgariguran);
        f21.setDescription("this is description");
        holder.add(f21);


        ReModal f22=new ReModal();
        f22.setNumberr("22.");
        f22.setImageview(R.drawable.badhotamulokgariguran);
        f22.setDescription("this is description");
        holder.add(f22);

        ReModal f23=new ReModal();
        f23.setNumberr("23.");
        f23.setImageview(R.drawable.badhotamulokgariguran);
        f23.setDescription("this is description");
        holder.add(f23);

        ReModal f24=new ReModal();
        f24.setNumberr("24.");
        f24.setImageview(R.drawable.badhotamulokgariguran);
        f24.setDescription("this is description");
        holder.add(f24);

        ReModal f25=new ReModal();
        f25.setNumberr("25.");
        f25.setImageview(R.drawable.badhotamulokgariguran);
        f25.setDescription("this is description");
        holder.add(f25);

        ReModal f26=new ReModal();
        f26.setNumberr("26.");
        f26.setImageview(R.drawable.badhotamulokgariguran);
        f26.setDescription("this is description");
        holder.add(f26);

        ReModal f27=new ReModal();
        f27.setNumberr("27.");
        f27.setImageview(R.drawable.badhotamulokgariguran);
        f27.setDescription("this is description");
        holder.add(f27);

        ReModal f28=new ReModal();
        f28.setNumberr("28.");
        f28.setImageview(R.drawable.badhotamulokgariguran);
        f28.setDescription("this is description");
        holder.add(f28);

        ReModal f29=new ReModal();
        f29.setNumberr("29.");
        f29.setImageview(R.drawable.badhotamulokgariguran);
        f29.setDescription("this is description");
        holder.add(f29);

        ReModal f30=new ReModal();
        f30.setNumberr("30.");
        f30.setImageview(R.drawable.badhotamulokgariguran);
        f30.setDescription("this is description");
        holder.add(f30);

        ReModal f31=new ReModal();
        f31.setNumberr("31.");
        f31.setImageview(R.drawable.badhotamulokgariguran);
        f31.setDescription("this is description");
        holder.add(f31);









        return holder;
    }
}