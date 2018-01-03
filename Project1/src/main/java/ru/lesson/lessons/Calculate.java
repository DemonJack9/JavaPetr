package ru.lesson.lessons;
public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate...");
        double first = Integer.valueOf(args[0]);
        double second = Integer.valueOf(args[1]);
        double result = first + second;
        System.out.println("Sum : " + result);
    }
}
