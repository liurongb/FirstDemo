package com.jiyun.lenovo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.jiyun.lenovo.myapplication.BeanDemo.BeanUtils;
import com.jiyun.lenovo.myapplication.OkHttp.OkHttpUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initOkHttp();
    }

    private void initOkHttp() {
        OkHttpUtils.getIenste().sendGet("http://172.16.46.8:8080/data_a.json", new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                BeanUtils beanUtils = gson.fromJson(string, BeanUtils.class);
                Log.e("TAG",beanUtils.toString());
            }
        });
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listView);
    }
}
