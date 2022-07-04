package com.example.f1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private String myIP = "192.168.1.10";  //////Change the ip here and in network_security_config.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = (ImageView) findViewById(R.id.imageView);
        logo.setVisibility(View.VISIBLE);
        String url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/F1.svg/2560px-F1.svg.png";
        Picasso.with(getApplicationContext()).load(Uri.parse(url)).into(logo);

        //teams
        final Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Teams.class);
                myIntent.putExtra("myIP", myIP);
                startActivity(myIntent);
            }
        });

        //drivers
        final Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Drivers.class);
                myIntent.putExtra("myIP", myIP);
                startActivity(myIntent);
            }
        });
    }
}