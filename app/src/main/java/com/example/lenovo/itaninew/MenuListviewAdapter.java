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


public class MenuListviewAdapter extends BaseAdapter {

    Context context;

    ArrayList<MenuBeanclassList> bean;
    Typeface fonts1,fonts2;
    RatingBar ratingbar;
    Activity main;




    public MenuListviewAdapter(Activity activity, Context context, ArrayList<MenuBeanclassList> bean) {

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
            convertView = layoutInflater.inflate(R.layout.listview_menu,null);

            viewHolder = new ViewHolder();

            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);

            convertView.setTag(viewHolder);


        }else {

            viewHolder = (ViewHolder)convertView.getTag();
        }







        MenuBeanclassList bean = (MenuBeanclassList)getItem(position);

        viewHolder.img.setImageResource(bean.getImg());
        viewHolder.name.setText(bean.getName());




        return convertView;
    }

    private class ViewHolder {
        ImageView img;
        TextView name;




    }
}



