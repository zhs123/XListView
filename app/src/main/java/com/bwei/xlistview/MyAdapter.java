package com.bwei.xlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/26
 */


public class MyAdapter extends BaseAdapter{
    private List<Bean.ResultBean.DataBean> namelist;
    private Context context;
    private int i;
    public MyAdapter(List<Bean.ResultBean.DataBean> namelist, Context context) {
        this.namelist = namelist;
        this.context = context;
    }


    @Override
    public int getCount() {
        return namelist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(context,R.layout.item,null);
        TextView textview1 =(TextView) view.findViewById(R.id.textview1);
        TextView textview2 =(TextView) view.findViewById(R.id.textview2);
        TextView textview3 =(TextView) view.findViewById(R.id.textview3);
        TextView textview4 =(TextView) view.findViewById(R.id.textview4);
        textview1.setText(namelist.get(i).getHashId());
        textview2.setText(namelist.get(i).getContent());
        textview3.setText(namelist.get(i).getUnixtime()+"");
        textview4.setText(namelist.get(i).getUpdatetime()+"");
        return view;
    }
}
