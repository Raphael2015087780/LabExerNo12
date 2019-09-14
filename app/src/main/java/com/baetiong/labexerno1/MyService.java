package com.baetiong.labexerno1;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onHandleIntent(Intent intent){

        Log.d("Place", "Lovers Lane");
        Log.d("Place", "UST Hospital");
        Log.d("Place", "Main Building");
        Log.d("Place", "Quadri Park");
    }
}
