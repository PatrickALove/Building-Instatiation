package com.company;

public class Coordinate {
    //constructor
    Coordinate() { //This one is the default constructor, no params

    }
    Coordinate (long latitude, long longitude) {
        this.latitude=latitude;
        this.longitude=longitude;
    }

    //attribute

    private long latitude;
    private long longitude;


    // getter/setter methods

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude (long latitude) {

        this.latitude =latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(long longitude) {
        this.longitude=longitude;
    }



}
