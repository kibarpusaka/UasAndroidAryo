package com.aryo.jenissepatu;

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

public class ListSepatu extends RecyclerView.Adapter<ListSepatu.ListViewHolder> {
    private ArrayList<SepatuArchitecture> listSepatu;

    private OnItemClickCallback onItemClickCallback;

    public ListSepatu(ArrayList<SepatuArchitecture> list) {
        this.listSepatu = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_sepatu, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        SepatuArchitecture nw = listSepatu.get(position);

        Glide.with(holder.itemView.getContext())
                .load(nw.getPhoto())
                .apply(new RequestOptions().override(60, 60))
                .into(holder.imgSepatu);
        holder.tvNickName.setText(nw.getNickName());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSepatu.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSepatu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgSepatu;
        TextView tvFullName, tvNickName, tvDetail;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgSepatu = itemView.findViewById(R.id.tv_sepatu_photo);
            tvFullName = itemView.findViewById(R.id.tv_full_name);
            tvNickName = itemView.findViewById(R.id.tv_nick_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);


        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(SepatuArchitecture data);
    }

}
