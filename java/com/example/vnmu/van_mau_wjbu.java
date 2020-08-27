package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class van_mau_wjbu extends AppCompatActivity{
    private ListView listView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_van_mau_wjbu);

        listView = (ListView) findViewById(R.id.listWjbu);
        textView = (TextView) findViewById(R.id.text3);


        final String[] tVanMau = getResources().getStringArray(R.array.title_vanmai_wjbu);
        final String[] dVanMauwibu = getResources().getStringArray(R.array.detail_vanmau_wjbu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tVanMau);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String t = dVanMauwibu[i];
                Intent intent = new Intent(van_mau_wjbu.this, inside_van_mau_wjbu.class);
                intent.putExtra("Văn Mẫu Wibu", t);
                startActivity(intent);
            }
        });
    }
}