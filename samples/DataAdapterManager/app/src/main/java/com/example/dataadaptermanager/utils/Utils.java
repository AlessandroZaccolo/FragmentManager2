package com.example.dataadaptermanager.utils;

import com.example.dataadaptermanager.data.MyListItem;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<MyListItem> getListData() {
        String[] listItems = { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu",
                "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Android", "iPhone", "WindowsMobile"};

        // 'ArrayList' with image references (DO NOT INCLUDE FILE EXTENSIONS!)

        String[] listImages = {"androidicon","iphoneicon", "windowsmobileicon","blackberryicon",
                "webosicon", "ubuntuicon", "win7icon", "macosxicon", "linuxicon", "os2icon", "ubuntuicon",
                "win7icon", "macosxicon", "linuxicon", "os2icon", "ubuntuicon","win7icon", "macosxicon",
                "linuxicon", "os2icon", "androidicon", "iphoneicon", "windowsmobileicon"
        };


        List<MyListItem> myListItems = new ArrayList<>();
        for (int i = 0; i < listItems.length; i++){
            MyListItem item = new MyListItem(listImages[i], listItems[i], "this could be anything");
            myListItems.add(item);
        }
        return myListItems;
    }
}
