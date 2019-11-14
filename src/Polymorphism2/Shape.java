/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism2;

/**
 *
 * @author tio
 */
public class Shape {
    //private member variable
    private String color;

    //Konstruktornya
    public Shape(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    
}
