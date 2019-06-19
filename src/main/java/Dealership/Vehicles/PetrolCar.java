package Dealership.Vehicles;

import Dealership.CarParts.Tyre;
import Dealership.CarParts.Engine;

public class PetrolCar extends Vehicle {

    public PetrolCar(Engine engine, Tyre tyre, int price, String colour ){
        super(engine, tyre, price, colour);
    }

}
