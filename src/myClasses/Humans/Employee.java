package myClasses.Humans;

import myEnums.Gender;

public class Employee extends User {
    private int employeeId;
    private String specialization;
    private static int counter = 1;
    public Employee(String fullName, int age, Gender gender, String login, String password, String specialization){
        super(fullName, age, login,password, gender);
        this.employeeId = counter++;
        this.specialization = specialization;
    }
    public int getEmployeeId() { return employeeId; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization " + this.specialization + "\n");
    }

}
