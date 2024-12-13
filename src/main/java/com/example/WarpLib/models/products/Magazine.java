package com.example.WarpLib.models.products;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Magazine extends Product {

    @Column(name="page_count", nullable=false)
    @NotNull(message="A quantidade de páginas é obrigatória.")
    @Positive(message="A quantidade de páginas deve ser maior que 0.")
    private int pageCount;

    @Column(name="publication_date", nullable=false)
    @NotNull(message="A data de publicação é obrigatória.")
    private LocalDate publicationDate;

    @Column(name="volume_edition", nullable =false)
    @NotNull(message="O volume/edição é obrigatório.")
    @Size(min=1, max=50, message="O volume/edição deve conter entre 1 e 50 caracteres.")
    private String volumeEdition;
}
