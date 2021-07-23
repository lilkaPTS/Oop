package myInterfaces;

import java.math.BigDecimal;

public interface BankBranchable<T> {
    T getBankId();
    BigDecimal getAmount();
    void setAmount(BigDecimal amount);
}
