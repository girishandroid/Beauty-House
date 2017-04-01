package com.whitebird.beautycare.FullImgPage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

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
class GridViewAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<GetFullImgsForGridView> getImgs;
    private String subName;
    //private  static ImageView imageView;

    GridViewAdapter(Activity activity, ArrayList<GetFullImgsForGridView> getFullImgsForGridViews, String subName) {
        this.activity = activity;
        this.getImgs = getFullImgsForGridViews;
        this.subName = subName;

    }

/*
    private static class ViewHolder{
        ImageView imageView;
    }*/

    @Override
    public int getCount() {
        return getImgs.size();
    }

    @Override
    public Object getItem(int position) {
        return getImgs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getImgs.indexOf(position);
    }
    @SuppressLint({"InflateParams", "Assert"})
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //ViewHolder viewHolder;
        ViewHolderItem viewHolder;
        View v = convertView;
        if (v==null)
        {

            v = layoutInflater.inflate(R.layout.gridview_model,null);
            viewHolder = new ViewHolderItem();
            //new ImageView(activity);
            viewHolder.imageView = (ImageView)v.findViewById(R.id.imageViewGrid);
            v.setTag(viewHolder);

        }else {
            //viewHolder = (ViewHolder)convertView.getTag();
            v = (View) convertView;
            viewHolder = (ViewHolderItem) v.getTag();
        }

        String mImageName = getImgs.get(position).getGetImgs()+".jpg";

        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + activity.getPackageName()
                + "/Files");
        final File mediaFile;
        mediaFile = new File(mediaStorageDir.getPath(),mImageName);

        viewHolder = (ViewHolderItem) v.getTag();
        //final String img = getImgs.get(position).getGetImgs();
        //final String stringImageURL = activity.getString(R.string.image_url);
        final ViewHolderItem finalViewHolder = viewHolder;
        final String stringImageURL = activity.getString(R.string.image_url)+getImgs.get(position).getGetImgs()+".jpg";

        final ViewHolderItem finalViewHolder1 = viewHolder;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new ClsBackgroundImageLoader(activity,stringImageURL, finalViewHolder1.imageView,mediaFile).execute();
                //notifyDataSetChanged();
            }
        });
        thread.start();

  /*      if(mediaFile.exists())
        {
            Uri uri = Uri.fromFile(mediaFile);
            try {
                ParcelFileDescriptor parcelFileDescriptor =
                        activity.getContentResolver().openFileDescriptor(uri, "r");
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                viewHolder.imageView.setImageBitmap(image);
                viewHolder.imageView.getDrawable();
                if (!hasImage(viewHolder.imageView)){
                    if (isNetworkConnected()) {
                        Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                new ImageDownloaderTask(activity, finalViewHolder.imageView, stringImageURL, getImgs.get(position).getGetImgs() + ".jpg").execute();
                            }
                        });
                        thread.start();
                    }
                }
            } catch (FileNotFoundException e) {
                final ViewHolderItem finalViewHolder3 = viewHolder;
                if (isNetworkConnected()) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            new ImageDownloaderTask(activity, finalViewHolder3.imageView, stringImageURL, getImgs.get(position).getGetImgs() + ".jpg").execute();
                        }
                    });
                    thread.start();
                }
                e.printStackTrace();
            }
        }else {
            final ViewHolderItem finalViewHolder1 = viewHolder;
            if (isNetworkConnected()) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new ImageDownloaderTask(activity, finalViewHolder1.imageView, stringImageURL, getImgs.get(position).getGetImgs() + ".jpg").execute();
                    }
                });
                thread.start();
            }
        }*/

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFullDespViewPage = new Intent(activity, ClsFullImgViewPager.class);
                intentFullDespViewPage.putExtra("position",position);
                intentFullDespViewPage.putExtra("name",subName);
                activity.startActivity(intentFullDespViewPage);
            }
        });
        return v;
    }
    static class ViewHolderItem {
        ImageView imageView;
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

}

