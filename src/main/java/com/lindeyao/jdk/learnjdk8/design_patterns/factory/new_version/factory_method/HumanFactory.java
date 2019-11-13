package com.lindeyao.jdk.learnjdk8.design_patterns.factory.new_version.factory_method;

/**
 * 制造人类的具体工厂类(该工厂只生产人类这一种产品)
 *
 * @author DeeLin
 * @create 2019-11-12 22:36
 */
class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
        Human human = null;
        try {
            human = (Human) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
