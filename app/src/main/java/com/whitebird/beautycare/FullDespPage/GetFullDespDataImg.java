package com.whitebird.beautycare.FullDespPage;

/**
 * Created by girish on 14/2/17.
 */

class GetFullDespDataImg {
    private String FullDespImg;
    private String FullDespTxt;

    GetFullDespDataImg(String fullImg, String fullTxt){
        this.FullDespImg = fullImg;
        this.FullDespTxt = fullTxt;
    }

    String getFullImg() {
        return FullDespImg;
    }

    String getFullTxt() {
        return FullDespTxt;
    }

}
