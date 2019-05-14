package com.example.experiment_8;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = findViewById(R.id.videoView);
        video.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/raw/" + R.raw.app_covers_apple_outline));
        video.start();
    }

    public void play(View view) { video.start(); }

    public void pause(View view) {
        video.pause();
    }

    public  void replay(View view) {
        video.resume();
    }
}
