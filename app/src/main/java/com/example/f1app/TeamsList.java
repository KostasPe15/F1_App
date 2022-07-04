package com.example.f1app;

import java.util.ArrayList;

public class TeamsList {
    ArrayList<Team> tList = new ArrayList<>();

    public TeamsList(String ip) throws Exception {
        String url = "http://"+ip+"/getF1Teams.php";
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            tList = okHttpHandler.getTeams(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Team findTeam(String name){
        for(int i=0;i<tList.size();i++){
            if(tList.get(i).getName().equals(name)){
                return tList.get(i);
            }
        }
        return null;
    }

    public ArrayList<String> getNamesList() {
        ArrayList<String> nList = new ArrayList<>();
        for(int i=0;i<tList.size();i++){
            nList.add(tList.get(i).getName());
        }
        return nList;
    }
}
