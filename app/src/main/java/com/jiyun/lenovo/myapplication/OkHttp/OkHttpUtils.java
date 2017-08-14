package com.jiyun.lenovo.myapplication.OkHttp;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lenovo on 2017/8/14.
 */

public class OkHttpUtils {
    private static OkHttpUtils okHttpUtils;
    private final OkHttpClient okHttpClient;

    private OkHttpUtils(){
        okHttpClient = new OkHttpClient();
    }
    public  static  synchronized  OkHttpUtils getIenste(){
        if (okHttpUtils==null)
            okHttpUtils=new OkHttpUtils();
        return  okHttpUtils;
    }
    public void sendGet(String url, Callback callback){
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(callback);
    }
}
