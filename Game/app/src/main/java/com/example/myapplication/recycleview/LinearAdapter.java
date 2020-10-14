package com.example.myapplication.recycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class LinearAdapter extends RecyclerView.Adapter <LinearAdapter.LinearViewHolder>{
    private Context mContext;
    public LinearAdapter(Context context){
        this.mContext = context;
    }
    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View指的是item的布局
        //传入一个布局，找的的是Layout里面的某个部件
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_view,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    //对控件进行赋值
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, int position) {
        holder.textView.setText("Hello World!");
    }

    @Override
    public int getItemCount() {
        return 30;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            //itemView是有上述传入的控件参数
            textView = itemView.findViewById(R.id.linear_view_title);
        }
    }
}
