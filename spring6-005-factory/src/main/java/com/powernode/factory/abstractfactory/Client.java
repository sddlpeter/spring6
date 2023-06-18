package com.powernode.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new WeaponFactory();
        Weapon dagger = factory.getWeapon("dagger");
        Weapon knife = factory.getWeapon("knife");
        Weapon tank = factory.getWeapon("tank");
        dagger.attack();
        knife.attack();
        tank.attack();

        AbstractFactory factory1 = new FruitFactory();
        Fruit apple = factory1.getFruit("apple");
        Fruit strawberry = factory1.getFruit("strawberry");
        apple.ripeCycle();
        strawberry.ripeCycle();
    }
}
