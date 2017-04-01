package com.whitebird.beautycare.FullImgPage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.whitebird.beautycare.ClsBackgroundImageLoader;
import com.whitebird.beautycare.R;

import java.io.File;
import java.util.ArrayList;

import static android.content.Context.CONNECTIVITY_SERVICE;

/**
 * Created by girish on 23/2/17.
 */
class FullImgPagerAdapter extends PagerAdapter {
    private Activity activity;
    private ArrayList<GetFullImgsForGridView> imgList;

    FullImgPagerAdapter(Activity activity, ArrayList<GetFullImgsForGridView> imgList){
        this.activity = activity;
        this.imgList = imgList;
    }
    @Override
    public int getCount() {
        return imgList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object==view;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        LayoutInflater inflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewAll = inflater.inflate(R.layout.full_img_view,container,false);
        final TouchImageView  touchImageView;
        new TouchImageView(activity);
        touchImageView = (TouchImageView) viewAll.findViewById(R.id.img);
        final String imgs = imgList.get(position).getGetImgs();
        final String stringImageURL = activity.getString(R.string.image_url)+imgList.get(position).getGetImgs()+".jpg";
        String mImageName = imgList.get(position).getGetImgs()+".jpg";

        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + activity.getPackageName()
                + "/Files");
        final File mediaFile;
        mediaFile = new File(mediaStorageDir.getPath(),mImageName);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new ClsBackgroundImageLoader(activity,stringImageURL, touchImageView,mediaFile).execute();
                //notifyDataSetChanged();
            }
        });
        thread.start();

/*        if(mediaFile.exists())
        {
            Uri uri = Uri.fromFile(mediaFile);
            try {
                ParcelFileDescriptor parcelFileDescriptor =
                        context.getContentResolver().openFileDescriptor(uri, "r");
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                touchImageView.setImageBitmap(image);
                touchImageView.getDrawable();
                if (!hasImage(touchImageView)){
                    if (isNetworkConnected()) {
                        Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {

                                new ImageDownloaderTask(context, touchImageView, stringImageURL, imgList.get(position).getGetImgs() + ".jpg").execute();
                                //  notifyDataSetChanged();
                            }
                        });
                        thread.start();
                    }else {

                    }
                }
            } catch (FileNotFoundException e) {
                if (isNetworkConnected()) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {

                            new ImageDownloaderTask(context, touchImageView, stringImageURL, imgList.get(position).getGetImgs() + ".jpg").execute();
                            //  notifyDataSetChanged();
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

                        new ImageDownloaderTask(context, touchImageView, stringImageURL, imgList.get(position).getGetImgs() + ".jpg").execute();
                        //  notifyDataSetChanged();
                    }
                });
                thread.start();
            }else {

            }
        }*/
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
