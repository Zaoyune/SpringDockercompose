package com.example.testdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestdockerApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(TestdockerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        produitRepository.save(new Produit(null,"Iphone xr",9000,5));
        produitRepository.save(new Produit(null,"Pc Gamer Asrock",9000,5));
        produitRepository.save(new Produit(null,"MSI Leopard",9000,5));
        produitRepository.save(new Produit(null,"Paystation 5",9000,5));
        produitRepository.save(new Produit(null,"Playstation 5",9000,5));
        produitRepository.save(new Produit(null,"Iphone 14 pro max",1000,5));
        /*********************************************************************************************/
    }
}
