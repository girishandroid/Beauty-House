package com.whitebird.beautycare.FullListImgAndTxtData;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.whitebird.beautycare.R;

public class ClsListViewForDescription extends AppCompatActivity {

    ListView listViewForDescription;
    String main_name;
    FullImgAndTxtDataStore fullImgAndTxtDataStore;
    AdView adView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cls_list_view_for_description);
        adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("1720EC3DF18CC1184849510529D6A998")
                .build();

        main_name = getIntent().getStringExtra("MainName");
        setTitle(main_name);
        fullImgAndTxtDataStore = new FullImgAndTxtDataStore(main_name);
        listViewForDescription = (ListView)findViewById(R.id.list_view_description);

        listViewForDescription.setAdapter(new DescriptionListAdapter(this,fullImgAndTxtDataStore.getDataImgTxtArrayList(),main_name));
        if (isNetworkConnected()) {
            adView.loadAd(adRequest);
        }
    }
    private boolean isNetworkConnected() {

        ConnectivityManager cm = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni == null) {
            // There are no active networks.
            //Set the visibility to "gone".
            //You can set visibility to gone here or when the function returns,
            //that is why there is a return false and true.
            adView.setVisibility(View.GONE);
            return false;
        } else
            return true;
    }


}
