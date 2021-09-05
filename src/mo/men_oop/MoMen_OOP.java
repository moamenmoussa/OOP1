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
public class MoMen_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car fiat = new Car("car", 120);
        SportsCar lamborghini = new SportsCar(310,12000000,"Italy");
        Bicycle bike= new Bicycle();
        
        System.out.println(fiat.getFuelType(fiat.type));
        System.out.println(lamborghini.getFuelType(lamborghini.type));
        System.out.println(bike.getFuelType(bike.type));
        
    }
    
}
