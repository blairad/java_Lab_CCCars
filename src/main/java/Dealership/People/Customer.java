package Dealership.People;

import Dealership.Dealership;

public class Customer {

    private String name;
    private int hasMoney;

    public Customer(String name, int hasMoney) {
        this.name = name;
        this.hasMoney = hasMoney;
    }
    public String getName() {
        return name;
    }
    public int getHasMoney() {
        return hasMoney;
    }
}
