package com.example.wellwang.servicebackdemo;

import com.example.wellwang.servicebackdemo.bean.beanGank.Result;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Well Wang on 2018/3/6.
 */

public interface ApiGank {
    //如http://gank.io/api/data/Android/20/2
    @GET("data/Android/{p}/{page}")
    Observable<Result> getAndroid(@Path("p") int p, @Path("page") int page);

    //如http://gank.io/api/data/all/20/2
    @GET("history/content/{p}/{page}")
    Observable<ResponseBody> getHistory(@Path("p") int p,@Path("page") int page);
}

