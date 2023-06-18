package com.powernode.factory.factorymethod;

public class Tank implements Weapon{
    @Override
    public void attack() {
        System.out.println("坦克开炮...");
    }
}
