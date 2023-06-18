package com.powernode.factory.abstractfactory;

public class WeaponFactory extends AbstractFactory {

    @Override
    public Weapon getWeapon(String weaponName) {
        if ("knife".equals(weaponName)) {
            return new Knife();
        } else if ("dagger".equals(weaponName)) {
            return new Dagger();
        } else if ("tank".equals(weaponName)) {
            return new Tank();
        }
        return null;
    }

    @Override
    public Fruit getFruit(String fruitName) {
        return null;
    }
}
