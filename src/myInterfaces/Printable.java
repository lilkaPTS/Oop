package myInterfaces;

public interface Printable extends Searchable{
    default void print(){
        System.out.println("Undefined printable\n");
    }
    default void search(){
        System.out.println("Undefined searchable\n");
    }
    static void read(){
        System.out.println("Read printable\n");
    }
}
