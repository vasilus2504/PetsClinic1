/**
 * Created by Генка on 20.10.2017.
 */
public class CatDog implements Pet {

    private final Pet cat;
    private final Pet dog;

    public CatDog(Pet cat, Pet dog) {
        this.cat = cat;
        this.dog = dog;
    }


    @Override
    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }

    @Override
    public String getName() {
        return String.format("%s%s", this.cat.getName(), this.dog.getName());
    }


    public void setName(String catName) {
        this.cat.setName(catName);
        this.dog.setName("");

    }
}
