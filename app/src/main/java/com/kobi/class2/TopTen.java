package com.kobi.class2;

public class TopTen {

    private double lat = 0.0;
    private double lon = 0.0;
    private long timestamp = 0;
    private int numOfMoves = 99;

    public TopTen(double lat, double lon, long timestamp, int numOfMoves) {
        this.lat = lat;
        this.lon = lon;
        this.timestamp = timestamp;
        this.numOfMoves = numOfMoves;
    }

    public double getLat() {
        return lat;
    }

    public TopTen setLat(double lat) {
        this.lat = lat;
        return this;
    }

    public double getLon() {
        return lon;
    }

    public TopTen setLon(double lon) {
        this.lon = lon;
        return this;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public TopTen setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public int getNumOfMoves() {
        return numOfMoves;
    }

    public TopTen setNumOfMoves(int numOfMoves) {
        this.numOfMoves = numOfMoves;
        return this;
    }
}
