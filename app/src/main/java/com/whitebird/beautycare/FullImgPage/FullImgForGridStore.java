package com.whitebird.beautycare.FullImgPage;

import com.whitebird.beautycare.R;

import java.util.ArrayList;

/**
 * Created by girish on 23/2/17.
 */
@SuppressWarnings("ALL")
class FullImgForGridStore {
    private String list_selected_name;
    private String imgsNails[] = {
            "face_care",
            "facecare",
            "facecare1",
            "facecare2",
            "facecare3",
            "facecare4",
            "facecare5"
    };

    private String nailsHandDesign[] = {
            "nails1_1",
            "nails1_2",
            "nails1_3",
            "nails1_4",
            "nails1_5",
            "nails1_6",
            "nails1_7",
            "nails1_8",
            "nails2_1",
            "nails2_2",
            "nails2_3",
            "nails3_1",
            "nails3_2",
            "nails3_3",
            "nails3_4",
            "nails3_5",
            "nails3_6",
            "nails3_7",
            "nails3_8",
            "nails3_9",
            "nails3_10",
            "nails3_11",
            "nails3_12",
            "nails3_13",
            "nails3_14"
    };



    private String nailsLegDesign[] = {
            "nails_leg1",
            "nails_leg2",
            "nails_leg3",
            "nails_leg4",
            "nails_leg5",
            "nails_leg6",
            "nails_leg7",
            "nails_leg8",
            "nails_leg9",
            "nails_leg10",
            "nails_leg11",
            "nails_leg12",
            "nails_leg13",
            "nails_leg14",
            "nails_leg15",
            "nails_leg16",
            "nails_leg17",
            "nails_leg18",
            "nails_leg19",
            "nails_leg20",
            "nails_leg21"

    };


    private String mehendiHandDesign[] = {
            "mend1",
            "mend2",
            "mend3",
            "mend4",
            "mend5",
            "mend6",
            "mend7",
            "mend8",
            "mend9",
            "mend10",
            "mend11",
            "mend12",
            "mend13",
            "mend14",
            "mend15",
            "mend16",
            "mend17",
            "mend18",
            "mend19",
            "mend20",
            "mend21"

    };


    private String mehendiLegDesign[] = {
            "mendleg1",
            "mendleg1",
            "mendleg2",
            "mendleg3",
            "mendleg4",
            "mendleg5",
            "mendleg6",
            "mendleg7",
            "mendleg8",
            "mendleg9",
            "mendleg10",
            "mendleg11",
            "mendleg12",
            "mendleg13",
            "mendleg14",
            "mendleg15",
            "mendleg16",
            "mendleg17",
            "mendleg18",
            "mendleg19",
            "mendleg20"
    };



    FullImgForGridStore(String list_selected_name){
        this.list_selected_name = list_selected_name;
    }

    ArrayList<GetFullImgsForGridView> getFullImgsForGridViews(){
        ArrayList<GetFullImgsForGridView> getFullImgsForGridViews = new ArrayList<>();
        GetFullImgsForGridView getImgData;
        switch (list_selected_name){
            case "Nails Design Hand":
                for (int i=0;i<nailsHandDesign.length;i++){
                    getImgData = new GetFullImgsForGridView(nailsHandDesign[i]);
                    getFullImgsForGridViews.add(getImgData);
                }
                break;
            case "Nails Design Leg":
                for (int i=0;i<nailsLegDesign.length;i++){
                    getImgData = new GetFullImgsForGridView(nailsLegDesign[i]);
                    getFullImgsForGridViews.add(getImgData);
                }
                break;
            case "On Hands":
                for (int i=0;i<mehendiHandDesign.length;i++){
                    getImgData = new GetFullImgsForGridView(mehendiHandDesign[i]);
                    getFullImgsForGridViews.add(getImgData);
                }
                break;
            case "On Legs":
                for (int i=0;i<mehendiLegDesign.length;i++){
                    getImgData = new GetFullImgsForGridView(mehendiLegDesign[i]);
                    getFullImgsForGridViews.add(getImgData);
                }
                break;
        }

        return getFullImgsForGridViews;
    }
}
