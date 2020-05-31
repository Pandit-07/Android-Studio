package com.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{
    ArrayList <String> personNames;
    Context c;
    public CustomAdapter(Context c, ArrayList <String> personNames){
        this.personNames = personNames;
        this.c = c;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
         MyViewHolder vh = new MyViewHolder(v);
         return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.name.setText(personNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(c, (CharSequence) personNames.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount(){
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public MyViewHolder(View itemView){
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
