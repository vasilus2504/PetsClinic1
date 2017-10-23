package ru.lesson.lessons;

/**
 * Created by Генка on 20.10.2017.
 */
public class Animal implements Pet {

    private String name;

    public Animal(String name) {
        this.name = name;
    }


    public void makeSound() {
        System.out.println(String.format("%s say: %s", this.name, "beep"));
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


//
}
