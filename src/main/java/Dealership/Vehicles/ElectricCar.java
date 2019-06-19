package Dealership.Vehicles;

import Dealership.CarParts.Engine;
import Dealership.CarParts.Tyre;

public class ElectricCar extends Vehicle {

    public ElectricCar(Engine engine, Tyre tyre, int price, String colour){
        super(engine, tyre, price, colour);
    }
}
