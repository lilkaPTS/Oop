package com.company;


import myClasses.Bank.Account;
import myClasses.Controls.Button;
import myClasses.Handlers.ButtonPrintHandler;
import myClasses.Handlers.ButtonTvHandler;
import myClasses.Humans.Person;
import myClasses.Transport.Bus;
import myClasses.Transport.Car;
import myEnums.Color;
import myEnums.Day;
import myEnums.Gender;
import myInterfaces.ButtonClickable;
import myInterfaces.Printable;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bus bus = new Bus("Mercedes-Benz", "V class");
        Car car = new Car("BMW", "X7");
        //Печать через интерфейс
        Printable printable = bus;
        printable.print();
        printable = car;
        printable.print();
        //Преобразование типов
        String str = ((Car) printable).getBrand();
        System.out.println(str + "\n");
        //Статические методы интерфейса
        Printable.read();
        //Наследование интерфейсов
        bus.search(); //Показывает работу метода по умолчанию
        car.search(); //Работа отнаследованного и переопределённого метода + вывод константы интерфейса
        //Механизм обратного вызова
        Button button = new Button(new ButtonPrintHandler());
        button.click();
        //Был создан интерфейс ButtonClickable и несколько обработчиков нажатия которые его имплементируют, главный класс Button имеет поле типа Интерфейса поэтому внего можно передать Любой из обработчиков нажатия
        button = new Button(new ButtonTvHandler());
        button.click();
        button.click();
        button.click();
        //enum
        if(LocalDate.now().getDayOfWeek().name()==Day.FRIDAY.name()){
            System.out.println("Сегодня пятница!");
            System.out.println("Number of this day of the week - " + (Day.FRIDAY.ordinal()+1));
        }
        System.out.println(Color.RED.getCode());
        Day.MONDAY.test();
        //Object
        Person ilya = new Person("Гудима Илья Алексеевич", 20, Gender.Male, "lilgud", "4167004");
        System.out.println(ilya.toString()); // Вывод без переопределения - myClasses.Humans.Person@1f17ae12
        //Generics
        Account<String> acc = new Account<String>("2345", 5000);
        String id = acc.getId();
        System.out.println(id);

        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
        /*
         Person per = new Person("Гудима Илья Алексеевич", 20, "123");
        System.out.println(per.getTelephoneNumber());
        per.setTelephoneNumber("11111111111");
        per.setTelephoneNumber("1111111111");
        System.out.println(per.getTelephoneNumber());
        System.out.println("id " + per.getFullName() + ": " + per.getId());
        Person person = new Person("Кулагина Ксения Андреевна", 21, "123");
        System.out.println("id " + person.getFullName() + ": " + person.getId());
        System.out.println(Person.title);
        System.out.println(Person.getCounter());
        //System.out.println(Operation.sum(22, 2));*/
        /*Scanner in = new Scanner(System.in);
         ArrayList<String> users = new ArrayList<String>();
         for(;;){
             System.out.println("1 - add, 2 - exit");
             int key = in.nextInt();
             if(key == 1){
                 in.nextLine();
                 String arg1 = in.nextLine();
                 int arg2 = 0;
                 String arg3 = "";
                 while (true){
                     if(in.hasNextInt()){
                         arg2 = in.nextInt();
                         break;
                     }
                     in.next();
                 }
                 while (true){
                     if(in.hasNext()){
                         arg3 = in.next();
                         break;
                     }
                     in.next();
                 }
                 Person person = new Person(arg1,arg2,arg3);
                 if(registration(person)==true){
                     users.add(person.getId() + " " + person.getFullName() + " " + person.getAge() + " " + person.getTelephoneNumber());
                 }
             }
             else {
                break;
             }
             users.forEach(str->System.out.println(str))*/
            /*Bicycle bicycle = new Bicycle("h12f3", 10);
        Bicycle.HandleBar handleBar = bicycle.new HandleBar();
        Bicycle.Seat seat = bicycle.new Seat();
        seat.up();
        handleBar.left();
        bicycle.start();
        handleBar.right();*/

/*class Operation{

    static int sum(int x, int y){
        return x + y;
    }
    static int subtract(int x, int y){
        return x - y;
    }
    static int multiply(int x, int y){
        return x * y;
    }
}*/
/*Person person = new Person("Кулагина Ксения Андреевна", 21, Gender.Female,"kcendrlal", "4007614");
        Employee employee = new Employee("Гудима Илья Алексеевич", 20, Gender.Male,"lilgud", "4167004", "Software developer");
        person.displayInfo();
        employee.displayInfo();
        User user = new Employee("321", 12, Gender.Male, "123", "321", "4213");
        user.displayInfo();
        Object sam = new Employee("Гудима Илья Алексеевич", 20, Gender.Male,"lilgud", "4167004", "Software developer");
        Employee emp = (Employee)sam;
        Object kate = new Person("Кулагина Ксения Андреевна", 21, Gender.Female,"kcendrlal", "4007614");
        if(kate instanceof Employee eemmpp){
            //Employee eemmpp = (Employee) kate;
            eemmpp.displayInfo();
        }
        else{
            System.out.println("Conversion is invalid");
        }
        User user1 = new User(); //Error User is abstracted classes
        */
