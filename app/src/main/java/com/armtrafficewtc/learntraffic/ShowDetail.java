package com.armtrafficewtc.learntraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    //Explicit
    private TextView titileTextView, detailTextView;
    //ImageView traffImageView; เหมือนกับ
    private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //Bind widget
        titileTextView = (TextView) findViewById(R.id.textView5);
        titileTextView = (TextView) findViewById(R.id.textView6);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

        //Recive & Show
        String strTitle = getIntent().getStringExtra("Title");
        titileTextView.setText(strTitle);

        int intImage = getIntent().getIntExtra("Icon", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detaStrings = getResources().getStringArray(R.array.detail);
        detailTextView.setText(detaStrings[intIndex]);

    }    // Main Method
}  // Main Class
