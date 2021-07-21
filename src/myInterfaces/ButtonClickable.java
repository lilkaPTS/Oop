package myInterfaces;

public interface ButtonClickable {
    default void execute(){
        System.out.println("This action is undefined\n");
    }
}
