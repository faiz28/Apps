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

    YouTubePlayerView  mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedLisener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_fun);
        Log.d(TAG,"onCreate: Starting");
        btnPlay=(Button) findViewById(R.id.kobita);
        mYouTubePlayerView=(YouTubePlayerView) findViewById(R.id.youtubePlay1);

        mOnInitializedLisener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onClick: Done Initializing");
                List<String> videoList=new ArrayList<>();
               videoList.add("JOIQedNXZhM");
               videoList.add("a6yrf-7SFGU");
               videoList.add("a6yrf-7SFGU&t");
               videoList.add("t1Pdk4VxZsw&t");
               videoList.add("1yHmdTKE2Sc");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onClick: Failed Initializing");
            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: Initializing Youtube Plyear.");
                mYouTubePlayerView.initialize(youtube_config.getApiKey(),mOnInitializedLisener);

            }
        });
    }
}
