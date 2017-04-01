package com.whitebird.beautycare.FullImgPage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.whitebird.beautycare.R;

public class ClsFullImgViewPager extends AppCompatActivity{

    ViewPager viewPagerfull;
    FullImgForGridStore fullImgForGridStore;
    FullImgPagerAdapter fullImgPagerAdapter;
    String name_selected;
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cls_full_img_view_pager);
        adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("1720EC3DF18CC1184849510529D6A998")
                .build();

        Bundle bundle = getIntent().getExtras();
        final int position = bundle.getInt("position");
        name_selected = getIntent().getStringExtra("name");

        fullImgForGridStore = new FullImgForGridStore(name_selected);
        viewPagerfull = (ViewPager)findViewById(R.id.view_pager_for_full_img);
        fullImgPagerAdapter = new FullImgPagerAdapter(this,fullImgForGridStore.getFullImgsForGridViews());
        viewPagerfull.setAdapter(fullImgPagerAdapter);
        viewPagerfull.setCurrentItem(position);
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
