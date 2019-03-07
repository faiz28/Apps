package com.example.apps;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private PaintView paintView;
    private Button reset,normal,blur,emboss,erase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paintView=(PaintView) findViewById(R.id.Draw);
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);

        normal=(Button) findViewById(R.id.normal_button);
        normal.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.normal();
            }
        }));

        blur=(Button) findViewById(R.id.Blur_button);
        blur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.blur();
            }
        });

        reset=(Button) findViewById(R.id.reset_button);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.clear();
            }
        });

        emboss=(Button) findViewById(R.id.Black_button);
        emboss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.emboss();
            }
        });

        erase=(Button) findViewById(R.id.Erase);
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.Erase();
            }
        });



    }


}
