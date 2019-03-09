package com.example.apps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button write,video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        write=(Button)findViewById(R.id.Write);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_Write();
            }
        });

        video=(Button) findViewById(R.id.Video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_video();
            }
        });

    }

    public void openActivity_Write()
    {
        Intent intent=new Intent(this,MainActivity_Writeing.class);
        startActivity(intent);
    }

    public void openActivity_video()
    {
        Intent intent=new Intent(this,MainActivity_video.class);
        startActivity(intent);
    }




}
