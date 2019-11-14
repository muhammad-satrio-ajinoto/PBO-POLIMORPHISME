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
public class TeshShape {
    public static void main(String[] args) {
        Shape sl = new Rectangle("red", 4, 5);
        System.out.println(sl);
        System.out.println("Area is " + sl.getArea());

        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
    }
    
}
