package com.powernode.factory.simplefactory;

public class SimpleFactory {
    public static Weapon getWeapon(String weaponName) {
        Weapon weapon = null;
        if ("knife".equals(weaponName)) {
            weapon = new Knife();
        } else if ("dagger".equals(weaponName)) {
            weapon = new Dagger();
        }
        // 在这个简单工厂上，如果要扩展增加新武器axe，需要增加如下代码，违背ocp原则
        else if ("axe".equals(weaponName)) {
            weapon = new Axe();
        }
        return weapon;
    }
}
