package myClasses.Humans;

import myEnums.Gender;

public class Person extends User {

    private int personId;
    private static int counter = 1;
    public Person(String fullName, int age, Gender gender, String login, String password) {
        super(fullName, age, login, password, gender);
        this.personId = counter++;
    }
    public int getPersonId() { return personId; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println();
    }
    @Override
    public String toString() {
        return "Person - " + this.getFullName();
    }
}

/*
    private int id;
    private String fullName;
    private int age;
    private String telephoneNumber;
    private static int counter = 1;
    {
        fullName = "Undefined";
        age = 0;
        telephoneNumber = "Undefined";
    }
    static{
        System.out.println("Объект впервые создан");
    }
    public static int getCounter(){return counter;}

    public Person(String fullName, int age, String telephoneNumber){
        id = counter++;
        this.fullName = fullName;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFullName(){ return fullName; }

    public void setFullName(String fullName){ this.fullName = fullName; }

    public int getAge(){ return age; }

    public void setAge(int age){
        //if(age > 0 && age < 110) {this.age = age;}
        this.age = age>0&&age<110? age : this.age;
    }

    public String getTelephoneNumber(){ return telephoneNumber; }

    public void setTelephoneNumber(String telephoneNumber){ this.telephoneNumber = telephoneNumber.length()==11 ? telephoneNumber : this.telephoneNumber; }
    public int getId(){ return id;}
    */