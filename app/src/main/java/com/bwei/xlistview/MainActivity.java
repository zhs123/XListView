package com.bwei.xlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import costomview.library.OkHttpUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity implements XListView.IXListViewListener{
    private  String url="http://japi.juhe.cn/joke/content/list.from?key=%20874ed931559ba07aade103eee279bb37%20&pagesize=10&sort=asc&time=1418745237&page=";
    private XListView listView;
    private int page = 1;
    private List<Bean.ResultBean.DataBean> namelist;
    private  MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namelist = new ArrayList<>();

        listView = (XListView) findViewById(R.id.xlistview);
        //上拉加载
        listView.setPullLoadEnable(true);
        //给xListView设置监听
        listView.setXListViewListener(this);
        listView.setRefreshTime("刚刚");
        myAdapter=new MyAdapter(namelist,MainActivity.this);
        listView.setAdapter(myAdapter);
        OkHttpUtils.get(url+(page++), mCallback);
    }
   private Callback mCallback=new Callback() {
       @Override
       public void onFailure(Call call, IOException e) {
           page--;
       }

       @Override
       public void onResponse(Call call, Response response) throws IOException {
           final Bean bean= new Gson().fromJson(response.body().string(),Bean.class);
           runOnUiThread(new Runnable() {
               @Override
               public void run() {
                   List<Bean.ResultBean.DataBean> data=bean.getResult().getData();
                   namelist.addAll(data);
                   myAdapter.notifyDataSetChanged();
                   listView.stopRefresh();
                   listView.stopLoadMore();
               }
           });
       }
   };

    @Override
    public void onRefresh() {
        namelist.clear();
        OkHttpUtils.get(url+(page++), mCallback);
    }

    @Override
    public void onLoadMore() {
        OkHttpUtils.get(url+(page++), mCallback);
    }
}
