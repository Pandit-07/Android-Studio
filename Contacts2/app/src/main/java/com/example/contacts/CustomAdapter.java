package com.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public  abstract class CustomAdapter extends RecyclerView.Adapter {
    ArrayList personNames;
    Context context;
    public CustomAdapter(Context c, ArrayList personNames){
        this.personNames = personNames;
        this.context = context;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
         MyViewHolder vh = new MyViewHolder(v);
         return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position){
        holder.name.setText((Integer) personNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onCLick(View view){
                Toast.makeText(context, (Integer) personNames.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount(){
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        final TextView name;
        public MyViewHolder(View itemView){
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
