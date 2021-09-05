/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo.men_oop;

/**
 *
 * @author kerol
 */
public class SportsCar extends Vehicle {

    private int maxSpeed;
    private double price;
    public SportsCar() {
        maxSpeed = 220;
        manufactureDate = "2021";
        manufacturerCountry = "Germany";
        type = "Sports Car";
        price = 7500000;
    }
    
    public SportsCar(int maxSpeed, double price, String country){
        this.manufacturerCountry = country;
        this.maxSpeed = maxSpeed;
        this.price = price;
        manufactureDate = "2021";
        type = "Sports Car";

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    @Override
    String getFuelType(String type) {
        return "petrol";
    }
    
}
