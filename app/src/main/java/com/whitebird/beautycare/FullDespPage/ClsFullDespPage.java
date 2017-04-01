package com.whitebird.beautycare.FullDespPage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.whitebird.beautycare.R;

public class ClsFullDespPage extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    MyPagerAdapter myPagerAdapter;
    String subName;
    FullDataImgStore fullDataImgStore;
    Button nextButton,prevButton;
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cls_full_desp_page);
        adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("1720EC3DF18CC1184849510529D6A998")
                .build();

        subName = getIntent().getStringExtra("GetSubOptSelected");
        setTitle(subName);
        fullDataImgStore = new FullDataImgStore(subName);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        myPagerAdapter = new MyPagerAdapter(this,fullDataImgStore.getFullDespDataImgs());
        viewPager.setAdapter(myPagerAdapter);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager,true);
        setTitle(subName);
        viewPager.getCurrentItem();
        int totalPages = viewPager.getAdapter().getCount();
        nextButton=(Button)findViewById(R.id.button_next);
        prevButton=(Button)findViewById(R.id.button_prev);
        // Check if we're running on Android 5.0 or higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            nextButton.setBackgroundResource(R.drawable.button_background);
            prevButton.setBackgroundResource(R.drawable.button_background);
            // Call some material design APIs here
        } else {
            // Implement this feature without material design
            //nextButton.setBackgroundColor(getColor(R.color.colorPrimary));
        }
        if (totalPages==1){
            nextButton.setVisibility(View.GONE);
            prevButton.setVisibility(View.GONE);
        }
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousPage();
            }
        });
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
    private void nextPage() {
        int currentPage = viewPager.getCurrentItem();
        int totalPages = viewPager.getAdapter().getCount();

        int nextPage = currentPage+1;
        if (nextPage >= totalPages) {
            // We can't go forward anymore.
            // Loop to the first page. If you don't want looping just
            // return here.
            nextPage = 0;
        }

        viewPager.setCurrentItem(nextPage, true);
    }

    private void previousPage() {
        int currentPage = viewPager.getCurrentItem();
        int totalPages = viewPager.getAdapter().getCount();

        int previousPage = currentPage-1;
        if (previousPage < 0) {
            // We can't go back anymore.
            // Loop to the last page. If you don't want looping just
            // return here.
            previousPage = totalPages - 1;
        }

        viewPager.setCurrentItem(previousPage, true);
    }
}
