package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class van_mau_5 extends AppCompatActivity {

    private ListView lstView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_van_mau_5);

        lstView5 = (ListView) findViewById(R.id.list5);
        String[] tVanMau5 = getResources().getStringArray(R.array.title_vh);
        final String[] dVanMau5= getResources().getStringArray(R.array.detail_vh);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tVanMau5);

        lstView5.setAdapter(adapter);

        lstView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String t = dVanMau5[i];
                Intent intent = new Intent(van_mau_5.this, inside_vanmau_5.class);
                intent.putExtra("Văn Mẫu vh", t);
                startActivity(intent);
            }
        });
    }
}