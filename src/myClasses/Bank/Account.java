package myClasses.Bank;


import myInterfaces.Accountable;
import myInterfaces.Printable;

public class Account<T> implements Accountable<T>, Printable {

    private T id;
    private int sum;

    public Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

    @Override
    public void print() {
        System.out.println("Account - id:" + id + " have " + sum);
    }
}
