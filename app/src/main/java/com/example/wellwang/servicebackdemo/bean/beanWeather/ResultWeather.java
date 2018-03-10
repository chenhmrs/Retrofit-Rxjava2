package com.example.wellwang.servicebackdemo.bean.beanWeather;

import java.util.List;

/**
 * Created by Well Wang on 2018/3/10.
 */

public class ResultWeather {
    public String desc;
    public int status;
    public Weather data;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public static class Weather{
        public String Weather;
        public String ganmao;
        public List<FutureWeather> forecast;
        public Yesterday yesterday;
        public String aqi;
        public String city;

        public String getWeather() {
            return Weather;
        }

        public void setWeather(String weather) {
            Weather = weather;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public List<FutureWeather> getForecast() {
            return forecast;
        }

        public void setForecast(List<FutureWeather> forecast) {
            this.forecast = forecast;
        }

        public Yesterday getYesterday() {
            return yesterday;
        }

        public void setYesterday(Yesterday yesterday) {
            this.yesterday = yesterday;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
    public static class Yesterday{
        public String fl;
        public String fx;
        public String high;
        public String type;
        public String low;
        public String date;

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getFx() {
            return fx;
        }

        public void setFx(String fx) {
            this.fx = fx;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}
