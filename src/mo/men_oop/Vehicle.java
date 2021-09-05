/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo.men_oop;

import java.util.Date;

/**
 *
 * @author kerol
 */
public abstract class Vehicle {
    
    String type;
    String manufactureDate;
    String manufacturerCountry;
    
    
    abstract String getFuelType(String type);
    
}
