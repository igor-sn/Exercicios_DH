package br.com.meli.starwars.repositories;



import br.com.meli.starwars.dto.CharacterDTO;
import br.com.meli.starwars.entities.Character;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CharacterRepository {

    List<Character> listCharacters = new ArrayList<Character>();


}
