package com.example.apps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity_Writeing extends AppCompatActivity {
    private PaintView paintView;
    private Button reset,red,blue,black,erase;
    private ViewPager viewPager;
    int halaman=0;
    private int[] mImageIds = new int[] {R.drawable.o,R.drawable.a,R.drawable.e,R.drawable.ei,R.drawable.ouuu,R.drawable.ui,R.drawable.rri,R.drawable.eii,R.drawable.oii,R.drawable.u,R.drawable.oio,};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__writeing);




        paintView=(PaintView) findViewById(R.id.Draw);
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);

        red=(Button) findViewById(R.id.Red_button);
        red.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.red();
            }
        }));

        blue=(Button) findViewById(R.id.Blue_button);
        blue.setOnClickListener(new View.OnClickListener() {
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

        black=(Button) findViewById(R.id.Black_button);
        black.setOnClickListener(new View.OnClickListener() {
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

    public void next(View view){
            viewPager.setCurrentItem(viewPager.getCurrentItem()+1,true);

    }
    public void back(View view){
        viewPager.setCurrentItem(viewPager.getCurrentItem()-1,true);

    }




}
