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
public class Car extends Vehicle{

    private int maxSpeed;
    private boolean isOwned;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public Car() {
        this.type = "car";
        this.maxSpeed = 150;
        this.manufacturerCountry = "Egypt";
        this.manufactureDate = "2020";
        isOwned = false;
    }
    
    
    public Car(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed =maxSpeed;
        this.manufacturerCountry = "Egypt";
        this.manufactureDate = "2020";
        isOwned = false;
    }
    
    public Car(String type, int maxSpeed, String manufacturerCountry, String manufactureDate, boolean isOwned){
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.manufacturerCountry = manufacturerCountry;
        this.manufactureDate = manufactureDate;
        this.isOwned = isOwned;
    }
    
    

    @Override
    String getFuelType(String type) {
        switch(type){
            case "car":
                return "petrol";
            case "Electric car":
                return "electric battery";
            default:
                return "unknown";
        }
    }
    
}
