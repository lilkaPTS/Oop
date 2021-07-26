package com.company;


import myClasses.Bank.Account;
import myClasses.Bank.BankBranch;
import myClasses.Bank.Manager;
import myClasses.Controls.Button;
import myClasses.Handlers.ButtonPrintHandler;
import myClasses.Handlers.ButtonTvHandler;
import myClasses.Humans.Employee;
import myClasses.Humans.Person;
import myClasses.Humans.User;
import myClasses.Transport.Bus;
import myClasses.Transport.Car;
import myEnums.Color;
import myEnums.Day;
import myEnums.Gender;
import myEnums.Task;
import myInterfaces.Accountable;
import myInterfaces.BankBranchable;
import myInterfaces.ButtonClickable;
import myInterfaces.Printable;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Bus bus = new Bus("Mercedes-Benz", "V class");
        Car car = new Car("BMW", "X7");
        Printable printable = bus;
        Person ilya = new Person("Гудима Илья Алексеевич", 20, Gender.Male, "lilgud", "4167004");

        Arrays.stream(Task.values()).toList().forEach(task -> System.out.println(task.ordinal() + ") " + task.name()));
        System.out.println("Enter a number from 0 to " + (Task.values().length - 1) + "\n");
        if (in.hasNextInt())
            switch (Task.values()[in.nextInt()]) {
                case HUMANS_INTERACTION -> {
                    Person person = new Person("Кулагина Ксения Андреевна", 21, Gender.Female, "kcendrlal", "4007614");
                    Employee employee = new Employee("Гудима Илья Алексеевич", 20, Gender.Male, "lilgud", "4167004", "Software developer");
                    person.displayInfo();
                    employee.displayInfo();
                    User user = new Employee("321", 12, Gender.Male, "123", "321", "4213");
                    user.displayInfo();
                    Object sam = new Employee("Гудима Илья Алексеевич", 20, Gender.Male, "lilgud", "4167004", "Software developer");
                    Employee emp = (Employee) sam;
                    Object kate = new Person("Кулагина Ксения Андреевна", 21, Gender.Female, "kcendrlal", "4007614");
                    if (kate instanceof Employee eemmpp) {
                        // eemmpp = (Employee) kate;
                        eemmpp.displayInfo();
                    } else {
                        System.out.println("Conversion is invalid");
                    }
                }
                //User user1 = new User(); //Error User is abstracted classes
                case PRINT_VIA_INTERFACE -> {
                    printable.print();
                    printable = car;
                    printable.print();
                }
                case TYPE_CONVERSION -> {
                    printable = car;
                    String str = ((Car) printable).getBrand();
                    System.out.println(str + "\n");
                }
                case STATIC_METHOD_FROM_INTERFACE -> Printable.read();
                case EXTENDS_INTERFACE -> {
                    bus.search(); //Показывает работу метода по умолчанию
                    car.search(); //Работа отнаследованного и переопределённого метода + вывод константы интерфейса
                }
                case CALLBACK_MECHANISM -> {
                    Button button = new Button(new ButtonPrintHandler());
                    button.click();
                    //Был создан интерфейс ButtonClickable и несколько обработчиков нажатия которые его имплементируют, главный класс Button имеет поле типа Интерфейса поэтому внего можно передать Любой из обработчиков нажатия
                    button = new Button(new ButtonTvHandler());
                    button.click();
                    button.click();
                    button.click();
                }
                case ENUM -> {
                    if (LocalDate.now().getDayOfWeek().name().equals(Day.FRIDAY.name())) {
                        System.out.println("Сегодня пятница!");
                        System.out.println("Number of this day of the week - " + (Day.FRIDAY.ordinal() + 1));
                    }
                    System.out.println(Color.RED.getCode());
                    Day.MONDAY.test();
                }
                case OBJECT -> System.out.println(ilya); // Вывод без переопределения - myClasses.Humans.Person@1f17ae12
                case TEST_REF -> {
                    System.out.println(ilya.getFullName());
                    sum(ilya);
                    System.out.println(ilya.getFullName());
                    System.out.println("123");
                }
                case GENERICS -> {
                    Account<String> acc1 = new Account<String>("2345", 5000);
                    Accountable<Integer> acc2 = new Account(2345, 5000);
                    BankBranch bank1 = new BankBranch(123, new BigDecimal(32112312312332.12312312132131));
                    BankBranchable<Integer> bank2 = new BankBranch(123, new BigDecimal(32112312312332.12312312132131));
                    ArrayList<Object> objectArrayList = new ArrayList();
                    objectArrayList.addAll(Arrays.asList(bank1,bank2,acc1,acc2));
                    System.out.println("Print through cast:");
                    for(Object object : objectArrayList) {
                        if(object instanceof BankBranch){
                            var bank = (BankBranch) object;
                            System.out.println(bank.getBankId());
                        }
                        if(object instanceof Account){
                            var account = (Account<?>) object;
                            System.out.println(account.getId());
                        }
                    }
                    System.out.println("Generalized printing:");
                    String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
                    Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
                    print(people);
                    print(numbers);
                    var manager1 = new Manager<Integer, Integer>(1,180,80);
                    var manager2 = new Manager("2","180" ,80.5);
                    Arrays.asList(manager1, manager2).forEach(manager -> manager.print());

                }
            }
        in.close();
    }
    static <T> void  print(T[] objects){
        for(T object : objects){
            System.out.print(object + " ");
        }
        System.out.println();
    }
    static void sum(Person a) {
        a.setFullName("Вася");
    }
}

