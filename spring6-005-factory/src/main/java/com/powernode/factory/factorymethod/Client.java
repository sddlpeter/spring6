package com.powernode.factory.factorymethod;

public class Client {

    public static void main(String[] args) {
        DaggerFactory daggerFactory = new DaggerFactory();
        Weapon weapon = daggerFactory.getWeapon();
        weapon.attack();

        KnifeFactory knifeFactory = new KnifeFactory();
        Weapon weapon1 = knifeFactory.getWeapon();
        weapon1.attack();

        // 新增加武器坦克，坦克攻击方式是开炮，增加坦克工厂，来制造坦克
        // 这里并没有修改之前的任何代码，遵守了ocp原则
        TankFactory tankFactory = new TankFactory();
        Weapon weapon2 = tankFactory.getWeapon();
        weapon2.attack();
    }
}
