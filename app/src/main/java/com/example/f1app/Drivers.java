package com.example.f1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Date;

public class Drivers extends AppCompatActivity {
    private String myIP;
    private ArrayList<String> listview_array;
    ListView myList;
    DriversList dlst = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);

        Intent intent = getIntent();
        myIP = intent.getStringExtra("myIP");

        ImageView logo = (ImageView) findViewById(R.id.imageView2);
        logo.setVisibility(View.VISIBLE);
        String url = "https://images.immediate.co.uk/production/volatile/sites/3/2016/02/99939.jpg?quality=90&resize=620,413";
        Picasso.with(getApplicationContext()).load(Uri.parse(url)).into(logo);

        try {
            dlst = new DriversList(myIP);
            listview_array = dlst.getNamesList();
            myList=(ListView) findViewById(R.id.listView);
            myList.setAdapter(new ArrayAdapter<String>(this,
                    R.layout.custom_list_item,
                    listview_array));
        } catch (Exception e) {
            e.printStackTrace();
        }

        TextView txt = (TextView) findViewById(R.id.textView4);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String adriver = (String) ((TextView) view).getText();
                Driver selectedDriver = dlst.findDriver(adriver);
                ImageView logo = (ImageView) findViewById(R.id.imageView2);
                logo.setVisibility(View.VISIBLE);
                String url = selectedDriver.getImage();
                Picasso.with(getApplicationContext()).load(Uri.parse(url)).into(logo);
                txt.setText(selectedDriver.getName()+" ("+selectedDriver.getTeam()+")");

                String logurl= "http://"+myIP+"/logSelection.php?selection=" + selectedDriver.getName() + "&timestamp=" + new Date(System.currentTimeMillis()).toString();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.logHistory(logurl);
                    Toast.makeText(getApplicationContext(), "Selection Logged", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}