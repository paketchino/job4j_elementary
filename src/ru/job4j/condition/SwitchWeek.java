package ru.job4j.condition;

public class SwitchWeek {
    public static void main(String[] args) {
       String nameOfDay;
       int day = 3;
        switch (day) {
            case 1 :
                nameOfDay = "Monday";
                System.out.println(nameOfDay);
                break;
            case 2 :
                nameOfDay = "Tuesday";
                System.out.println(nameOfDay);
                break;
            case 3 :
                nameOfDay = "Wednesday";
                System.out.println(nameOfDay);
                break;
            case 4 :
                nameOfDay = "Thursday";
                System.out.println(nameOfDay);
                break;
            case 5 :
                nameOfDay = "Friday";
                System.out.println(nameOfDay);
                break;
            case 6 :
                nameOfDay = "Saturday";
                System.out.println(nameOfDay);
                break;
            case 7 :
                nameOfDay = "Sunday";
                System.out.println(nameOfDay);
                break;
            default:
                nameOfDay = "Error";
                System.out.println(nameOfDay);
       }
    }
    }