package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ModelClass> userList;
    
    public Adapter(List<ModelClass>userList)
    {
        this.userList=userList;
    }
    
    
    
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        
        int resources = userList.get(position).getImageview1();
        String name = userList.get(position).getTextview1();
        String msg = userList.get(position).getTextview3();
        String time = userList.get(position).getTextview2();
        String line = userList.get(position).getDivider();

        holder.setData(resources,name,msg,time,line);
        

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        
        private final ImageView imageView;
        private final TextView textView;
        private final TextView textView2;
        private final TextView textView3;
        private final TextView divider;
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            
            imageView = itemView.findViewById(R.id.imageview1);
            textView = itemView.findViewById(R.id.textview1);
            textView2 = itemView.findViewById(R.id.textview2);
            textView3 = itemView.findViewById(R.id.textview3);
            divider = itemView.findViewById(R.id.divider);
            
            
            
        }

        public void setData(int resources, String name, String msg, String time, String line) {

            imageView.setImageResource(resources);
            textView.setText(name);
            textView2.setText(msg);
            textView3.setText(time);
            divider.setText(line);
        }
    }
}
