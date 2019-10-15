package com.stevenmwesigwa.android.quakeapp;
/**
 * An {@link Earthquake} object contains information related to a single earthquake.
 */
public class Earthquake {

    /**
     * Magnitude of the earthquake
     */
    private double mMagnitude;

    /**
     * Location of the earthquake
     */
    private String mLocation;



    /** Date of the earthquake */
    private String mDate;


    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;


    public Earthquake(double mMagnitude, String mLocation, String mDate, long timeInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    } /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
