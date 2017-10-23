package ru.lesson.lessons;

/**
 * Created by Генка on 20.10.2017.
 */
public class Clinic {

    final Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    public void showDataBase(){
        for (Client client : this.clients) {
            if (client != null)
            System.out.println("Client " + client.getId() + " has " + client.getPet().getClass().getName() + " " +
            client.getPet().getName());
        }

    }

    public void addClient(final int position, final Client newClient) {
        for (Client client : this.clients) {
            if (client != null && client.getId().equals(newClient.getId()) &&
                    client.getPet().getName().equals(newClient.getPet().getName()) &&
                    client.getPet().getClass() == newClient.getPet().getClass()) {
                System.out.println("Такой клиент c таким питомцем уже зарегестрированы");
            }
        }

        this.clients[position] = newClient;
    }

    // метод поиска клиента по имени питомца
    public Client[] findClientByPetName(final String petName) {
        int count = 0;                                      //счетчик количества совпадений по иимени питомца
        for (Client client : this.clients) {                //в цикле определяем количество совпадений
            if (client != null && client.getPet().getName().equals(petName)) {
                ++count;
            }
        }
        Client[] foundedClients = new Client[count];        //возвращаемый массив для записи совпадений
        if (count > 0) {
            count = 0;                                          // обнуляем счетчик для записи совпадений в массив
            for (Client client : this.clients) {                // в цикле записываем в массив совпадения
                if (client != null && client.getPet().getName().equals(petName)) {
                    System.out.println("Pet " + client.getPet().getName() + "belongs " + client.getId());
                    foundedClients[count] = client;
                    ++count;
                }
            }
        } else {
            System.out.println("Такой питомец не зарегестрирован.");
        }
        return foundedClients;
    }

    // метод поиска питомца по Id клиента. возрващает массив питомцев
    public Pet[] findPetByClientId(final String clientId) {
        int count = 0;                                      //счетчик количества совпадений по иимени питомца
        for (Client client : this.clients) {                //в цикле определяем количество совпадений
            if (client != null && client.getId().equals(clientId)) {
                ++count;
                System.out.println("Искомый питомец " + client.getPet().getName());
            }
        }
        Pet[] foundedPets = new Pet[count];        //возвращаемый массив для записи совпадений
        if (count > 0) {
            count = 0;                                          // обнуляем счетчик для записи совпадений в массив
            for (Client client : this.clients) {                // в цикле записываем в массив совпадения
                if (client != null && client.getId().equals(clientId)) {
                    foundedPets[count] = client.getPet();
                    System.out.println("Client" + client.getId() + " has a pet " + client.getPet().getName());
                    ++count;
                }
            }
        } else {
            System.out.println("Клиент не найден.");
        }
        return foundedPets;
    }


    //метод изменения имени питомца. Поиск по имени клиента
    public void changePetName(String clientId, String newPetName) {
        int count = 0;                          //используем для подсчета совпадений
        for (Client client : this.clients) {
            if (client != null && client.getId().equals(clientId)) {
                count++;
                client.getPet().setName(newPetName);
            }
        }
        if (count == 0) System.out.println("Клиент не найден.");
    }

    //метод изменения имени клиента. Поиск по имени питомца
    public void changeClientId(String petName, String newClientId) {
        int count = 0;
        for (Client client : this.clients) {
            if (client != null && client.getPet().getName().equals(petName)) {
                client.setId(newClientId);
                ++count;
            }
        }
        if (count == 0) System.out.println("Питомец не найден.");
    }
}

