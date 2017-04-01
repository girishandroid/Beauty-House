package com.whitebird.beautycare.ImagesAndTextStore;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.whitebird.beautycare.ContactUs.ContactUs;
import com.whitebird.beautycare.R;

public class ClsPageOneBeautyActivityMain extends AppCompatActivity {
    //List view for main Beauty List
    @SuppressLint("StaticFieldLeak")
    static ListView listViewForMainList;
    ImagesAndTextStore imagesAndTextStore;
    Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cls_pone_beauty_main);
        isStoragePermissionGranted();

        if (!isNetworkConnected()){
            Toast.makeText(this, "If Images Not Load Keep On The Internet Connection", Toast.LENGTH_LONG).show();
        }

        imagesAndTextStore = new ImagesAndTextStore();

        //Call List View For Main Content Display
        listViewForMainList = (ListView)findViewById(R.id.list_view_main_beauty_list);
        listViewForMainList.setAdapter(new AdapterList(this,imagesAndTextStore.getDataImgTxtArrayList()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.contact_us:
                Intent intentContactUs = new Intent(this,ContactUs.class);
                startActivity(intentContactUs);
                break;
            case R.id.share_link:
                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/developer?id=Whitebird+Technology";
                String shareSub = "Share White Bird App";
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                sendIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sendIntent, "Share Using"));
                break;
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }



    public  boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED&&checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("yes","Permission is granted");
                return true;
            } else {

                Log.v("may","Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Log.v("con","Permission is granted");
            return true;
        }
    }
    private boolean isNetworkConnected() {

        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni == null) {
            //showNoConnectionDialog(context);
            // There are no active networks.
            //Set the visibility to "gone".
            //You can set visibility to gone here or when the function returns,
            //that is why there is a return false and true.
            return false;
        } else
            return true;
    }
}
