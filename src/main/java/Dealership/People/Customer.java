package Dealership.People;

import Dealership.Dealership;
import Dealership.Vehicles.HybridCar;
import Dealership.Vehicles.Vehicle;

public class Customer {

    private String name;
    private int hasMoney;
    private Vehicle vehicle;

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
    public void buyVehicle(Vehicle vehicle){
        if (this.hasMoney >= vehicle.getPrice()){
            this.hasMoney -= vehicle.getPrice();
                    this.vehicle = vehicle;
        }
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
