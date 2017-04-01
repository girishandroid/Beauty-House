package com.whitebird.beautycare;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ImageView;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.io.File;

/**
 * Created by girish on 4/3/17.
 */

public class ClsBackgroundImageLoader extends AsyncTask<String, Void, Void> {

    private String stringImageUrl;
    private ImageView imageView;
    private Activity activity;
    private File mediafile;

    public ClsBackgroundImageLoader(Activity activity,String s,ImageView imageView,File mediafile){
        this.activity = activity;
        this.imageView= imageView;
        this.stringImageUrl = s;
        this.mediafile = mediafile;
    }
    @Override
    protected Void doInBackground(String... params) {
        return UniversalLoader(stringImageUrl,imageView,activity,mediafile);
    }

    private Void UniversalLoader(final String stringImageUrl, final ImageView imageView, Activity activity, File mediafile) {

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(activity)
                // You can pass your own memory cache implementation
                .discCache(new UnlimitedDiskCache(mediafile)) // You can pass your own disc cache implementation
                .discCacheFileNameGenerator(new HashCodeFileNameGenerator())
                .build();
        ImageLoader.getInstance().init(config);
        final DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .showImageOnLoading(R.drawable.loading)
                .build();
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ImageLoader.getInstance().displayImage(stringImageUrl, imageView, options); // Incoming options will be used
            }
        });
        return null;
    }
}
