package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView vanMau1, vanMau2, vanMau3, vanMau4, vanMau5, vanMau6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
       vanMau1 = (CardView) findViewById(R.id.cardView1);
       vanMau2 = (CardView) findViewById(R.id.cardView2);
       vanMau3 = (CardView) findViewById(R.id.cardView3);
       vanMau4 = (CardView) findViewById(R.id.cardView4);
       vanMau5 = (CardView) findViewById(R.id.cardView5);
       vanMau6 = (CardView) findViewById(R.id.cardView6);

       // Add clicklistener cho các CardView

        vanMau1.setOnClickListener(this);
        vanMau2.setOnClickListener(this);
        vanMau3.setOnClickListener(this);
        vanMau4.setOnClickListener(this);
        vanMau5.setOnClickListener(this);
        vanMau6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.cardView1 : i = new Intent(this, van_mau_wjbu.class);startActivity(i);
                Toast.makeText(MainActivity.this, "Văn mẫu Wibu", Toast.LENGTH_SHORT).show();
            break;
            case R.id.cardView2 : i = new Intent(this, van_mau_2.class);startActivity(i);
                Toast.makeText(MainActivity.this, "Chửi nhau cực mạnh", Toast.LENGTH_SHORT).show();
            break;
            case R.id.cardView3 : i = new Intent(this, van_mau_3.class);startActivity(i);
                Toast.makeText(MainActivity.this, "Post này tôi muốn......", Toast.LENGTH_SHORT).show();
            break;
            case R.id.cardView4 : i = new Intent(this, van_mau_4.class);startActivity(i);
                Toast.makeText(MainActivity.this, "Khiến người khác khó chịu khi nhìn vào!!", Toast.LENGTH_SHORT).show();
            break;
            case R.id.cardView5 : i = new Intent(this, van_mau_5.class);startActivity(i);
                Toast.makeText(MainActivity.this, "Văn học và nghệ thuật", Toast.LENGTH_SHORT).show();
            break;
            case R.id.cardView6 : i = new Intent(this, reportandfeedback.class);startActivity(i);
                Toast.makeText(MainActivity.this, "Report and Feedback", Toast.LENGTH_SHORT).show();
            default: break;

        }
    }
}