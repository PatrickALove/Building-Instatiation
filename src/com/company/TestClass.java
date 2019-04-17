/*
Coordinate Class
Attributes
  Long latitude
  lin longitude
  ______________________-
  get/set
 ____________________________
  Overloaded constructer
  tostring()
____________________________________________
Building Class
string name;
cordinate c;
Date datebuilt
java.util.Date
Java.textSimpleDateFormat

this.dateBuilt=new Dat();
___________________________
Overloaded constructor
___________________________
Get/set
___________________________
toString()
____________________________________________
Test Class
instantiates 4 buildings
print their tostring()
 */
package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestClass {
    public static void main(String[] args) {
        //instantiate a building
        Building b1 = new Building();
        System.out.println(b1); // print out the memory address
        // p1.heightInInches=70;
        b1.setName("Building 1");
        b1.setCoordinate(150);
        //p1.setAge(25);
        System.out.println("The building " + b1.getName() + " is located at " + b1.getCoordinate());

        Building p2 = new Building();
        // p2.heightInInches=60;
        p2.setName("Building 2");
        p2.setCoordinate(135);
        p2.setDate(25);
        System.out.println();

        Building p3 = new Building("GTCC",300,32);
        // deleted setters because you no longer need them.
        System.out.println();

        Building p4 = new Building();
    }
}