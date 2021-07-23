package com.company;


import myClasses.Bank.Account;
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
import myInterfaces.ButtonClickable;
import myInterfaces.Printable;

import java.io.*;
import java.lang.reflect.Array;
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
        System.out.println("Enter a number from 0 to " + (Task.values().length-1) + "\n");
        if(in.hasNextInt())
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
                    Account<String> acc = new Account<String>("2345", 5000);
                    String id = acc.getId();
                    System.out.println(id);
                    Account<Integer> acc2 = new Account<Integer>(2345, 5000);
                    Integer acc2Id = acc2.getId();
                    System.out.println(acc2Id);
                }
            }
        in.close();
    }
    static void sum(Person a) {
        a.setFullName("Вася");
    }
}

