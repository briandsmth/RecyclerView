package com.briand.tugas_1718060_family;

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
import java.util.zip.Inflater;


public class familyAdapter extends RecyclerView.Adapter<familyAdapter.ListViewHolder>{
    private ArrayList<family> listfamily;

    public familyAdapter(ArrayList<family> list) {
        this.listfamily = list;

    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_family, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        family Family = listfamily.get(position);

        Glide.with(holder.itemView.getContext())
                .load(Family.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.photo);

        holder.tv_nama.setText(Family.getNama());
        holder.tv_detail.setText(Family.getSebagai());

    }

    @Override
    public int getItemCount() {
        return listfamily.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_detail;
        ImageView photo;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_item_name);
            tv_detail = itemView.findViewById(R.id.tv_item_detail);
            photo = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
