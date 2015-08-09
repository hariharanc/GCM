package com.gcm.test;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * AppPreference.java
 * <p/>
 * An utility class to create, edit and get shared preference values.
 */
public class AppPreference {

    private Context mContext;
    private SharedPreferences pref;

    //Constants
    public static final String PREF_APP_VERSION ="app_version";
    public static final String PREF_GCM_REGISTRATION_ID ="gcm_registration_id";

    public AppPreference(Context mContext) {
        this.mContext = mContext;
        pref = PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    /**
     * To set the current app version.
     * @param appVersion
     */
    public void setAppVersion(int appVersion) {
        //To store the app version values in the preference.
        pref.edit().putInt(PREF_APP_VERSION, appVersion).apply();
    }

    /**
     * To Get the app version
     * @return current App version
     */
    public int getAppVersion() {
        //To retrieve the app version values from the preference.
        return pref.getInt(PREF_APP_VERSION, 0);
    }

    /**
     * Set GCM Registration Id
     * @param registrationId
     */
    public void setGCMRegistrationId(String registrationId) {
        //To store the GCM Registration Id  values in the preference.
        pref.edit().putString(PREF_GCM_REGISTRATION_ID, registrationId).apply();
    }

    /**
     * Get GCM Registration Id
     * @return GCM Registration Id
     */
    public String getGCMRegistrationId() {
        //To retrieve the GCM Registration Id   values from the preference.
        return pref.getString(PREF_GCM_REGISTRATION_ID, "");
    }
}
