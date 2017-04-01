package com.whitebird.beautycare.FullDespPage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.PagerAdapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.whitebird.beautycare.R;

import java.io.File;
import java.util.ArrayList;

import static android.content.Context.CONNECTIVITY_SERVICE;

/**
 * Created by girish on 14/2/17.
 */
class MyPagerAdapter extends PagerAdapter {
    private Activity activity;
    private ArrayList<GetFullDespDataImg> getFullDespDataImgs;

    MyPagerAdapter(Activity a, ArrayList<GetFullDespDataImg> getFullDespDataImgs){
        this.activity = a;
        this.getFullDespDataImgs = getFullDespDataImgs;
    }
    @Override
    public int getCount() {
        return getFullDespDataImgs.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object==view;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        LayoutInflater inflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewAll = inflater.inflate(R.layout.full_desp_view,container,false);
        final ImageView imageViewFull = (ImageView)viewAll.findViewById(R.id.full_image_view);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)viewAll.findViewById(R.id.collapse_toolbar);

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP) {
            collapsingToolbarLayout.setPadding(0,0,0,0);
            // Call some material design APIs here
        } else {
            // Implement this feature without material design
        }
        TextView textViewFul = (TextView)viewAll.findViewById(R.id.full_text_view);
        Typeface typeface = Typeface.createFromAsset(activity.getAssets(),"lato_regular.ttf");
        textViewFul.setTypeface(typeface);

        final String stringImageURL = activity.getString(R.string.image_url)+getFullDespDataImgs.get(position).getFullImg()+".jpg";

        String mImageName = getFullDespDataImgs.get(position).getFullImg()+".jpg";

        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + activity.getPackageName()
                + "/Files");
        File mediaFile;
        mediaFile = new File(mediaStorageDir.getPath(),mImageName);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(activity)
                // You can pass your own memory cache implementation
                .discCache(new UnlimitedDiskCache(mediaFile)) // You can pass your own disc cache implementation
                .discCacheFileNameGenerator(new HashCodeFileNameGenerator())
                .build();
        ImageLoader.getInstance().init(config);
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .build();
        ImageLoader.getInstance().displayImage(stringImageURL, imageViewFull, options); // Incoming options will be used

        imageViewFull.getDrawable();

/*        if(mediaFile.exists())
        {
            Uri uri = Uri.fromFile(mediaFile);
            try {
                ParcelFileDescriptor parcelFileDescriptor =
                        context.getContentResolver().openFileDescriptor(uri, "r");
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                imageViewFull.setImageBitmap(image);
                imageViewFull.getDrawable();
                if (!hasImage(imageViewFull)) {
                    if (isNetworkConnected()) {
                        Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {

                                new ImageDownloaderTask(context, imageViewFull, stringImageURL, getFullDespDataImgs.get(position).getFullImg() + ".jpg").execute();

                            }
                        });
                        thread.start();
                    } else {

                    }
                }
            } catch (FileNotFoundException e) {
                if (isNetworkConnected()) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {

                            new ImageDownloaderTask(context, imageViewFull, stringImageURL, getFullDespDataImgs.get(position).getFullImg() + ".jpg").execute();

                        }
                    });
                    thread.start();
                }else {

                }
                e.printStackTrace();
            }

        }else {
            if (isNetworkConnected()) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        new ImageDownloaderTask(context, imageViewFull, stringImageURL, getFullDespDataImgs.get(position).getFullImg() + ".jpg").execute();

                    }
                });
                thread.start();
            }else {

            }
        }*/

        textViewFul.setText(Html.fromHtml(getFullDespDataImgs.get(position).getFullTxt()));
        container.addView(viewAll);
        return viewAll;
    }
    private boolean hasImage(@NonNull ImageView view) {
        Drawable drawable = view.getDrawable();
        boolean hasImage = (drawable != null);

        if (hasImage && (drawable instanceof BitmapDrawable)) {
            hasImage = ((BitmapDrawable)drawable).getBitmap() != null;
        }

        return hasImage;
    }
    private boolean isNetworkConnected() {

        ConnectivityManager cm = (ConnectivityManager) activity.getSystemService(CONNECTIVITY_SERVICE);
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
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
