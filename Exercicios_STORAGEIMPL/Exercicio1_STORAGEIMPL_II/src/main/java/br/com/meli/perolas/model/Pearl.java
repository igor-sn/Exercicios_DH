package br.com.meli.perolas.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pearl {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    private String material;
    private Double wight;
    private Integer carats;

}
