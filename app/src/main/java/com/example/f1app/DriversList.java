package com.example.f1app;

import java.util.ArrayList;

public class DriversList {
    ArrayList<Driver> dList = new ArrayList<>();

    public DriversList(String ip) throws Exception {
        String url = "http://"+ip+"/getF1Drivers.php";
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            dList = okHttpHandler.getDrivers(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Driver findDriver(String name){
        for(int i=0;i<dList.size();i++){
            if(dList.get(i).getName().equals(name)){
                return dList.get(i);
            }
        }
        return null;
    }

    public ArrayList<String> getNamesList() {
        ArrayList<String> nList = new ArrayList<>();
        for(int i=0;i<dList.size();i++){
            nList.add(dList.get(i).getName());
        }
        return nList;
    }
}
