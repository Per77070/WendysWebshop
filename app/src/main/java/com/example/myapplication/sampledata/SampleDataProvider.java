package com.example.myapplication.sampledata;

import com.example.myapplication.model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {
    public static List<DataItem> dataItemList;
    public static Map<String,DataItem> dataItemMap;

static {

    dataItemList = new ArrayList<>();
    dataItemMap=new HashMap<>();

    addItem(new DataItem(null, "Tom Yum Goong",
            "A description","Thai",1,9.95,"tom_yum_goong.jpg" ));
    addItem(new DataItem(null, "Pad Thai",
            "A description","Thai",2,9.95,"pad_thai.jpg" ));
    addItem(new DataItem(null, "Som Tam",
            "A description","Thai",3,9.95,"som_tam.jpg" ));
    addItem(new DataItem(null, "Tom Kha Gai",
            "A description","Thai",4,9.95,"tom_kha_gai.jpg" ));
    addItem(new DataItem(null, "Sushi",
            "A description","Japanese",5,9.95,"sushi.jpg" ));
    addItem(new DataItem(null, "Tempura",
            "A description","Japanese",6,9.95,"tempura.jpg" ));
    addItem(new DataItem(null, "Yakitori",
            "A description","Japanese",7,9.95,"yakitori.jpg" ));
    addItem(new DataItem(null, "Kaiseki",
            "A description","Japanese",8,9.95,"kaiseki.jpg" ));
    addItem(new DataItem(null, "Sichuan Pork",
            "A description","Chinese",9,9.95,"sichuan_pork.jpg" ));
    addItem(new DataItem(null, "Braised Pork Balls in Gravy",
            "A description","Chinese",10,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "Dumplings",
            "A description","Chinese",11,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "Chow Mein",
            "A description","Chinese",12,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "Peking Roasted Duck",
            "A description","Chinese",13,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "Fried Shrimp with Cashew Nuts",
            "A description","Chinese",14,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "Kung Pao Chicken",
            "A description","Chinese",15,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "Wontons",
            "A description","Chinese",16,9.95,"siamesisktvilling.jpg" ));


}
private static void addItem(DataItem item){
dataItemList.add(item);
dataItemMap.put(item.getItemId(),item);


}
}
