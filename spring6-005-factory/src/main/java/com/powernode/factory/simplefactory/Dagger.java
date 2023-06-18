package com.powernode.factory.simplefactory;

public class Dagger implements Weapon{
    @Override
    public void attack() {
        System.out.println("匕首攻击...");
    }
}
