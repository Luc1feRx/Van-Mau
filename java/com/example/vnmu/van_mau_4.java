package com.example.vnmu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class van_mau_4 extends AppCompatActivity {
    private ListView lstView4;
    DatabaseReference databaseReference;
    List<String> title_list, van_mau_list;
    ArrayAdapter<String> adapter;
    MyVanMau myVanMau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_van_mau_4);

        lstView4 = (ListView) findViewById(R.id.listkc);
        databaseReference = FirebaseDatabase.getInstance().getReference("vanmau");// truyền dẫn từ tệp vanmau trên firebase
        myVanMau = new MyVanMau();//tạo ra class mới MyVanMau
        title_list = new ArrayList<>();
        van_mau_list = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, R.layout.items, R.id.items_txt, title_list);

        databaseReference.addValueEventListener(new ValueEventListener() { //nhận sự kiện add giá trị của firebase
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                title_list.clear();
                van_mau_list.clear();

                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    myVanMau = ds.getValue(MyVanMau.class);
                    if(myVanMau != null) {
                        title_list.add(myVanMau.getTitle());
                    }
                    if(myVanMau != null) {
                        van_mau_list.add(myVanMau.getVan_mau());
                    }
                }
                lstView4.setAdapter(adapter);
                lstView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(van_mau_4.this, inside_vanmau_khochiu.class);
                        String pos = van_mau_list.get(i);
                        intent.putExtra("key", pos);
                        startActivity(intent);
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });
    }
}