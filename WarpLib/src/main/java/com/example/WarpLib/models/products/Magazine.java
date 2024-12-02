package com.example.WarpLib.models.products;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Magazine extends Product {

    @NotNull(message="A quantidade de páginas não pode ser nula.")
    @Min(value=1, message="A quantidade de páginas deve ser maior que 0.")
    @Column(name="page_count")
    private int pageCount;

    @NotNull(message="A data de publicação não pode ser nula.")
    @Column(name="publication_date")
    private LocalDate publicationDate;

    @NotNull(message="O volume/edição não pode ser nulo.")
    @Size(min=1, max=50, message="O volume/edição deve conter entre 1 e 50 caracteres.")
    @Column(name="volume_edition")
    private String volumeEdition;
}
