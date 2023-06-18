package com.powernode.spring6.beans;

public class Math {
    private String result;

    public void setResult(String symbol) {
        this.result = symbol;
    }

    @Override
    public String toString() {
        return "Math{" +
                "symbol='" + result + '\'' +
                '}';
    }
}
