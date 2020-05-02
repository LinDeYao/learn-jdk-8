package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.weatherreport;

import java.util.List;

/**
 * 未来天气预报
 * 实现MyObserver，注册成观察者
 *
 * @author ldy
 * @create 2020-05-02 21:46
 */
class FutureWeatherDisplay implements MyObserver, DisplayWeather {

    // 获取句柄
    private WeatherData weatherData;

    FutureWeatherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        // 将自己注册到被观察者列表中，表示自己也要监听事件
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        List<Float> floats =  weatherData.getForecastTemperatures();
        floats.forEach(f->{
            System.out.println("未来天气：" + f);
        });
    }

    @Override
    public void update() {
        System.out.println("接收到未来几天数据的通知，开始展示最新数据");
        this.display();
    }
}
