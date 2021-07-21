package myClasses.Transport;

import myInterfaces.Printable;

public class Car extends Vehicle implements Printable {
    private int carId;
    private static int counter = 1;

    public Car(String brand, String model) {
        super(brand, model);
        this.carId = counter++;
    }

    public int getCarId() {
        return carId;
    }

    @Override
    public void print() {
        System.out.printf("id - %d This is %s - %s %s\n\n", carId, this.getClass().toString().split("\\.")[2], this.getBrand(), this.getModel());
    }

    @Override
    public void search() {
        System.out.println("This realization searchable in class Car\n");
        System.out.println("This const in interface Searchable -> " + CONSTSEARCHABLE + "\n");
    }
}
