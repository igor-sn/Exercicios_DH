package br.com.meli.perolas.dto;

import br.com.meli.perolas.model.Pearl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PearlDTO {
    private Long id;
    private String material;
    private Double wight;
    private Integer carats;

    public PearlDTO(String material, Double wight, Integer carats) {
        this.material = material;
        this.wight = wight;
        this.carats = carats;
    }

    public PearlDTO convert(Pearl pearl){
        this.id = pearl.getId();
        this.material = pearl.getMaterial();
        this.wight = pearl.getWight();
        this.carats = pearl.getCarats();
        return this;

    }

    public static Pearl convert(PearlDTO pearlDTO){
        return new Pearl(pearlDTO.getId(), pearlDTO.getMaterial(), pearlDTO.getWight(), pearlDTO.getCarats());
    }

}
