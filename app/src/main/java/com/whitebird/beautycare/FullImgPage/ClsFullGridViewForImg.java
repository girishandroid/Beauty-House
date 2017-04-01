package com.whitebird.beautycare.FullImgPage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.whitebird.beautycare.R;

public class ClsFullGridViewForImg extends AppCompatActivity {

    @SuppressLint("StaticFieldLeak")
    GridView gridView;
    FullImgForGridStore fullImgForGridStore;
    String selected_list_name;
    AdView adView;
    public GridViewAdapter gridViewAdapter;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cls_full_grid_view_for_img);
        adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("1720EC3DF18CC1184849510529D6A998")
                .build();

        //String of selected name from list
        selected_list_name = getIntent().getStringExtra("GetSubOptSelected");
        //Grid View For Full Images

        fullImgForGridStore = new FullImgForGridStore(selected_list_name);
        gridViewAdapter = new GridViewAdapter(this,fullImgForGridStore.getFullImgsForGridViews(),selected_list_name);
        gridView = (GridView)findViewById(R.id.full_grid_img_display);
        gridView.setAdapter(gridViewAdapter);


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
