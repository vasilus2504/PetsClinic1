/**
 * Created by Генка on 20.10.2017.
 */
public class Cat extends Animal {
    String name;


    public Cat(String name) {
        super(name);
        this.name = name;

    }


    public void makeSound() {
        System.out.printf("Meu %s", this.name);
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void catchMouse() {

    }
}
