package com.armtrafficewtc.learntraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by admin on 3/4/2559.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context context;
    private String[] titleStrings, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context context, String[] titleStrings, String[] detailStrings, int[] iconInts) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View View, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //For Textview
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[1]);

        TextView decriptionTextView = (TextView) view1.findViewById(R.id.textView3);
        titleTextView.setText(titleStrings[1]);

        //For Image
        ImageView icoImageView = (ImageView) view1.findViewById(R.id.imageView);
        icoImageView.setImageResource(iconInts[i]);

        return view1;
    }
} //Main Class
