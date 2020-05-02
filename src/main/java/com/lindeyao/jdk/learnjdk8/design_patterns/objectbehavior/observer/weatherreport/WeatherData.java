package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.weatherreport;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者：随时都会产生数据或者状态变化的对象，需要告知观察者，所以会有观察者的对象句柄
 *
 * @author ldy
 * @create 2020-05-02 16:00
 */
@Data
class WeatherData implements Subject {

    private List<MyObserver> myObservers;

    // 同个包下面可以访问(默认为default访问修饰符)
    WeatherData() {
        myObservers = new ArrayList<MyObserver>();
    }

    @Override
    public void registerObserver(MyObserver myObserver) {
        this.myObservers.add(myObserver);
    }

    @Override
    public void removeObserver(MyObserver myObserver) {
        this.myObservers.remove(myObserver);
    }

    @Override
    public void notifyObservers() {
        // 通知所有观察者
        myObservers.forEach(observer -> {
            // 执行通知
            observer.update();
        });
    }

    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float pressure;
    //未来几天的温度
    private List<Float> forecastTemperatures;

    // 未来天气如果变化时，也需要通知观察者
    public void setMeasurements(float temperature, float humidity,
                                float pressure, List<Float> forecastTemperatures) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.forecastTemperatures = forecastTemperatures;
        // 执行通知
        this.notifyObservers();
    }
}
