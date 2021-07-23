package myClasses.Bank;

import myInterfaces.BankBranchable;

import java.math.BigDecimal;

public class BankBranch implements BankBranchable<Integer> {
    private int bankId;
    private BigDecimal amount;

    public BankBranch(int bankId, BigDecimal amount) {
        this.bankId = bankId;
        this.amount = amount;
    }

    public Integer getBankId() {
        return bankId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
