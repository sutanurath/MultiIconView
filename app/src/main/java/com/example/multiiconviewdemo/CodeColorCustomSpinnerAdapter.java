package com.example.multiiconviewdemo;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by sutanurath on 12/09/17.
 */

public class CodeColorCustomSpinnerAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] objects;
    public CodeColorCustomSpinnerAdapter(Activity context, int textViewResourceId,
                                         String[] objects) {
        super(context, textViewResourceId, objects);

        this.context = context;
        this.objects = objects;
        // TODO Auto-generated constructor stub
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        // TODO Auto-generated method stub
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        //return super.getView(position, convertView, parent);

        LayoutInflater inflater=context.getLayoutInflater();
        View row=inflater.inflate(R.layout.color_adapter_layout, parent, false);
        TextView names = (TextView) row.findViewById(R.id.color);

        names.setText(objects[position]);
        names.setBackgroundColor(Color.parseColor(objects[position]));
        if(objects[position].equals("#FFFFFF")){
            names.setTextColor(Color.parseColor("#000000"));
        }

        return row;
    }
}