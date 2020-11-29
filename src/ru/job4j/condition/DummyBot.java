package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String phrase = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            System.out.println("Привет, умник.");
            phrase = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            System.out.println("До скорой встречи.");
            phrase = "До скорой встречи.";
        }
        return phrase;
    }

    public static void main(String[] args) {
        String phrase = DummyBot.answer("Привет,Бот.");
        System.out.println(phrase);
        phrase = DummyBot.answer("Пока.");
        System.out.println(phrase);
    }
}
