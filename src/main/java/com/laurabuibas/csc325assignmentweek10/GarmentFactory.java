/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this is the interface that creates tops. 
 * other classes will implement this interface when they need to create a matching garment
 * @author laurabuibas
 */
public interface GarmentFactory {
    public Tops createTop();
    public Pants createPant(); 
    public Shoes createShoes();
}
