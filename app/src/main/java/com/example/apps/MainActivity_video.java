package com.example.apps;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.VideoView;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity_video extends AppCompatActivity {
    private  Button  button_a,button_b,button_c,button_d,button_e,button_f,button_g,button_h,button_i,button_j,button_k;
    VideoView videoView;
    GifImageView gifImageView;

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
//        gifImageView=(gifImageView) findViewById(R.id.gif);
//       gifImageView.setImageDrawable(Drawable "cat");
    }

    public void a(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.a;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

//        webView.loadUrl("@asstes/amm.html");

    }
    public void b(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.b;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
    public void c(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.c;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
    public void d(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.d;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
   public void e(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.e;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
    public void f(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.f;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
    public void g(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.g;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
    public void h(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.h;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
    public void i(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.i;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();


    }
    public void j(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.j;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }
    public void k(View V){

        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.k;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }





}
