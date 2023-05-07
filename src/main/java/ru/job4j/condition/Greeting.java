package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String truth = "But I am a newbie";
        String separate = " ";
        String id = idea + separate + truth;
        System.out.println(id);
        int year = 2023;
        idea = idea + year;
        System.out.println(idea);
    }
}