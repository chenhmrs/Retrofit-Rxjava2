package com.example.wellwang.servicebackdemo.bean.beanGank;

import java.util.List;

/**
 * Created by Well Wang on 2018/3/9.
 */

public class Result  {
    boolean error;
    List<Item> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<Item> getResults() {
        return results;
    }

    public void setResults(List<Item> results) {
        this.results = results;
    }
}
