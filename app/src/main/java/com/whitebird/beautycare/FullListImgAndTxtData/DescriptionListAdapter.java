package com.whitebird.beautycare.FullListImgAndTxtData;

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
import android.widget.TextView;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.whitebird.beautycare.ClsBackgroundImageLoader;
import com.whitebird.beautycare.FullDespPage.ClsFullDespPage;
import com.whitebird.beautycare.FullImgPage.ClsFullGridViewForImg;
import com.whitebird.beautycare.R;

import java.io.File;
import java.util.ArrayList;

import static android.content.Context.CONNECTIVITY_SERVICE;


/**
 * Created by girish on 13/2/17.
 */
@SuppressWarnings("ALL")
class DescriptionListAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<GetFullDataImgTxt> fullDataImgTxts;
    private String main_name;
    DescriptionListAdapter(Activity activity, ArrayList<GetFullDataImgTxt> fullDataImgTxts, String main_name){
        this.activity = activity;
        this.fullDataImgTxts = fullDataImgTxts;
        this.main_name = main_name;

    }
    @Override
    public int getCount() {
        return fullDataImgTxts.size();
    }

    @Override
    public Object getItem(int position) {
        return fullDataImgTxts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return fullDataImgTxts.indexOf(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView==null)
        {
            convertView = layoutInflater.inflate(R.layout.disp_listview_design,null);
        }
        final ImageView imageViewDisp = (ImageView)convertView.findViewById(R.id.desp_img_view);
        TextView textViewMainDisp = (TextView)convertView.findViewById(R.id.desp_txt_main_view);
        TextView textViewSubDisp = (TextView)convertView.findViewById(R.id.desp_txt_sub_view);
        //imageViewDisp.setImageResource(fullDataImgTxts.get(position).getFullImg());
        textViewMainDisp.setText(fullDataImgTxts.get(position).getFullTxt());
        textViewSubDisp.setText(fullDataImgTxts.get(position).getFullSubTxt());
        /*final String stringImageURL = context.getString(R.string.image_url);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                // new FirstTask(stringImageURL,holder.imageViewAll).execute();
                new ImageDownloaderTask(context,imageViewDisp,stringImageURL+fullDataImgTxts.get(position).getFullImg()+".jpg").execute();

            }
        });thread.start();*/

        String mImageName = fullDataImgTxts.get(position).getFullImg()+".jpg";

        File mediaStorageDir = new File(Environment.getExternalStorageDirectory()
                + "/Android/data/"
                + activity.getPackageName()
                + "/Files");
        final File mediaFile;
        mediaFile = new File(mediaStorageDir.getPath(),mImageName);

        final String stringImageURL = activity.getString(R.string.image_url)+fullDataImgTxts.get(position).getFullImg()+".jpg";



        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new ClsBackgroundImageLoader(activity,stringImageURL, imageViewDisp,mediaFile).execute();
                //notifyDataSetChanged();
            }
        });
        thread.start();



        //Bitmap bitmap = SingletoneForList.getInstance().hashMapImgList.get(stringImageURL);
  /*     if(mediaFile.exists())
        {
            Uri uri = Uri.fromFile(mediaFile);
            try {
                ParcelFileDescriptor parcelFileDescriptor =
                        context.getContentResolver().openFileDescriptor(uri, "r");
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                imageViewDisp.setImageBitmap(image);
                imageViewDisp.getDrawable();
                if (!hasImage(imageViewDisp)){
                    if (isNetworkConnected()) {
                        Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                new ImageDownloaderTask(context, imageViewDisp, stringImageURL, fullDataImgTxts.get(position).getFullImg() + ".jpg").execute();
                            }
                        });
                        thread.start();
                    }
                }
            } catch (FileNotFoundException e) {
                if (isNetworkConnected()) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            new ImageDownloaderTask(context, imageViewDisp, stringImageURL, fullDataImgTxts.get(position).getFullImg() + ".jpg").execute();
                            //notifyDataSetChanged();
                        }
                    });
                    thread.start();
                }
                e.printStackTrace();
            }
        }else {
            if (isNetworkConnected()) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new ImageDownloaderTask(context, imageViewDisp, stringImageURL, fullDataImgTxts.get(position).getFullImg() + ".jpg").execute();
                    }
                });
                thread.start();
            }
        }*/

        final String dataSelected = fullDataImgTxts.get(position).getFullTxt();
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (main_name.equals("Beauty Parlour")||main_name.equals("Beauty Care")) {
                    Intent intentFullDespViewPage = new Intent(activity, ClsFullDespPage.class);
                    intentFullDespViewPage.putExtra("GetSubOptSelected", dataSelected);
                    activity.startActivity(intentFullDespViewPage);
                }else
                {
                    Intent intentFullGridViewPage = new Intent(activity, ClsFullGridViewForImg.class);
                    intentFullGridViewPage.putExtra("GetSubOptSelected", dataSelected);
                    activity.startActivity(intentFullGridViewPage);
                }
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
