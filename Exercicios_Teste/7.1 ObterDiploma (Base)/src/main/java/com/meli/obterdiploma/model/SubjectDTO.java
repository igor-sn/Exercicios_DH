package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter @Setter
public class SubjectDTO {

    @NotBlank(message = "O nome da matéria não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome da matéria deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome da matéria não pode exceder 30 caracteres.")
    String name;


    @NotNull(message = "A nota da matéria não pode ficar vazia.")
    @Size(min = 0, max = 10, message = "A nota deve ser de 0 a 10.")
    Double score;
}
