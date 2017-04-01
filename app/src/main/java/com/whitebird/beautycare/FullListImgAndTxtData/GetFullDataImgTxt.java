package com.whitebird.beautycare.FullListImgAndTxtData;

/**
 * Created by girish on 13/2/17.
 */

class GetFullDataImgTxt {
    private String FullImg;
    private String FullTxt;
    private String FullSubTxt;

    GetFullDataImgTxt(String fullImg, String fullTxt, String fullSubTxt){
        this.FullImg = fullImg;
        this.FullTxt = fullTxt;
        this.FullSubTxt = fullSubTxt;
    }

    String getFullImg() {
        return FullImg;
    }

    String getFullTxt() {
        return FullTxt;
    }

    String getFullSubTxt() {
        return FullSubTxt;
    }
}
