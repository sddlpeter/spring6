package com.powernode.spring6.beans;

import java.util.Arrays;

public class Person {
    private String[] favoriteFood;

    public void setFavoriteFood(String[] favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Person{" +
                "favoriteFood=" + Arrays.toString(favoriteFood) +
                '}';
    }
}
