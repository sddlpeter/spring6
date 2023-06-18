package com.powernode.factory.simplefactory;

public class Axe implements Weapon{
    @Override
    public void attack() {
        System.out.println("用斧子攻击...");
    }
}
