/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this class is a casual variation of the shoes family
 * @author laurabuibas
 */
public class CasualShoes implements Shoes{
    // constructor, calls the method to match variation
    public CasualShoes() { shoes(); }
    
    // method shows that a casual shoe has been matched to the variation
    @Override
    public void shoes() {
        System.out.println("A casual shoe pair is matched to the variation");
    }
}
