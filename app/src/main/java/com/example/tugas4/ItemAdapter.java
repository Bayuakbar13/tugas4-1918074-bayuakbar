package com.example.tugas4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    private ArrayList<Item> dataList;
    public ItemAdapter(ArrayList<Item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txt_namatim.setText(dataList.get(position).getNamatim());
        holder.txt_ceo.setText(dataList.get(position).getCeo());
        holder.txt_negara.setText(dataList.get(position).getNegara());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_namatim, txt_ceo, txt_negara;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txt_namatim = (TextView)
                    itemView.findViewById(R.id.txt_namatim);
            txt_ceo = (TextView)
                    itemView.findViewById(R.id.txt_ceo);
            txt_negara = (TextView)
                    itemView.findViewById(R.id.txt_negara);
        }
    }
}
