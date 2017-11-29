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

    @Override
    public void run(String... args) throws Exception {

         List<Client> sub  = new ArrayList<>();
         sub.add(new Client("Andres","Perez","and@correo.com"));
         sub.add(new Client("Lina","Tamayo","tama@correo.com"));
         sub.add(new Client("Juan","Serna","juans@correo.com"));
         sub.add(new Client("Daniela","Lopez","dani@correo.com"));
           
        Stream.of(sub).
                forEach(s -> clientRepository.save(s));
        clientRepository.findAll().forEach(System.out::println);
     
     
    }
}
