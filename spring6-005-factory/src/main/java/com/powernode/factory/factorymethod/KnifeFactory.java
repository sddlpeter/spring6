package com.powernode.factory.factorymethod;

public class KnifeFactory implements WeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new Knife();
    }
}
