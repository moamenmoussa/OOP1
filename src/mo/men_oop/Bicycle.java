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
public class Bicycle extends Vehicle {
    
    private int maxSpeed;
    private boolean available;

    public Bicycle() {
        maxSpeed = 15;
        available = true;
        manufactureDate = "2021";
        manufacturerCountry = "Japan";
        type = "Bicycle";
    }

    public Bicycle(int maxSpeed, boolean available) {
        this.maxSpeed = maxSpeed;
        this.available = available;
        manufactureDate = "2021";
        manufacturerCountry = "Japan";
        type = "Bicycle";
    }
    
    
    public Bicycle(String date, String country, String type, int maxSpeed, boolean available){
       this.available = available;
       this.manufactureDate =date;
       this.manufacturerCountry = country;
       this.type = type;
       this.maxSpeed = maxSpeed;
    }

    
    
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    

    @Override
    String getFuelType(String type) {
        switch(type){
            case "bicycle":
                return "human power";
            case "electric bicycle":
                return "electric battery";
            default:
                return "unknown";
        }
    }
    
}
