package tree.com.data;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by 89128 on 2017/7/14.
 */

public class MyApplicatinon extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
