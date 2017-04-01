package com.whitebird.beautycare.FullListImgAndTxtData;

import com.whitebird.beautycare.R;

import java.util.ArrayList;

/**
 * Created by girish on 13/2/17.
 */
//To Store All The Data
class FullImgAndTxtDataStore {

    //Name Get From Cls Which Is Selected By On Click Main Page
    private String main_name;
    //Data For BeautyParlour Which Display On Second Page
    private String integersBeautyParlour[] = {
            "threading",
            "waxing",
            "pedicure",
            "manicure",
            "headmassage",
            "facial",
            "basic_bridal_makeup",
            "basic_hair_cut",
            "basic_hair_do",
            "bindi_decoration",
            "bleach",
            "saree_drape",
            "hair_dying",
            "blow_dry"
    };
    private String stringsBeautyParlour[] = {
            "Threading",
            "Waxing",
            "Pedicure",
            "Manicure",
            "Head Massage",
            "Facial",
            "Basic Bridal Makeup",
            "Basic Hair Cut",
            "Basic Hair Do's",
            "Bindi Decoration",
            "Bleach",
            "Saree Drape",
            "Hair Dying",
            "Blow Dry"
    };
    private String stringsSubBeautyParlour[] = {
            "A method of hair removal",
            "Cover With Wax",
            "A cosmetic treatment of the feet and toenails",
            "A cosmetic treatment of the fingernails",
            "A treatment based on old Ayurvedic techniques",
            "A beauty treatment for the face",
            "Bridal makeup at home",
            "Small Hair Cuts",
            "hairdressing For Small Occasion",
            "Bindi Styles",
            "To Remove Skin Dark Spots & for lightening face",
            "How to ware Saree",
            "Hair Coloring Techniques",
            "Tips To use Blow Dry"
    };

    //Data For BeautyCare Which Display On Second Page
    private String integersBeautyCare[] ={
            "face_care",
            "hair_care",
            "skin_care",
            "food_tips",
            "hand_care",
            "leg_care"
    };
    private String stringsBeautyCare[]={
            "Face Care",
            "Hair Care",
            "Skin Care",
            "Food Tips",
            "Hand Care",
            "Leg Care"
    };
    private String stringsSubBeautyCare[]={
            "Face Total Care",
            "Hair Total Care",
            "Skin Total Care",
            "Food Total Tips",
            "Hand Total Care",
            "Leg Total Care"
    };

    //Data For Nails Design Which Display On Second Page
    private String integersNailsDesign[] = {
            "nails_design",
            "nails_on_leg"
    };

    private String stringsNailsDesign[] = {
            "Nails Design Hand",
            "Nails Design Leg"
    };
    private String stringsSubNailsDesign[] = {
            "Designs",
            "Designs"
    };

    //Data For Mehndi Design Which Display On Second Page
    private String integersMehndiDesign[] = {
            "mehndi_hand_main",
            "mehndi_leg_main"
    };
    private String stringsMehndiDesign[] = {
            "On Hands",
            "On Legs"

    };
    private String stringsSubMehndiDesign[] = {
            "Different Designs Given For Hand",
            "Different Designs Given For Legs"
    };

    FullImgAndTxtDataStore(String main_name){
        this.main_name = main_name;
    }

    ArrayList<GetFullDataImgTxt> getDataImgTxtArrayList() {
        ArrayList<GetFullDataImgTxt> readImgTxt = new ArrayList<>();
        GetFullDataImgTxt data;
        switch (main_name){
            case "Beauty Parlour":
                for (int i=0;i<stringsBeautyParlour.length;i++){
                    data = new GetFullDataImgTxt(integersBeautyParlour[i],stringsBeautyParlour[i],stringsSubBeautyParlour[i]);
                    readImgTxt.add(data);
                }
                break;
            case "Beauty Care":
                for (int i=0;i<stringsBeautyCare.length;i++){
                    data = new GetFullDataImgTxt(integersBeautyCare[i],stringsBeautyCare[i],stringsSubBeautyCare[i]);
                    readImgTxt.add(data);
                }
                break;
            case "Nails Design":
                for (int i=0;i<stringsNailsDesign.length;i++){
                    data = new GetFullDataImgTxt(integersNailsDesign[i],stringsNailsDesign[i],stringsSubNailsDesign[i]);
                    readImgTxt.add(data);
                }
                break;
            case "Mehndi Design":
                for (int i=0;i<stringsMehndiDesign.length;i++){
                    data = new GetFullDataImgTxt(integersMehndiDesign[i],stringsMehndiDesign[i],stringsSubMehndiDesign[i]);
                    readImgTxt.add(data);
                }
                break;
        }

        return readImgTxt;
    }
}
