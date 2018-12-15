
package com.example.android.quakereport;
/**
 * {@link Earthquake} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Earthquake {
    /** Default translation for the word */
    private double mMagnitude;
    /** Miwok translation for the word */
    private String mLocation;

    private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Create a new Word object.
     *
     * @param magnitude is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param location
     * is the word in the Miwok language
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }



    public double getMagnitude() {
        return mMagnitude;
    }
    public String getLocation() {
        return mLocation;
    }
    public String getDate() {
        return mDate;
    }
    public String getUrl() {
        return mUrl;
    }


}