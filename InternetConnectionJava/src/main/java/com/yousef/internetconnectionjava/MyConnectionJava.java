package com.yousef.internetconnectionjava;

import android.app.Dialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * اللَّهُمَّ صَلِّ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما صَلَّيْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ
 * اللَّهُمَّ بَارِكْ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما بَارَكْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ

 *تم برمجتُه بواسطة : يوسف شعبان
 * +201142747343
 * yousefshaabansaad42@gmail.com
 */

public class MyConnectionJava {

    private final Context context;

    public MyConnectionJava(Context context){
        this.context = context;
    }

    private boolean getNetworkInfo(){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null;
    }

    public boolean isConnect(){
        return getNetworkInfo();
    }

    public boolean isDisconnect(){
        return !getNetworkInfo();
    }

    public void showDisconnectDialog(){
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.item_dialog);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.background2);
        dialog.setCancelable(true); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog
        dialog.create();
        dialog.show();
    }
}
