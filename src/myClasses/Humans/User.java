package myClasses.Humans;

import myEnums.Gender;

public abstract class User {
    private String fullName;
    private int age;
    private String login;
    private String password;
    private Gender gender;
    public User(String fullName, int age, String login, String password, Gender gender){
        this.fullName=fullName;
        this.age = age;
        this.login = login;
        this.password = password;
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password, String confirmPassword) { this.password = password == confirmPassword ? password : this.password; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public void displayInfo() {
        System.out.println("This object is " + this.getClass().toString().split("\\.")[1]);
        if(this.gender == Gender.Female){
            System.out.println("Her name is " + this.fullName + "\nAge " + this.age);
        }
        else {
            System.out.println("His name is " + this.fullName + "\nAge " + this.age);
        }
    }

}
