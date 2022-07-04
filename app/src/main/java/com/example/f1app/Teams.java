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

public class Teams extends AppCompatActivity {
    private String myIP;
    private ArrayList<String> listview_array;
    ListView myList;
    TeamsList tlst = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        Intent intent = getIntent();
        myIP = intent.getStringExtra("myIP");

        ImageView logo = (ImageView) findViewById(R.id.imageView2);
        logo.setVisibility(View.VISIBLE);
        String url = "https://i.guim.co.uk/img/media/cefc0674922217b6e0d646d338f08412ef9b9ff5/54_207_4975_2985/master/4975.jpg?width=465&quality=45&auto=format&fit=max&dpr=2&s=18894a37cab168ab90a954a18694642a";
        Picasso.with(getApplicationContext()).load(Uri.parse(url)).into(logo);


        try {
            tlst = new TeamsList(myIP);
            listview_array = tlst.getNamesList();
            myList=(ListView) findViewById(R.id.listView);
            myList.setAdapter(new ArrayAdapter<String>(this,
                    R.layout.custom_list_item,
                    listview_array));
        } catch (Exception e) {
            e.printStackTrace();
        }

        TextView txt = (TextView) findViewById(R.id.textView3);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String ateam = (String) ((TextView) view).getText();
                Team selectedTeam = tlst.findTeam(ateam);
                ImageView logo = (ImageView) findViewById(R.id.imageView2);
                logo.setVisibility(View.VISIBLE);
                String url = selectedTeam.getImage();
                Picasso.with(getApplicationContext()).load(Uri.parse(url)).into(logo);
                txt.setText(selectedTeam.getName());

                String logurl= "http://"+myIP+"/logSelection.php?selection=" + selectedTeam.getName() + "&timestamp=" + new Date(System.currentTimeMillis()).toString();
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