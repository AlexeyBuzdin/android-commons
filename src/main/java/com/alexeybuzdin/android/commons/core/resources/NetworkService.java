package com.alexeybuzdin.android.commons.core.resources;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alexeybuzdin.android.commons.core.AndroidService;
import com.alexeybuzdin.android.commons.core.ClassLogger;

public class NetworkService extends AndroidService {

    ClassLogger logger = new ClassLogger(NetworkService.class);

    public boolean internetAvailable()
    {
        NetworkInfo info = ((ConnectivityManager)
                getContext().getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();

        if (info == null) {
            logger.d("no internet connection");
            return false;
        } else {
            if(info.isConnected()) {
                logger.d(" internet connection available...");
                return true;
            } else {
                logger.d(" internet connection");
                return true;
            }
        }
    }
}
