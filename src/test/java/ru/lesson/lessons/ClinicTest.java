package ru.lesson.lessons;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Генка on 23.10.2017.
 */
public class ClinicTest {
    @Test
    public void addClient() throws Exception {
        Clinic clinicTest = new Clinic(5);
        Client client = new Client("Sergio", new Cat("Vaska"));
        Client client1 = new Client("Bob", new Dog(new Animal("Murka")));
        clinicTest.addClient(0, client);
        clinicTest.addClient(1, client1);
        Assert.assertEquals(clinicTest.clients[0].getId(), client.getId());
    }

    @Test
    public void findClientByPetName() throws Exception {
        Clinic clinicTest = new Clinic(5);
        Client client = new Client("Sergio", new Cat("Vaska"));
        Client client1 = new Client("Bob", new Dog(new Animal("Murka")));
        clinicTest.addClient(0, client);
        clinicTest.addClient(1, client1);
        Assert.assertEquals(clinicTest.findClientByPetName("Murka")[0].getId(), client1.getId());
    }

    @Test
    public void findPetByClientId() throws Exception {
        Clinic clinicTest = new Clinic(5);
        Client client = new Client("Sergio", new Cat("Vaska"));
        Client client1 = new Client("Bob", new Dog(new Animal("Murka")));
        clinicTest.addClient(0, client);
        clinicTest.addClient(1, client1);
        Assert.assertEquals(clinicTest.findPetByClientId("Bob")[0].getName(), client1.getPet().getName());
    }

    @Test
    public void changePetName() throws Exception {
        Clinic clinicTest = new Clinic(5);
        Client client = new Client("Sergio", new Cat("Vaska"));
        Client client1 = new Client("Bob", new Dog(new Animal("Murka")));
        clinicTest.addClient(0, client);
        clinicTest.addClient(1, client1);
        clinicTest.changePetName("Bob", "Black");
        Assert.assertEquals(clinicTest.clients[1].getPet().getName(), "Black");
    }

    @Test
    public void changeClientId() throws Exception {
        Clinic clinicTest = new Clinic(5);
        Client client = new Client("Sergio", new Cat("Vaska"));
        Client client1 = new Client("Bob", new Dog(new Animal("Murka")));
        clinicTest.addClient(0, client);
        clinicTest.addClient(1, client1);
        clinicTest.changeClientId("Murka", "Ann");
        Assert.assertEquals(clinicTest.clients[1].getId(), "Ann");
    }

}