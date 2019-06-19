package Dealership;

import Dealership.People.Customer;
import Dealership.People.Dealer;
import Dealership.Vehicles.HybridCar;
import Dealership.Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> stock;
    private ArrayList<Customer> customers;
    private ArrayList<Dealer> dealers;

    public Dealership(String name){
        this.name = name;
        this.stock = new ArrayList<Vehicle>();
        this.customers = new ArrayList<Customer>();
        this.dealers = new ArrayList<Dealer>();
    }

    public String getName() {
        return name;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addVehicle(Vehicle vehicle) {
        stock.add(vehicle);
    }
}
