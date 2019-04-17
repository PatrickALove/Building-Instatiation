package com.company;

public class Building {

        //constructor
    Building() { //This one is the default constructor, no params

        }
    Building (String name, double coordinate, int date) {
            this.name=name;
            this.coordinate=coordinate;
            this.date=date;
        }

        //attribute

        private String name;
        private double coordinate;
        private  int date;


        // getter/setter methods

        public String getName() {
            return name;
        }

        public void setName (String name) {

            this.name =name;
        }

        public double getCoordinate() {
            return coordinate;
        }
        public void setCoordinate(double coordinate) {
            this.coordinate=coordinate;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date=date;
        }




        //methods
    }
