package com.rtoexam.bengali;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Adptertraficsymble extends RecyclerView.Adapter<Adptertraficsymble.Hoder> {
    ArrayList<ReModal> data;
    Context context;

    public Adptertraficsymble(ArrayList<ReModal> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public Hoder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.rowtrafiic, parent, false);
        return new Hoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Adptertraficsymble.Hoder holder, int position) {
       holder.imageView.setImageResource(data.get(position).getImageview());
       holder.numberr.setText(data.get(position).getNumberr());
        holder.describe.setText(data.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Hoder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView numberr;
        TextView describe;
        public Hoder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.symbolrecy);
            numberr=(TextView)itemView.findViewById(R.id.numberr);
            describe=(TextView)itemView.findViewById(R.id.describtion);
        }
    }

}
class ReModal{
    int imageview;
    String numberr,description;

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public String getNumberr() {
        return numberr;
    }

    public void setNumberr(String numberr) {
        this.numberr = numberr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
