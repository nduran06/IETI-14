package com.ieti.googlemaps.model;

import android.os.Parcel;

import java.io.Serializable;

public class Location implements Serializable {

    private String name;
    private long latitude;
    private long longitude;
    private String description;

    public Location(String name, long latitude, long longitude, String description)  {

        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
    }

    public Location(Parcel intent) {

        this.name = intent.readString();
        this.latitude = intent.readLong();
        this.longitude = intent.readLong();
        this.description = intent.readString();
    }

    public Location(){

    }

    @Override
    public String toString() {
        return String.format(
                "Location[name=%s, latitude='%s', longitude='%s', description='%s']",
                this.name, this.latitude, this.longitude, this.description);
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public long getLatitude() {
        return this.latitude;
    }

    public void setLatitude (long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return this.longitude;
    }

    public void setLongitude(long latitude) {
        this.longitude = longitude;
    }

    public String getDescription () {
        return this.description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
}
