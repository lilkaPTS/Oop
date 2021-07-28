package myClasses.Bank;

import myInterfaces.Accountable;

public class Transaction<T extends Account & Accountable> { // extends Account<String> extends Accountable
    private final T from;
    private final T to;
    private final int sum;

    public Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.println("Account " + from.getId() + " -> " + "Account " + to.getId() + ": " + this.sum);
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}
