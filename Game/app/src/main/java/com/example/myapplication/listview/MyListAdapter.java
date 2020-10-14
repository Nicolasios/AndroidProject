package com.example.myapplication.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyListAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    //创建一个保存View的类
    private static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle,tvTime,tvContent;
    }
    @SuppressLint({"InflateParams", "SetTextI18n"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //holder相当于一个局部结构 view相当于对xml文件的一个接口
        ViewHolder holder = null;
        if(view == null){
            view = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv);
            holder.tvContent = view.findViewById(R.id.tv_content);
            holder.tvTime = view.findViewById(R.id.tv_time);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
            holder.tvTitle.setText("学习猿地");
            holder.tvTime.setText("2020.07.29");
            holder.tvContent.setText("学习猿地是你来学习的好地方");
            Glide.with(mContext).load("https://cdn2.lmonkey.com/94f152aaa94d937ccf5de78f3fcac59f/3b6e32e7bc8145a283431f260c3c1d1a.png").into(holder.imageView);
        }
        return view;
    }


}
