package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.weatherreport;

/**
 * 当前天气公告
 *
 * @author ldy
 * @create 2020-05-02 16:13
 */
class CurrentWeatherDisplay implements DisplayWeather,MyObserver {

    // 需要拥有被观察者的对象句柄，
    // 因为数据变化的时候，可以拿到最新的变化后的数据进行业务处理(这么理对不对？)
    private WeatherData weatherData;

    // 通过构造器传入对象
    CurrentWeatherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;

        // 将自己(观察者)注册到被观察者列表中
        weatherData.registerObserver(this);
    }

    /**
     * 展示数据，根据上面获取到的weatherData组合对象
     * 可以拿到最新的数据
     */
    @Override
    public void display() {
        // 湿度
        System.out.println("当前最新温度是：" + weatherData.getTemperature());
        System.out.println("当前最新湿度是：" + weatherData.getHumidity());
        System.out.println("当前最新气压是：" + weatherData.getPressure());
    }

    /**
     * 接收被观察者的通知,观察者可以根据事件作出对应动作
     *
     */
    @Override
    public void update() {
        System.out.println("当前天气公告接收到更新事件，开始更新数据");
        this.display();
    }
}
