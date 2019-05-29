package com.example.dataadaptermanager.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dataadaptermanager.R;
import com.example.dataadaptermanager.data.MyListItem;

import java.util.List;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.MyViewHolder> {


    private final Context ctx;
    private final List<MyListItem> listitems;

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgThumb;
        private TextView tvTitle;
        private TextView tvBody;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            this.imgThumb = itemView.findViewById(R.id.customer__adapter_main__img__thumbnail);
            this.tvTitle = itemView.findViewById(R.id.custom_adapter_main__tv__title);
            this.tvBody = itemView.findViewById(R.id.custom_adapter__main__tv__body);
        }

    }

    public MyRecycleViewAdapter(Context context, List<MyListItem> objects){
        this.ctx = context;
        this.listitems = objects;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(ctx)
                .inflate(R.layout.custom_adapter_main, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imgThumb.setImageResource(ctx.getResources().getIdentifier(
                listitems.get(position).getItemImage(),
                "drawable",
                ctx.getPackageName()));
        holder.tvTitle.setText(listitems.get(position).getItemTitle());
        holder.tvBody.setText(listitems.get(position).getItemBody());


    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

}
