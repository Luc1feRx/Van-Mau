package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class van_mau_3 extends AppCompatActivity {
    private ListView lstView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_van_mau_3);

        lstView3 = (ListView) findViewById(R.id.list3);

        String[] tVanMaupost = getResources().getStringArray(R.array.title_vanmau_post);
        final String[] dVanMaupost= getResources().getStringArray(R.array.detailpost);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tVanMaupost);

        lstView3.setAdapter(adapter);

        lstView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String t = dVanMaupost[i];
                Intent intent = new Intent(van_mau_3.this, inside_vanmau_kn.class);
                intent.putExtra("Văn Mẫu Post", t);
                startActivity(intent);
            }
        });

    }
}