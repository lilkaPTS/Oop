package myClasses.Humans;

public class Human implements Cloneable{
    private String name;
    private int age;

    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void display(){
        System.out.printf("Person Name: %s \n", name);
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }
}
