package com.tql.wll.broadcastbestpractice;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Administrator on 2018/3/4.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected  void  onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        ActivityCollector.addActivity(this);

        Log.d( "BaseActivity:onCreate: ", getClass().getSimpleName());
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
