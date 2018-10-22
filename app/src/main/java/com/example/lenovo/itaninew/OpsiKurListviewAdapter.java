package com.example.lenovo.itaninew;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import java.util.ArrayList;


public class OpsiKurListviewAdapter extends BaseAdapter {

    Context context;

    ArrayList<OpsiKurBeanclassList> bean;
    Typeface fonts1,fonts2;
    RatingBar ratingbar;
    Activity main;




    public OpsiKurListviewAdapter(Activity activity, Context context, ArrayList<OpsiKurBeanclassList> bean) {

        this.main = activity;
        this.context = context;
        this.bean = bean;
    }

    @Override
    public int getCount() {
        return bean.size();
    }

    @Override
    public Object getItem(int position) {
        return bean.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.listview_kur,null);

            viewHolder = new ViewHolder();

            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.sub_name = (TextView) convertView.findViewById(R.id.sub_name);

            convertView.setTag(viewHolder);


        }else {

            viewHolder = (ViewHolder)convertView.getTag();
        }







        OpsiKurBeanclassList bean = (OpsiKurBeanclassList)getItem(position);

        viewHolder.img.setImageResource(bean.getImg());
        viewHolder.name.setText(bean.getName());
        viewHolder.sub_name.setText(bean.getSub_name());

        return convertView;
    }

    private class ViewHolder {
        ImageView img;
        TextView name;
        TextView sub_name;
    }
}



