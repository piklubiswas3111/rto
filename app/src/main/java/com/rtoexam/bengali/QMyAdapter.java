package com.rtoexam.bengali;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class QMyAdapter extends RecyclerView.Adapter<QMyAdapter.Holderr> {
    ArrayList<QModal> qdata;


    public QMyAdapter(ArrayList<QModal> qdata) {
        this.qdata = qdata;

    }

    @NonNull
    @NotNull
    @Override
    public Holderr onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.qurtionanrow, parent, false);
        return new Holderr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull QMyAdapter.Holderr holder, int position) {
        holder.tv1.setText(qdata.get(position).getQur());
        holder.tv2.setText(qdata.get(position).getAn());

    }

    @Override
    public int getItemCount() {
        return qdata.size();
    }

    public class Holderr extends RecyclerView.ViewHolder {
        TextView tv1,tv2;
        public Holderr(@NonNull @NotNull View itemView) {
            super(itemView);
            tv1=(TextView)itemView.findViewById(R.id.qur);
            tv2=(TextView)itemView.findViewById(R.id.ans);
        }
    }
}
class QModal{
    String qur;
    String an;

    public String getQur() {
        return qur;
    }

    public void setQur(String qur) {
        this.qur = qur;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }
}
