package com.whitebird.beautycare.ImagesAndTextStore;

import com.whitebird.beautycare.R;

import java.util.ArrayList;


/**
 * Created by girish on 13/2/17.
 */

class ImagesAndTextStore {
    private Integer integerMainImageList[] = {
            R.drawable.main_beauty_parlour,
            R.drawable.face,
            R.drawable.nails_design,
            R.drawable.mehndi_design
    };
    private String stringMainImgNameList[] = {
            "Beauty Parlour",
            "Beauty Care",
            "Nails Design",
            "Mehndi Design"
    };

    ArrayList<GetDataImgTxt> getDataImgTxtArrayList() {
        ArrayList<GetDataImgTxt> readImgTxt = new ArrayList<>();
        GetDataImgTxt data;
        for (int i=0;i<stringMainImgNameList.length;i++){
            data = new GetDataImgTxt(integerMainImageList[i],stringMainImgNameList[i]);
            readImgTxt.add(data);
        }
        return readImgTxt;
    }


}


