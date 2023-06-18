package com.powernode.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        Weapon knife = SimpleFactory.getWeapon("knife");
        knife.attack();

        Weapon dagger = SimpleFactory.getWeapon("dagger");
        dagger.attack();

        Weapon axe = SimpleFactory.getWeapon("axe");
        axe.attack();
    }
}
