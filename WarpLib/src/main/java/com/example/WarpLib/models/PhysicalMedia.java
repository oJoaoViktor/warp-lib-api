package com.example.WarpLib.models;

import com.example.WarpLib.models.enums.MediaCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class PhysicalMedia extends Product{

    @NotNull(message="O tempo de duração não pode ser nulo")
    @Positive(message="O tempo de duração deve ser positivo e maior que 0.")
    private int duration;

    @Enumerated(EnumType.STRING)
    @NotNull(message="A categoria não pode ser nula.")
    private MediaCategory category;

    //Fabricante - Fita/Vinil
    //Marcas - CD/DVD
    @NotNull(message="A marca não pode ser nula.")
    @Size(min=1, max=100, message = "A marca deve conter entre 1 e 100 caracteres.")
    private String manufacturer;
    
}
