package com.armtrafficewtc.learntraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.LiveFolders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวเเปร
    private ListView trafficlivListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget คือการผูกความสัมพันธ์ ของ Variable and Widget
        trafficlivListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //การเก็บเหตุการณ์ จาการคลิ๊กปุ่ม
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.effect_btn_shut);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/AGTnpr7vc1E"));
                startActivity(intent);

            } //onClick
        });

    }    //Main Metthod นี่คือเมดตอด

}    //Main Class นี่คือคลาสหลัก..
