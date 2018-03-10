package com.example.wellwang.servicebackdemo.bean.beanMaoyan;

import java.util.List;

/**
 * Created by Well Wang on 2018/3/10.
 */

public class ResultsMaoyan {
    public Contral  control;
    public int status;
    public Datas data;

    public Contral getControl() {
        return control;
    }

    public void setControl(Contral control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Datas getData() {
        return data;
    }

    public void setData(Datas data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultsMaoyan{" +
                "control=" + control +
                ", status=" + status +
                ", data=" + data +
                '}';
    }

    public static class Contral{
        public int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }

        @Override
        public String toString() {
            return "Contral{" +
                    "expires=" + expires +
                    '}';
        }
    }
    public static class Datas{
        boolean hasNext;
        public List<Moive> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<Moive> getMovies() {
            return movies;
        }

        public void setMovies(List<Moive> movies) {
            this.movies = movies;
        }

        @Override
        public String toString() {
            return "Datas{" +
                    "hasNext=" + hasNext +
                    ", movies=" + movies +
                    '}';
        }
    }

}
