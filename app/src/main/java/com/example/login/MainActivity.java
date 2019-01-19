package com.example.login;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout1,relativeLayout2;
    Button btn;
    Handler handler=new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            relativeLayout1.setVisibility(View.VISIBLE);
            relativeLayout2.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.singup);
        relativeLayout1=findViewById(R.id.relative1);
        relativeLayout2=findViewById(R.id.realtive2);
        handler.postDelayed(runnable,2000);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),singup.class);
                startActivity(intent);
            }
        });
    }
}
