package com.powernode.spring6.beans;

import java.util.Arrays;

public class Order {
    private Goods[] goods;
    public Order() {

    }

    public Order(Goods[] goods) {
        this.goods = goods;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Order{" +
                "goods=" + Arrays.toString(goods) +
                '}';
    }
}
