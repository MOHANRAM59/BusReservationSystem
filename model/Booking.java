package model;

public class Booking {
    private String passengerName;
    private int busNo;

    public Booking(String passengerName, int busNo) {
        this.passengerName = passengerName;
        this.busNo = busNo;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getBusNo() {
        return busNo;
    }
}
