package com.example.apps;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button write,video,fun;

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

           fun=(Button) findViewById(R.id.Fun);
           fun.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   openActivity_fun();
               }
           });


//        if(haveNetwork())
//        {
//
//        }
//        else if(!haveNetwork())
//        {
//            Toast.makeText(MainActivity.this,"Network connect in not availbale",Toast.LENGTH_SHORT).show();
//        }



    }


//    private boolean haveNetwork()
//    {
//        boolean have_WIFI=false;
//        boolean have_MobileData=false;
//
//
//        ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
//        NetworkInfo[] networkInfos=connectivityManager.getAllNetworkInfo();
//
//        for(NetworkInfo info:networkInfos)
//        {
//            if(info.getTypeName().equalsIgnoreCase("WIFI"))
//                if(info.isConnected())
//                    have_WIFI=true;
//            if(info.getTypeName().equalsIgnoreCase("MOBILE"))
//                if(info.isConnected())
//                    have_MobileData=true;
//        }
//        return have_MobileData=true;
//    }

    public void openActivity_fun()
    {
        Intent intent=new Intent(this,youtube_fun.class);
        startActivity(intent);
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
