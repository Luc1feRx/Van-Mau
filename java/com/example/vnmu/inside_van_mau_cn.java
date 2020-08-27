package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

public class inside_van_mau_cn extends AppCompatActivity {

    private TextView textViewcn;
    private Button btnCopy;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_van_mau_cn);

        textViewcn = (TextView) findViewById(R.id.textcn);
        btnCopy = (Button) findViewById(R.id.buttonCopy2);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9301082215272747/8247992316");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        String dVanMaucn = getIntent().getStringExtra("Văn Mẫu chửi nhau");

        textViewcn.setText(dVanMaucn);

        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    ClipData clipData = ClipData.newPlainText("Văn Mẫu chửi nhau", textViewcn.getText());
                    clipboardManager.setPrimaryClip(clipData);
                    Toast.makeText(getApplicationContext(), "Copied!!!", Toast.LENGTH_SHORT).show();
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                        ClipData clipData = ClipData.newPlainText("Văn Mẫu chửi nhau", textViewcn.getText());
                        clipboardManager.setPrimaryClip(clipData);
                        Toast.makeText(getApplicationContext(), "Copied!!!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-9301082215272747/6320010583");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}