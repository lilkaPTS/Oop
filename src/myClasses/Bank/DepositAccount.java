package myClasses.Bank;

public class DepositAccount<T, S> extends Account<T> {

    private S name;

    public DepositAccount(T id, int sum, S name) {
        super(id, sum);
        this.name = name;
    }

    public S getName(){return name;}

    @Override
    public void print() {
        System.out.println(this.name + " have " + this.getSum());
    }
}
