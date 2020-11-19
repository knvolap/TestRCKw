package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv1, rcv2;
    private MonAn_Adapter monAn_adapter;
    private CHGB_Adapter chgb_adapter;
    private Context context, context2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv1 = findViewById(R.id.RecyclerView_maim1);
        rcv1.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        rcv1.setLayoutManager(linearLayoutManager1);
        monAn_adapter = new MonAn_Adapter();
        monAn_adapter.setData(getListMonAn());
        rcv1.setAdapter(monAn_adapter);

        rcv2 = findViewById(R.id.RecyclerView_maim2);
        rcv2.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context2, RecyclerView.VERTICAL, false);
        rcv2.setLayoutManager(linearLayoutManager2);
        chgb_adapter = new CHGB_Adapter();
        chgb_adapter.setData(getListCHGB());
        rcv2.setAdapter(chgb_adapter);


    }

    private List<MonAn_sup> getListMonAn() {
        List<MonAn_sup> listMonAn = new ArrayList<>();
        listMonAn.add(new MonAn_sup("Bánh mì", R.drawable.cttl_1));
        listMonAn.add(new MonAn_sup("Deal mới", R.drawable.cttl_2));
        listMonAn.add(new MonAn_sup("Deal mới", R.drawable.cttl_3));
        listMonAn.add(new MonAn_sup("Deal mới", R.drawable.cttl_3));
        listMonAn.add(new MonAn_sup("Deal mới", R.drawable.cttl_2));
        listMonAn.add(new MonAn_sup("Deal mới", R.drawable.cttl_3));
        listMonAn.add(new MonAn_sup("Deal mới", R.drawable.cttl_3));
        return listMonAn;
    }


    private List<CHGB_sup> getListCHGB() {
        List<CHGB_sup> list_CHGB = new ArrayList<>();
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_1));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_2));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_3));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_1));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_2));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_3));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_1));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_2));
        list_CHGB.add(new CHGB_sup("Bóp bư bự", " 6.5km", "Freeship", R.drawable.chgb_3));

        return list_CHGB;


    }


}




