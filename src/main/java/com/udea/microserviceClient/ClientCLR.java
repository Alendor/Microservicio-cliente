package com.udea.microserviceClient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
class ClientCLR implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;
    public Client cliente;
    @Override
    public void run(String... args) throws Exception {
        
//        cliente.setClientName("Diego");
//        cliente.setClientLastName("perez");
//        cliente.setClientEmail("sbgak@2112");
//         List<Client> sub  = new ArrayList<>();
//         sub.set(0, cliente);
         

        Stream.of("Diego","Maria","[]","prueba","Jose","Andy", "Chris", "Bruce").
                forEach(s -> clientRepository.save(new Client(s,s,s)));
        clientRepository.findAll().forEach(System.out::println);
     
    //new Client(s,s,s) s ->
   
    }
}
