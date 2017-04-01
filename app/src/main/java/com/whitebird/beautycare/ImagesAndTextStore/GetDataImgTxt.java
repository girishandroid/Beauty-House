package com.whitebird.beautycare.ImagesAndTextStore;

/**
 * Created by girish on 13/2/17.
 */

class GetDataImgTxt {
    private Integer MainImg;
    private String MainTxt;

    GetDataImgTxt(Integer mainImg, String mainTxt){
        this.MainImg = mainImg;
        this.MainTxt = mainTxt;
    }

    Integer getMainImg() {
        return MainImg;
    }

    String getMainTxt() {
        return MainTxt;
    }
}
