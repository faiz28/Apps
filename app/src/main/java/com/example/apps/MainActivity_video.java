package com.example.apps;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity_video extends AppCompatActivity {
    private  Button  button_a,button_b,button_c,button_d,button_e,button_f,button_g,button_h,button_i,button_j,button_k;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video);


        button_a = (Button) findViewById(R.id.a);
        button_b = (Button) findViewById(R.id.b);
        button_c = (Button) findViewById(R.id.c);
        button_d = (Button) findViewById(R.id.d);
        button_e = (Button) findViewById(R.id.e);
        button_f = (Button) findViewById(R.id.f);
        button_g = (Button) findViewById(R.id.g);
        button_h = (Button) findViewById(R.id.h);
        button_i = (Button) findViewById(R.id.i);
        button_j = (Button) findViewById(R.id.j);
        button_k = (Button) findViewById(R.id.k);

        videoView = (VideoView) findViewById(R.id.VideoShow);
    }

    public void videoplay(View V){

        String videoPath="android.resource://com.example.apps"+R.raw.a;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }





}
