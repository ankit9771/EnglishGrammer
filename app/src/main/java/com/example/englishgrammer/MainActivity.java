package com.example.englishgrammer;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import android.os.Bundle;




    public class MainActivity extends AppCompatActivity {
        private AdView mAdView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
            pdfView.fromAsset("filename.pdf").load();

            MobileAds.initialize(this,
                    "ca-app-pub-9757783104883384~1718793701");

            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        }


        }


