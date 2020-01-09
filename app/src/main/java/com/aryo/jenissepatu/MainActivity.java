package com.aryo.jenissepatu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSepatu;
    private ArrayList<SepatuArchitecture> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSepatu = findViewById(R.id.rv_sepatu);
        rvSepatu.setHasFixedSize(true);

        list.addAll(SepatuData.getListData());

        showRecyclerList();
    }
    private void showRecyclerList() {
        rvSepatu.setLayoutManager(new LinearLayoutManager(this));
        ListSepatu listAnime = new ListSepatu(list);
        rvSepatu.setAdapter(listAnime);

        listAnime.setOnItemClickCallback(new ListSepatu.OnItemClickCallback() {
            @Override
            public void onItemClicked(SepatuArchitecture data) {

                showSelectedData(data);
            }
        });
    }



    public void showSelectedData(SepatuArchitecture nw) {
        Intent detailIntent = new Intent(MainActivity.this, DetailSepatu.class);
        detailIntent.putExtra(DetailSepatu.EXTRA_IMG, nw.getPhoto());
        detailIntent.putExtra(DetailSepatu.EXTRA_FULLNAME, nw.getFullName());
        detailIntent.putExtra(DetailSepatu.EXTRA_NICKNAME, nw.getNickName());
        detailIntent.putExtra(DetailSepatu.EXTRA_DETAIL, nw.getDetail());

        startActivity(detailIntent);
    }
}
