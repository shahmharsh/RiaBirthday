package com.example.riabirthday;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class tanvivid extends AppCompatActivity {

    Button click1;
    VideoView vid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanvivid);
        click1 = (Button) findViewById(R.id.button1);
        vid2 = (VideoView) findViewById(R.id.videoView1);

    }

    public void play(View v) {
        String videopath = "android.resource://com.example.riabirthday/" + R.raw.y1;
        Uri uri = Uri.parse(videopath);
        vid2.setVideoURI(uri);
        vid2.start();


    }
    public void yogu1(View view) {

        Intent intent = new Intent(this, yogu1.class);
        startActivity(intent);


    }
}
