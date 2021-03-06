package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MonAn_Adapter extends RecyclerView.Adapter<MonAn_Adapter.UserViewHoder>{
   private List<MonAn_sup> listMonan;

    public MonAn_Adapter() {
    }

    public void  setData(List<MonAn_sup>list){
       this.listMonan=list;
       notifyDataSetChanged();
   }

    @NonNull
    @Override
    public UserViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sup_giaodoan, parent,false);
        return  new UserViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHoder holder, int position) {
        MonAn_sup user=listMonan.get(position);
        if (user==null){
            return;
        }
        holder.tvname_MA.setText(user.getName());
        holder.img_MA.setImageResource(user.getImg());

    }

    @Override
    public int getItemCount() {

        if ( listMonan !=null){
            return listMonan.size();
        }
        return 0;
    }

    public class UserViewHoder extends RecyclerView.ViewHolder{

        private TextView tvname_MA;
        private ImageView img_MA;

        public UserViewHoder(@NonNull View itemView) {
            super(itemView);

            tvname_MA=itemView.findViewById(R.id.text_MonAn);
            img_MA=itemView.findViewById(R.id.img_MonAn);
        }
    }
}
