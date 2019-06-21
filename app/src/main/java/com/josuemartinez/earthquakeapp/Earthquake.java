package com.josuemartinez.earthquakeapp;

public class Earthquake {

    /** Magnitude of the Earthquake */
    private String mMagnitude;

    /** Location of the Earthquake */
    private String mLocation;

    /** Date of the Earthquake */
    private String mDate;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earthquake happened
     */
    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Returns the magnitude of the earthquake
     */
    public String getMagnitude() {return mMagnitude; }


    /**
     * Returns the location of the earthquake
     */
    public String getLocation() {return mLocation; }


    /**
     * Returns the date of the earthquake
     */
    public String getDate() {return mDate; }

}