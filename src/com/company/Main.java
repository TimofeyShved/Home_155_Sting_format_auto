package com.company;

import java.text.MessageFormat;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        // ---------- Обычные строчки
        String s1 = "Строка написана 24.01.2023, это прекрасно, нету ошибок";
        System.out.println(s1);

        // ---------- простое подставление
        System.out.println("---------- простое подставление");

        String s2 = "Строка написана %s, это через #, %d ошибок";
        System.out.println( String.format(s2, "24.01.2023", 0) );

        String s3 = MessageFormat.format("Строка написана {0}, это {1}, {2} ошибок", "24.01.2023", "скобки", 0);
        System.out.println(s3);

        // ---------- сложное подставление
        System.out.println("---------- сложное подставление");

        // Параметры:
        //числа(number)             integer, currency, percent
        //время(time), дата(date)   short, medium, long, full
        //выбор(choice)

        String s4 = MessageFormat.format(
                "Строка написана {0, date, short}, это {1}, {2,number, integer} ошибок",
                new GregorianCalendar(2023,12, 24).getTime(), "коротоко и числено", 0);
        System.out.println(s4);

        String s5 = MessageFormat.format(
                "Строка написана {0, date, medium}, это {1}, {2,number, currency} ошибок",
                new GregorianCalendar(2023,12, 24).getTime(), "среднее и цена", 0);
        System.out.println(s5);

        String s6 = MessageFormat.format(
                "Строка написана {0, date, long}, это {1}, {2,number, percent} ошибок",
                new GregorianCalendar(2023,12, 24).getTime(), "большое и процент", 0);
        System.out.println(s6);

        String s7 = MessageFormat.format(
                "Строка написана {0, date, full}, это {1}, {2} ошибок",
                new GregorianCalendar(2023,12, 24).getTime(), "максимально", 0);
        System.out.println(s7);

        String s8 = MessageFormat.format(
                "Строка написана {0}, это {1}, {2, choice, 0#нету|1#{2}} ошибок",
                new GregorianCalendar(2023,12, 24).getTime(), "выбор", 0);
        System.out.println(s8);
    }
}
