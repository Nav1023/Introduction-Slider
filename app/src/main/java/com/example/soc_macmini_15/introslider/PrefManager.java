package com.example.soc_macmini_15.introslider;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Navneet Singh on 27 aug 2018
 */

public class PrefManager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;

    // shared preference mode
    int PRIVATE_MODE = 0;

    // shared preferences file name

    private static final String PREF_NAME = "navneet-welcome";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context _context) {
        this.context = _context;
        preferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();
    }
    public boolean isFirstTImeLaunch(){
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }
}
