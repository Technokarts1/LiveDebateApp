package com.example.livedebatestream.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.livedebatestream.R;
import com.example.livedebatestream.ui.Fragments.YouTubeConfig;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class Youtube extends YouTubeBaseActivity {

    private static final String TAG = "Dashboard";
    YouTubePlayerView myouTubePlayerView;
    Button btnplay;
    YouTubePlayer.OnInitializedListener monInitializedListener;


    private static final String TAG1 = "Dashboard";
    YouTubePlayerView myouTubePlayerView1;
    Button btnplay1;
    YouTubePlayer.OnInitializedListener monInitializedListener1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        Log.d(TAG, "onCreate: Starting.");
        Log.d(TAG1, "onCreate: Starting.");

        myouTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);
        btnplay = (Button) findViewById(R.id.play);

        myouTubePlayerView1 = (YouTubePlayerView) findViewById(R.id.player1);
        btnplay1 = (Button) findViewById(R.id.play1);

        monInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing.");

                List<String> videoList = new ArrayList<>();
                videoList.add("3B1CeiC_1LQ");
//                videoList.add("2duc77R4Hqw");

                youTubePlayer.loadVideos(videoList);
                //   youTubePlayer.loadPlaylist("https://www.youtube.com/watch?v=VriiDn676PQ");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to initialize.");
            }
        };
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: initializing YouTube Player.");
                myouTubePlayerView.initialize(YouTubeConfig.getApiKey(), monInitializedListener);
            }
        });




        monInitializedListener1 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG1, "onClick: Done initializing.");

                List<String> videoList = new ArrayList<>();
                videoList.add("r7r8zrbOOlk");
//                videoList.add("2duc77R4Hqw");

                youTubePlayer.loadVideos(videoList);
                //   youTubePlayer.loadPlaylist("https://www.youtube.com/watch?v=VriiDn676PQ");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG1, "onClick: Failed to initialize.");
            }
        };
        btnplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG1, "onClick: initializing YouTube Player.");
                myouTubePlayerView1.initialize(YouTubeConfig.getApiKey(), monInitializedListener1);
            }
        });

    }
}
