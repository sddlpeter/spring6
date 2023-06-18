package com.powernode.factory.factorymethod;

public class Dagger implements Weapon{
    @Override
    public void attack() {
        System.out.println("用匕首攻击...");
    }
}
