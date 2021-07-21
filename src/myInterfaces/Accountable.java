package myInterfaces;

public interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}