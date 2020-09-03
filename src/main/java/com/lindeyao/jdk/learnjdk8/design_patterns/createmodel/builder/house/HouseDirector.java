package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

/**
 * 指挥者「设计师」: 主要指挥包工头
 *
 * @author ldy
 * @create 2020-09-03 15:15
 */
public class HouseDirector {

    // 指挥建造者进行建造,具体是谁建造，由客户端决定
    public void buildHouse(HouseBuilder houseBuilder){
        houseBuilder.doFoundation();
        houseBuilder.doFrame();
        houseBuilder.dpPouring();
    }

}
