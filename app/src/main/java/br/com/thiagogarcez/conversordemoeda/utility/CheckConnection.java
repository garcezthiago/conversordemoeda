package br.com.thiagogarcez.conversordemoeda.utility;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by garcez on 24/09/17.
 */

public class CheckConnection {

    public boolean isConnect(Context ctx) {
        try {
            ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isAvailable()
                    && cm.getActiveNetworkInfo().isConnected()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
