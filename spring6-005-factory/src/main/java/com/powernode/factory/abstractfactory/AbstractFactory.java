package com.powernode.factory.abstractfactory;

public abstract class AbstractFactory {
    public abstract Weapon getWeapon(String weaponName);
    public abstract Fruit getFruit(String fruitName);
}
