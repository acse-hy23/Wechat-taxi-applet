package com.project.foodshoot.entity;

public class Advertisement {
    public int reqId;
    public double passengerLatitude;
    public double destinationLatitude;
    public double passengerLongitude;
    public double destinationLongitude;
    public String taxiId;

    public void setDestinationLatitude(double destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
    }

    public void setPassengerLatitude(double passengerLatitude) {
        this.passengerLatitude = passengerLatitude;
    }

    public void setDestinationLongitude(double destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
    }

    public void setPassengerLongitude(double passengerLongitude) {
        this.passengerLongitude = passengerLongitude;
    }

    public int getReqId() {
        return reqId;
    }
}
