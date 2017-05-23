package com.handy.widget.dialog;

import android.app.Activity;
import android.os.Build;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2017/2/15 0015.
 * <p>
 * 参考:https://zhuanlan.zhihu.com/p/25221428
 */

public class StyledDialogManager {


    private static StyledDialogManager sInstance = new StyledDialogManager();
    private WeakReference<Activity> sCurrentActivityWeakRef;


    private StyledDialogManager() {

    }

    public static StyledDialogManager getInstance() {
        return sInstance;
    }

    public Activity getCurrentActivity() {
        Activity currentActivity = null;
        if (sCurrentActivityWeakRef != null) {
            currentActivity = sCurrentActivityWeakRef.get();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                if (currentActivity == null || currentActivity.isDestroyed()) {
                    currentActivity = null;
                }
            }
        }
        return currentActivity;
    }

    public void setCurrentActivity(Activity activity) {
        sCurrentActivityWeakRef = new WeakReference<Activity>(activity);
    }
}
