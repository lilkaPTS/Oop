package myClasses.Bank;

public record Transact<T extends Account>(T from, T to, int sum) {
    public void execute(){
        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.println("Account " + from.getId() + " -> " + "Account " + to.getId() + ": " + this.sum);
        }
        else {
            System.out.printf("Operation is invalid");
        }
    }
}
