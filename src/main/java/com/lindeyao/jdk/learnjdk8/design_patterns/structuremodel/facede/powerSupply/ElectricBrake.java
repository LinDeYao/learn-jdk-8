package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.facede.powerSupply;

/**
 * 门面对象--总电闸
 *
 * @author ldy
 * @create 2020-08-24 17:13
 */
public class ElectricBrake {

    // 封装了子系统的多个对象
    private Fridge fridge;
    private Television television;

    public ElectricBrake() {
        this.fridge = new Fridge();
        this.television = new Television();
    }

    /**
     * 关闭所有的电器
     * 封装了所有需要的业务，并预留给客户端进行调用
     */
    public void turnOffAll() {
        this.fridge.turnOff();
        this.television.turnOff();
    }

}
