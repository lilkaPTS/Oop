package myClasses.Bank;

import myInterfaces.Printable;

public class Manager<H,W> implements Printable {

    private String managerId;
    private H height;
    private W weight;

    public <T> Manager(T managerId, H height, W weight) {
        this.managerId = managerId.toString();
        this.height = height;
        this.weight = weight;
    }

    public String getManagerId() {
        return managerId;
    }

    public H getHeight() {
        return height;
    }

    public void setHeight(H height) {
        this.height = height;
    }

    public W getWeight() {
        return weight;
    }

    public void setWeight(W weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("This manager has an id: " + getManagerId() + " height: " + getHeight() + " Weight: " + getWeight());
    }
}
