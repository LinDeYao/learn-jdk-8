package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.weatherreport;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端调用场景
 *
 * @author ldy
 * @create 2020-05-02 21:54
 */
class Client {

    public static void main(String[] args) {

        // 天气数据
        WeatherData weatherData = new WeatherData();
        // 今天天气预报
        DisplayWeather currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);
        // 未来天气预报
        DisplayWeather futureWeatherDisplay = new FutureWeatherDisplay(weatherData);

        // 模拟未来数据变化
        List<Float> forecastTemperatures = new ArrayList<Float>();
        forecastTemperatures.add(27f);
        forecastTemperatures.add(28f);
        weatherData.setMeasurements(30f, 10f, 2f, forecastTemperatures);

    }

}
