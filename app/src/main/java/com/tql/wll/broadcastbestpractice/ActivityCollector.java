package com.tql.wll.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/4.
 */

public class ActivityCollector {
    public  static List<Activity> activities = new ArrayList<>();
    public  static void addActivity(Activity act){
        activities.add(act);
    }

    public static  void removeActivity(Activity act){
        activities.remove(act);
    }

    public static void finishAll() {
        for (Activity act: activities ) {
            if( !act.isFinishing() )
                act.finish();
        }
    }
}
