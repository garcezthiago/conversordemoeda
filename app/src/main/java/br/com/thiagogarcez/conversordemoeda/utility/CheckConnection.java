package br.com.thiagogarcez.conversordemoeda.utility;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by garcez on 24/09/17.
 */

public class CheckConnection {

    public boolean isConnect(Context ctx) {
        try {
            //Buscando o serviço de conexao do android
            ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
            // NetworkInfo ni = cm.getActiveNetworkInfo();
            // ni.getType() == ConnectivityManager.TYPE_MOBILE // 3g
            // ni.getType() == ConnectivityManager.TYPE_WIFI// wifi
            // se o usuario estiver conectado em algum serviço de conexao
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
