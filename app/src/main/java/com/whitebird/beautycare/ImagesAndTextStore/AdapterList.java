package com.whitebird.beautycare.ImagesAndTextStore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.images.ImageManager;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.whitebird.beautycare.FullListImgAndTxtData.ClsListViewForDescription;
import com.whitebird.beautycare.R;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static android.content.Context.CONNECTIVITY_SERVICE;

/**
 * Created by girish on 13/2/17.
 */
class AdapterList extends BaseAdapter {
    private ArrayList<GetDataImgTxt> getDataImgTxts;
    private Context context;
    ImageManager.OnImageLoadedListener onImageLoadedListener;


    AdapterList(Context c, ArrayList<GetDataImgTxt> getDataImgTxts){
        this.context = c;
        this.getDataImgTxts = getDataImgTxts;
    }
    @Override
    public int getCount() {
        return getDataImgTxts.size();
    }

    @Override
    public Object getItem(int position) {
        return getDataImgTxts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getDataImgTxts.indexOf(position);
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
        {
            convertView = layoutInflater.inflate(R.layout.main_listview_design,null);
        }

        final ImageView imageView = (ImageView)convertView.findViewById(R.id.main_image_view);

        TextView textView = (TextView) convertView.findViewById(R.id.main_text_view);
        //final String stringImageURL = context.getString(R.string.image_url)+getDataImgTxts.get(position).getMainImg()+".jpg";



        imageView.setImageResource(getDataImgTxts.get(position).getMainImg());

        /*File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + context.getPackageName()
                + "/Files");

        String pathInternal = mediaStorageDir.getPath()+ mImageName;
        if (!mediaStorageDir.exists()){
            File mediaStorageDirs = new File(Environment.getExternalStorageDirectory()
                    + "/Android/data/"
                    + context.getPackageName()
                    + "/Files");
            mediaStorageDirs.mkdirs();
        }*/

        /*File file = new File(new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + context.getPackageName()
                + "/Files"),mImageName);*/
/*
        String mImageName = getDataImgTxts.get(position).getMainImg()+".jpg";

        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + context.getPackageName()
                + "/Files");
        File mediaFile;
        mediaFile = new File(mediaStorageDir.getPath(),mImageName);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                // You can pass your own memory cache implementation
                .discCache(new UnlimitedDiskCache(mediaFile)) // You can pass your own disc cache implementation
                .discCacheFileNameGenerator(new HashCodeFileNameGenerator())
                .build();
        ImageLoader.getInstance().init(config);
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .build();
        ImageLoader.getInstance().displayImage(stringImageURL, imageView, options); // Incoming options will be used

*/

        /*if(mediaFile.exists())
        {
            Uri uri = Uri.fromFile(mediaFile);
            try {
                ParcelFileDescriptor parcelFileDescriptor =
                        context.getContentResolver().openFileDescriptor(uri, "r");
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                imageView.setImageBitmap(image);
                imageView.getDrawable();
                if (!hasImage(imageView)) {
                    //if (isNetworkConnected()) {


                   // }else {
                        //showNoConnectionDialog(context);
                   // }
                }
            } catch (FileNotFoundException e) {
                //if (isNetworkConnected()) {
                    ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                            // You can pass your own memory cache implementation
                            .discCache(new UnlimitedDiskCache(mediaFile)) // You can pass your own disc cache implementation
                            .discCacheFileNameGenerator(new HashCodeFileNameGenerator())
                            .build();
                    ImageLoader.getInstance().init(config);
                    DisplayImageOptions options = new DisplayImageOptions.Builder()
                            .cacheInMemory(true)
                            .cacheOnDisk(true)
                            .build();
                    ImageLoader.getInstance().displayImage(stringImageURL, imageView, options); // Incoming options will be used

               // }else {
                    //showNoConnectionDialog(context);
                //}
                e.printStackTrace();
            }

            //imageView.setImageURI(uri);
            //imageView.getDrawable();
            //imageView.getScaleType();
            //imageView.setScaleType(ImageView.ScaleType.FIT_XY);


        }else {

            //

            /*Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    new ImageDownloaderTask(context, imageView, stringImageURL, getDataImgTxts.get(position).getMainImg() + ".jpg", onTaskCompleted).execute();

                }
            });
            thread.start();*/

            //
           // if (isNetworkConnected()) {
              /*  ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                        // You can pass your own memory cache implementation
                        .discCache(new UnlimitedDiskCache(mediaFile)) // You can pass your own disc cache implementation
                        .discCacheFileNameGenerator(new HashCodeFileNameGenerator())
                        .build();
                ImageLoader.getInstance().init(config);
                DisplayImageOptions options = new DisplayImageOptions.Builder()
                        .cacheInMemory(true)
                        .cacheOnDisk(true)
                        .build();
                ImageLoader.getInstance().displayImage(stringImageURL, imageView, options); // Incoming options will be used

           // }else {
                //showNoConnectionDialog(context);
           // }
        }*/






        textView.setText(getDataImgTxts.get(position).getMainTxt());
        final String main_name = getDataImgTxts.get(position).getMainTxt();
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context,main_name,Toast.LENGTH_SHORT).show();
                //On New List Description Class
                Intent intentDesp = new Intent(context,ClsListViewForDescription.class);
                intentDesp.putExtra("MainName",main_name);
                context.startActivity(intentDesp);
            }
        });
        return convertView;
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

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(CONNECTIVITY_SERVICE);
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

    public static void showNoConnectionDialog(Context ctx1)
    {
        final Context ctx = ctx1;
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setCancelable(true);
        builder.setMessage(R.string.no_connection);
        builder.setTitle(R.string.no_connection_title);
        builder.setPositiveButton(R.string.settings_button_text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which)
            {
                ctx.startActivity(new Intent(Settings.ACTION_WIRELESS_SETTINGS));
            }
        });

        builder.setNegativeButton(R.string.cancel_button_text, new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which)
            {
                return;
            }
        });

        builder.setOnCancelListener(new DialogInterface.OnCancelListener()
        {
            public void onCancel(DialogInterface dialog) {
                return;
            }
        });

        builder.show();
    }
}
