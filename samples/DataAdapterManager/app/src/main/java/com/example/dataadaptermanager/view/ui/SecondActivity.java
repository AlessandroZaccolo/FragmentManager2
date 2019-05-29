package com.example.dataadaptermanager.view.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.dataadaptermanager.R;
import com.example.dataadaptermanager.data.MyListItem;
import com.example.dataadaptermanager.utils.Utils;
import com.example.dataadaptermanager.view.adapter.MyRecycleViewAdapter;

import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<MyListItem> myListItems = Utils.getListData();

        final RecyclerView recyclerView = findViewById(R.id.activity__main__rv__data);
        // recyclerView.setLayoutManager(new GridLayoutManager(this, 3, RecyclerView.HORIZONTAL, false));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, RecyclerView.HORIZONTAL));
        recyclerView.setAdapter(new MyRecycleViewAdapter(this, myListItems));
    }
}
