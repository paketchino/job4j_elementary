package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibledDiv(4);
        possibleDiv(0);
    }

    public static void possibleDiv(int i) {
        if (i == 0) {
            System.out.println(i);
        }
    }

    public static void possibledDiv(int numberOne) {
        boolean result = numberOne == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
    }
}
