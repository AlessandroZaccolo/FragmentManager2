package com.example.dataadaptermanager.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.dataadaptermanager.R;
import com.example.dataadaptermanager.data.MyListItem;
import com.example.dataadaptermanager.utils.Utils;

public class Main2Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setListAdapter(new ArrayAdapter<MyListItem>(
                this, android.R.layout.simple_list_item_1,
                Utils.getListData()
        ));
    }
}
