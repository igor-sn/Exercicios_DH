package br.com.meli.starwars;

import br.com.meli.starwars.entities.Character;
import br.com.meli.starwars.repositories.CharacterRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class StarwarsApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(StarwarsApplication.class, args);

    }

}
