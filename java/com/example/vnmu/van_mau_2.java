package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class van_mau_2 extends AppCompatActivity {
    private ListView lstView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_van_mau_2);

        lstView = (ListView) findViewById(R.id.listcn);
        String[] tVanMaucn = getResources().getStringArray(R.array.title_vanmau_chuinhau);
        final String[] dVanMaucn= getResources().getStringArray(R.array.detail_vanmau_chuinhau);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tVanMaucn);

        lstView.setAdapter(adapter);

        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String t = dVanMaucn[i];
                Intent intent = new Intent(van_mau_2.this, inside_van_mau_cn.class);
                intent.putExtra("Văn Mẫu chửi nhau", t);
                startActivity(intent);
            }
        });
    }
}