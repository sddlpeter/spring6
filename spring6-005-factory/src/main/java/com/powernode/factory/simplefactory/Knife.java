package com.powernode.factory.simplefactory;

public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("用刀攻击...");
    }
}
