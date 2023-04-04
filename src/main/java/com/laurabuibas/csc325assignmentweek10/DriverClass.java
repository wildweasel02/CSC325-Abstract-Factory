/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this class tests out my abstract factory
 * @author laurabuibas
 */
// after analyzing the problem, I determined the right design pattern to be an abstract factory
public class DriverClass {
    // the main method
    public static void main(String[] args) throws Exception {
        // member variables 
        String config = "professional"; // or set config to "casual" or "party"
        GarmentFactory factory;  
        
        // depending on what variation config was set to, that specific variation factory will be called 
        if (config == "professional") { factory = new ProfessionalGarmentFactory(); }
        else if (config == "casual") { factory = new CasualGarmentFactory(); }
        else if (config == "party") { factory = new PartyGarmentFactory(); }
        else { throw new Exception("Error! Unknown factory"); } // if the varation is not known, an exception is thrown
        
        // the factory is passed into application to create the matching garments
        Application app = new Application(factory);
    }
        
}
