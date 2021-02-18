package com.example.myapplication.sampledata;

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

    addItem(new DataItem(null, "menuitem1",
            "A description","A category",1,9.95,"siamesisktvilling.jpg" ));
    addItem(new DataItem(null, "menuitem2",
            "A description","A category",1,9.95,"siamesisktvilling.jpg" ));
    addItem(new DataItem(null, "menuitem3",
            "A description","A category",1,9.95,"siamesisktvilling.jpg" ));
    addItem(new DataItem(null, "menuitem4",
            "A description","A category",1,9.95,"siamesisktvilling.jpg" ));
    addItem(new DataItem(null, "menuitem5",
            "A description","A category",1,9.95,"siamesisktvilling.jpg" ));
    addItem(new DataItem(null, "menuitem6",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem7",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem8",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem9",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem10",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem11",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem12",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem13",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem14",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "item15",
            "A description","A category",1,9.95,"apple_pie.jpg" ));
    addItem(new DataItem(null, "menuitem16",
            "A description","A category",1,9.95,"siamesisktvilling.jpg" ));


}
private static void addItem(DataItem item){
dataItemList.add(item);
dataItemMap.put(item.getItemId(),item);


}
}
