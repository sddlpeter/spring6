package com.powernode.factory.factorymethod;

public class TankFactory implements WeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new Tank();
    }
}
