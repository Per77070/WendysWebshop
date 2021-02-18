package com.example.myapplication;

import android.content.Context;
import android.util.Log;

import com.example.myapplication.sampledata.DataItem;
import com.google.gson.Gson;

import java.util.List;

public class JSONHelper {

    private static final String FILE_NAME= "menuitems.json";
    private static final String TAG= "JSONHelper";

public static boolean exportToJSON(Context context, List<DataItem> dataItemList){
DataItem menuData = new DataItem();
    Gson gson = new Gson();
String jsonString = gson.toJson(menuData);
    Log.i(TAG, "exportToJSON: "+jsonString);


    return false;

}



    public static List<DataItem> importFromJSON(Context context){

    class DataItems {
List<DataItem> dataItems;

        public List<DataItem> getDataItems() {
            return dataItems;
        }

        public void setDataItems(List<DataItem> dataItems) {
            this.dataItems = dataItems;
        }
    }











   return null;


}}
