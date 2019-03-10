package com.example.apps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity_Writeing extends AppCompatActivity {
    private PaintView paintView;
    private Button reset,normal,blur,emboss,erase;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__writeing);


        paintView=(PaintView) findViewById(R.id.Draw);
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);

        normal=(Button) findViewById(R.id.Red_button);
        normal.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.red();
            }
        }));

        blur=(Button) findViewById(R.id.Blue_button);
        blur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.blue();
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
                paintView.black();
            }
        });

        erase=(Button) findViewById(R.id.Erase);
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.Erase();
            }
        });

        viewPager=findViewById(R.id.viewPager);
        ImageAdapter adapter= new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }




}
