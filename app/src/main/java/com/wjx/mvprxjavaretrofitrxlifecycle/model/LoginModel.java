package com.wjx.mvprxjavaretrofitrxlifecycle.model;

import android.content.Context;


import com.wjx.mvprxjavaretrofitrxlifecycle.api.Api;
import com.wjx.mvprxjavaretrofitrxlifecycle.base.BaseModel;
import com.wjx.mvprxjavaretrofitrxlifecycle.progress.ObserverResponseListener;

import java.util.HashMap;

import io.reactivex.ObservableTransformer;

/**
 * 作者：senon on 2017/12/27 10:33
 * 邮箱：a1083911695@163.com
 */
public class LoginModel<T> extends BaseModel {

    public void login(Context context, HashMap<String,String> map, boolean isDialog, boolean cancelable,
                      ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){

        //当不需要指定是否有dialog时，可以调用这个方法
//        subscribe(context, Api.getApiService().login(map), observerListener);
        subscribe(context, Api.getApiService().login(map), observerListener,transformer,isDialog,cancelable);
    }

    ////  2017/12/27 其他需要请求、数据库等等的操作

    public void logout(Context context, HashMap<String,String> map, boolean isDialog, boolean cancelable,
                       ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){

    }
}
