package br.com.meli.starwars.repositories;



import br.com.meli.starwars.dto.CharacterDTO;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data

@Repository
public class CharacterRepository {

    List<CharacterDTO> listCharacters = new ArrayList<CharacterDTO>();


}
