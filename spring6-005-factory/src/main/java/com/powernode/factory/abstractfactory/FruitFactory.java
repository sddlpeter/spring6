package com.powernode.factory.abstractfactory;

public class FruitFactory extends AbstractFactory{

    @Override
    public Weapon getWeapon(String weaponName) {
        return null;
    }

    @Override
    public Fruit getFruit(String fruitName) {
        if("apple".equals(fruitName)) {
            return new Apple();
        } else if ("strawberry".equals(fruitName)) {
            return new StrawBerry();
        }
        return null;
    }
}
