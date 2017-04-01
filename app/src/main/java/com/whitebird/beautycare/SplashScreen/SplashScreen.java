package com.whitebird.beautycare.SplashScreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;

import com.whitebird.beautycare.ImagesAndTextStore.ClsPageOneBeautyActivityMain;
import com.whitebird.beautycare.R;


public class SplashScreen extends AppCompatActivity {
    SharedPreferences sharedPreference;
    private static boolean splashLoaded = false;
    public static final String MY_PREFS_NAME = "MyPrefsFile";
    @SuppressWarnings("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_splash_screen);
        //RelativeLayout currentLayout = (RelativeLayout)findViewById(R.layout.activity_yoga_splash_screen);
        //currentLayout.setBackgroundResource(R.drawable.facecare1);
        sharedPreference =  getSharedPreferences(MY_PREFS_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreference.edit();

        int s = sharedPreference.getInt("idName", 0);
        /*if (s==1||s==2){
            editor.putInt("idName", 3);
            editor.commit();
        }else
        if (s==3||s==2){
            editor.putInt("idName", 1);
            editor.commit();
        }else
        if (s==3||s==1){
            editor.putInt("idName", 2);
            editor.commit();
        }else
            editor.putInt("idName", 1);
            editor.commit();*/
        /*switch (value){
            case 1:
                currentLayout.setBackgroundResource(R.drawable.facecare1);
                value = 2;
                break;
            case 2:
                currentLayout.setBackgroundResource(R.drawable.facecare2);
                value = 3;
                break;
            case 3:
                currentLayout.setBackgroundResource(R.drawable.facecare3);
                value = 1;
                break;
        }*/

        if (!splashLoaded) {
            //Code To On Full Screen Mode
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            setContentView(R.layout.activity_yoga_splash_screen);
            ImageView imageView = (ImageView)findViewById(R.id.splash_imageview);

            switch (s){
                case 1:
                    //this.findViewById(R.id.activity_yoga_splash_screen).setBackgroundResource(R.drawable.beauty_splash1);
                    imageView.setImageResource(R.drawable.beauty_splash1);
                    editor.putInt("idName", 2);
                    editor.commit();
                    break;
                case 2:
                    //this.findViewById(R.id.activity_yoga_splash_screen).setBackgroundResource(R.drawable.beauty_splash2);
                    imageView.setImageResource(R.drawable.beauty_splash2);
                    editor.putInt("idName", 3);
                    editor.commit();
                    break;
                case 3:
                    //this.findViewById(R.id.activity_yoga_splash_screen).setBackgroundResource(R.drawable.beauty_splash3);
                    imageView.setImageResource(R.drawable.beauty_splash3);
                    editor.putInt("idName", 1);
                    editor.commit();
                    break;
                default:
                    //this.findViewById(R.id.activity_yoga_splash_screen).setBackgroundResource(R.drawable.beauty_splash1);
                    imageView.setImageResource(R.drawable.beauty_splash1);
                    editor.putInt("idName", 3);
                    editor.commit();
                    break;
            }
            //getWindow().setBackgroundDrawableResource(R.drawable.facecare1);
            int secondsDelayed = 1;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(SplashScreen.this, ClsPageOneBeautyActivityMain.class));
                    finish();
                }
            }, secondsDelayed * 500);

            splashLoaded = true;
        }
        else {
            Intent goToMainActivity = new Intent(SplashScreen.this, ClsPageOneBeautyActivityMain.class);
            goToMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToMainActivity);
            finish();
        }
    }
}
