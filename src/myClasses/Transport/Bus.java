package myClasses.Transport;

import myInterfaces.Printable;

public class Bus extends Vehicle implements Printable {
    private int busId;
    private static int counter=1;

    public Bus(String brand, String model) {
        super(brand, model);
        this.busId = counter++;
    }

    public int getBusId() {
        return busId;
    }

    @Override
    public void print() {
        System.out.printf("id - %d This is %s - %s %s\n\n", busId, this.getClass().toString().split("\\.")[2], this.getBrand(), this.getModel());
    }
}
