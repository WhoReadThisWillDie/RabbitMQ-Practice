package model;

public class Room {
    private final int number;
    private boolean isBooked = false;

    public Room(int number) {
        this.number = number;
    }

    public void book() {
        isBooked = true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isBooked() {
        return isBooked;
    }

    @Override
    public String toString() {
        return "Room %d: %s".formatted(number, isBooked ? "booked" : "not booked");
    }
}
