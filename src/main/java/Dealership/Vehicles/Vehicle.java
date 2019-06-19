package Dealership.Vehicles;

import Dealership.CarParts.Engine;
import Dealership.CarParts.Tyre;

public abstract class Vehicle {

    private Engine engine;
    private Tyre tyres;
    private int price;
    private String colour;

    public Vehicle(Engine engine, Tyre tyre, int price, String colour){

        this.engine = engine;
        this.tyres = tyre;
        this.price = price;
        this.colour = colour;
    }


    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyres() {
        return tyres;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
