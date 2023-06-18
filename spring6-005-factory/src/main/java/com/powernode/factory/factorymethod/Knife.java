package com.powernode.factory.factorymethod;

public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("用刀攻击...");
    }
}
