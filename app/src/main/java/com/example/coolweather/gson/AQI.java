package com.example.coolweather.gson;

/**
 * Created by Administrator on 2018/3/19.
 */

public class AQI
{
    public AQICity city;
    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
