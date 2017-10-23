package ru.lesson.lessons;
/**
 * Created by Генка on 20.10.2017.
 */
public class Dog implements Pet {

    private final Pet pet;

    public Dog(Pet pet) {
        this.pet = pet;
    }


    public void setName(String name) {
        this.pet.setName(name);
    }


    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav, gav");
    }


    public String getName() {
        return this.pet.getName();
    }
}
