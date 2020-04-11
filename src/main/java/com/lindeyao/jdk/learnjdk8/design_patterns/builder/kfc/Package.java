package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

/**
 * 建造者模式--套餐
 *
 * @author DeeLin
 * @create 2020-04-11-16:13
 */
public interface Package {

    // 定义--饮料
    static interface Water {
        String getWaterName();
    }

    // 定义--食物
    static interface Food {
        String getFoodName();
    }

    // 咖啡
    static class Coffee implements Water {
        private String waterName;

        public Coffee(String waterName) {
            this.waterName = waterName;
        }

        @Override
        public String getWaterName() {
            return this.waterName;
        }

        @Override
        public String toString() {
            return "Coffee{" +
                    "waterName='" + waterName + '\'' +
                    '}';
        }
    }

    // 汉堡
    static class Hunberger implements Food {
        private String foodName;

        public Hunberger(String foodName) {
            this.foodName = foodName;
        }

        @Override
        public String getFoodName() {
            return null;
        }

        @Override
        public String toString() {
            return "Hunberger{" +
                    "foodName='" + foodName + '\'' +
                    '}';
        }
    }
}
