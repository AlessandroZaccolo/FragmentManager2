package com.example.dataadaptermanager.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dataadaptermanager.R;
import com.example.dataadaptermanager.data.MyListItem;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<MyListItem> {

    private Context ctx;
    private int layoutResource;
    private List<MyListItem> listItems;


    public MyListAdapter(@NonNull Context context, int resource, @NonNull List<MyListItem> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layoutResource = resource;
        this.listItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layoutResource, null);

        ImageView imgThumb = convertView.findViewById(R.id.customer__adapter_main__img__thumbnail);
        imgThumb.setImageResource(ctx.getResources().getIdentifier(
                listItems.get(position).getItemImage(),
                "drawable",
                ctx.getPackageName()));

        TextView tvTitle = convertView.findViewById(R.id.custom_adapter_main__tv__title);
        tvTitle.setText(listItems.get(position).getItemTitle());

        TextView tvBody = convertView.findViewById(R.id.custom_adapter__main__tv__body);
        tvBody.setText(listItems.get(position).getItemBody());

        return convertView;
    }
}
