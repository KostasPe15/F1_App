package com.example.f1app;

import android.os.StrictMode;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpHandler {

    public OkHttpHandler() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    //Returns ArrayList with all the teams from the db
    ArrayList<Team> getTeams(String url) throws Exception {
        ArrayList<Team> tList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String team = keys.next();
                String name = json.getJSONObject(team).getString("name").toString();
                String image = json.getJSONObject(team).getString("image").toString();
                tList.add(new Team(team, name, image));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return tList;
    }

    //Returns ArrayList with all the drivers from the db
    public ArrayList<Driver> getDrivers(String url) throws IOException {
        ArrayList<Driver> dList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String id = keys.next();
                String name = json.getJSONObject(id).getString("name").toString();
                String team = json.getJSONObject(id).getString("team").toString();
                String image = json.getJSONObject(id).getString("image").toString();
                dList.add(new Driver(id, name,team, image));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return dList;
    }

    //Void to log the selection history in the db
    public void logHistory(String url) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        RequestBody body = RequestBody.create("", MediaType.parse("text/plain"));
        Request request = new Request.Builder().url(url).method("POST", body).build();
        Response response = client.newCall(request).execute();
        System.out.println("My Response: " + response);
    }
}
