/**
 * Created by Генка on 20.10.2017.
 */
public class Animal implements Pet {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("%s say: %s", this.name, "beep"));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


//
}
