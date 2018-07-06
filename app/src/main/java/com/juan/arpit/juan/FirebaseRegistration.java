package com.juan.arpit.juan;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Netcomm on 6/26/2018.
 */

public class FirebaseRegistration extends FirebaseInstanceIdService
{
    private static final String TAG = "FirebaseApp";

    @Override
    public void onTokenRefresh() {

        //Getting registration token of FCM
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Displaying token on your logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        //send FCM token to web service
        sendRegistrationToServer(refreshedToken);

    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server for your further implementation
        //Not required for current project
    }
}



