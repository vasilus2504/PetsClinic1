/**
 * Created by Генка on 20.10.2017.
 */
public class Clinic {

    final Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
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
        if (count==0) System.out.println("Клиент не найден.");
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
        if (count==0) System.out.println("Питомец не найден.");
    }

}
