package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is " + age);
        if (age == 21) {

            System.out.println("Welocome to the cinema is : ");
        } else  {
            System.out.println("It is not for you");
        }
    }

    public static  void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
