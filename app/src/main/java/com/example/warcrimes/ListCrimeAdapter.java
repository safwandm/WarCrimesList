package com.example.warcrimes;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;



public class ListCrimeAdapter extends RecyclerView.Adapter<ListCrimeAdapter.ListViewHolder> {
    private ArrayList<Crime> listCrime;

    public ListCrimeAdapter(ArrayList list) {
        this.listCrime = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_crimes, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Crime crime = listCrime.get(position);
        Glide.with(holder.itemView.getContext())
                .load(crime.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(crime.getName());
        holder.tvDetail.setText(crime.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmove = new Intent(view.getContext(),DetailActivity.class);
                intentmove.putExtra("objek",listCrime.get(position));
                view.getContext().startActivity(intentmove);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCrime.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;
        public TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}