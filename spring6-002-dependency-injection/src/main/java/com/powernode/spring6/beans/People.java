package com.powernode.spring6.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    List<String> names;
    Set<String> phones;
    Map<Integer, String> addresses;

    public void setAddresses(Map<Integer, String> addresses) {
        this.addresses = addresses;
    }

    public People() {}
    public People(List<String> names) {
        this.names = names;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "People{" +
                "names=" + names +
                ", phones=" + phones +
                ", addresses=" + addresses +
                '}';
    }
}
