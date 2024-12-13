package com.example.WarpLib.models.products;

import com.example.WarpLib.models.enums.products.MediaCategory;

import jakarta.persistence.Column;
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

    @Column(nullable=false)
    @NotNull(message="O tempo de duração é obrigatório")
    @Positive(message="O tempo de duração deve ser positivo e maior que 0.")
    private int duration;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    @NotNull(message="A categoria é obrigatória.")
    private MediaCategory category;

    //Fabricante - Fita/Vinil
    //Marcas - CD/DVD
    @Column(nullable=false)
    @NotNull(message="A marca é obrigatória.")
    @Size(min=1, max=100, message = "A marca deve conter entre 1 e 100 caracteres.")
    private String manufacturer;
    
}
