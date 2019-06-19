package Dealership.Vehicles;

import Dealership.CarParts.Engine;
import Dealership.CarParts.Tyre;

public class HybridCar extends Vehicle {

    public HybridCar(Engine engine, Tyre tyre, int price, String colour){
        super(engine, tyre, price, colour);
    }
}