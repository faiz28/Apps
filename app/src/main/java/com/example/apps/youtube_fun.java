package com.example.apps;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class youtube_fun extends YouTubeBaseActivity {

    private static  final  String TAG="MainActivity";

    YouTubePlayerView  mYouTubePlayerView1,mYouTubePlayerView2,mYouTubePlayerView3,mYouTubePlayerView4;
    Button btnPlay1,golpo,moto_patlo,kheladola;
    YouTubePlayer.OnInitializedListener mOnInitializedLisener1,mOnInitializedLisener2,mOnInitializedLisener3,mOnInitializedLisener4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_fun);
        Log.d(TAG,"onCreate: Starting");
        btnPlay1=(Button) findViewById(R.id.kobita);
        golpo=(Button) findViewById(R.id.golpo);
        moto_patlo=(Button) findViewById(R.id.moto_patlo);
        kheladola=(Button) findViewById(R.id.games);

        mYouTubePlayerView1=(YouTubePlayerView) findViewById(R.id.youtubePlay1);
        mYouTubePlayerView2=(YouTubePlayerView) findViewById(R.id.youtubePlay2);
        mYouTubePlayerView3=(YouTubePlayerView) findViewById(R.id.youtubePlay3);
        mYouTubePlayerView4=(YouTubePlayerView) findViewById(R.id.youtubePlay4);

        mOnInitializedLisener1 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onClick: Done Initializing");
                List<String> videoList=new ArrayList<>();
               videoList.add("JOIQedNXZhM");
               videoList.add("a6yrf-7SFGU");
               videoList.add("OIMZ6O8BuTQ");
               videoList.add("kaLI5ieY9Xk");
               videoList.add("ZlgXnEE7AUs");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onClick: Failed Initializing");
            }
        };

        mOnInitializedLisener2= new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


                Log.d(TAG,"onClick: Done Initializing");
                List<String> videoList=new ArrayList<>();
                videoList.add("lgFp2oRFDVk");
                videoList.add("RttV_1TdIp0");
                videoList.add("kopkGfY-fQA");
                videoList.add("XbHizu3SVQ");
                videoList.add("lAdg6BLrQIc");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onClick: Failed Initializing");
            }
        };

        mOnInitializedLisener3=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onClick: Done Initializing");
                List<String> videoList=new ArrayList<>();
                videoList.add("SRvTjXrboO8");
                videoList.add("H_bELXYX8H4");
                videoList.add("Sl66VVriCo4");
                videoList.add("GWHzqJQYV9A");
                videoList.add("_RlsrmeVMkc");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onClick: Failed Initializing");
            }
        };
        mOnInitializedLisener4=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onClick: Done Initializing");
                List<String> videoList=new ArrayList<>();
                videoList.add("1jpe4vFvo9g");
                videoList.add("TK2FIFk3bvU");
                videoList.add("m2UfkjjxDPA");
                videoList.add("wPKMW9FcCfw");
                videoList.add("zw7Bhpg1QLI");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onClick: Failed Initializing");
            }
        };



        btnPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(TAG,"onClick: Initializing Youtube Plyear.");
                mYouTubePlayerView1.initialize(youtube_config.getApiKey(),mOnInitializedLisener1);

            }
        });
        golpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClick: Initializing Youtube Plyear.");
                mYouTubePlayerView2.initialize(youtube_config.getApiKey(),mOnInitializedLisener2);
            }
        });
        moto_patlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClick: Initializing Youtube Plyear.");
                mYouTubePlayerView3.initialize(youtube_config.getApiKey(),mOnInitializedLisener3);
            }
        });
        kheladola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClick: Initializing Youtube Plyear.");
                mYouTubePlayerView4.initialize(youtube_config.getApiKey(),mOnInitializedLisener4);
            }
        });




    }
}
