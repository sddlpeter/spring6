package com.powernode.factory.factorymethod;

public class DaggerFactory implements WeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new Dagger();
    }
}
