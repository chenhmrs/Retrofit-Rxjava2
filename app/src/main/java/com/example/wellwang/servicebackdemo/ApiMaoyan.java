package com.example.wellwang.servicebackdemo;

import com.example.wellwang.servicebackdemo.bean.beanMaoyan.ResultsMaoyan;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Well Wang on 2018/3/8.
 */

public interface ApiMaoyan {
    //如http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000
    @GET("movie/list.json")
    Observable<ResultsMaoyan> getMovieList(@Query("type") String type, @Query("offest") int offest, @Query("limit") int limit);
    //如http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000
    @GET("movie/list.json")
    Observable<ResponseBody> getMovieList1(@Query("offst") int offest,@QueryMap Map<String,String> map);
    //如http://m.maoyan.com/movie/246363.json
    @GET("movie/{id}.json")
    Observable<ResponseBody> getComment(@Path("id") int id);

}
