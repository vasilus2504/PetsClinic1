/**
 * Created by Генка on 20.10.2017.
 */
public class Client {
    private String id;
    private final Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    public String getId() {
        return id;
    }
    public void setId(String newId){
        this.id = newId;
    }

    public Pet getPet() {
        return pet;
    }

}
