package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	We can create methods to make our code more organized and its better practice that way. Earlier we created
	a mortgage calculator and had all the whole functionality in our main method. We'll create a basic method.
    */
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Type name: ");
//        sayGreetings(scanner.next());
//    sayGreetings(name: "David") <-- explicit
//    Here were explicitly invoking the method sayGreetings with a string object valued David, we can invoke this
//    as many times as we want and it would be better to use a scanner.
//        System.out.print("Enter first and last name: ");
//        sayGreetings2(scanner.next(), scanner.next());
//        the amount of inputs must be the same as the number of parameters (arguments)

//        System.out.print("What is your name and age?: ");
//        String introduction = sayGreetings3(scanner.next(), scanner.next());

        int num = 12;
        int num2 = num;
//        System.out.println(num2);
        num2 = 15;
//        System.out.println(num2);

        String sayHello = "My name is Jeff";
        System.out.println(sayHello);

        sayHello = "My name is not Jeff";
        System.out.println(sayHello);

        String a = "I am an object that cannot be changed";
        String b = new String("a different way to declare a string object");
        System.out.println(a);
        System.out.println(b);

        Date now = new Date();
        System.out.println(now);

    }

    public static void sayGreetings(String name) {
//        here the method is public static and return type (void is no return type), but we can specify the type
//        the parameter is the primitive type and argument name. For the public static part, that is more associated
//        with OOP (object oriented programming)
        System.out.println("Hello, " + name);
    }

    public static void sayGreetings2(String firstName, String lastName) {
//        if we need multiple parameters we can separate it with a comma and use any data type.
        System.out.println("Hello, " + firstName + " " + lastName);
//        better way to format strings, concatenating here
    }

    public static String sayGreetings3(String firstName, String age) {
        return "Hello my name is " + firstName + "my age is " + age;
//        this wouldn't work because we are trying using two data types in a method that expects to return ONLY
//        a string, if we name the parameter age into a string it will work

//        Figure out why the method is not returning on the terminal
    }

}
