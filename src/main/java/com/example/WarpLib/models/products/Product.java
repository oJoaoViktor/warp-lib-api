package com.example.WarpLib.models.products;
import java.util.HashSet;
import java.util.Set;

import com.example.WarpLib.models.enums.products.GenreType;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable=false)
    @NotNull(message = "O preço é obrigatório.")
    @Positive(message = "O preço deve ser positivo.")
    private double price;

    @Column(name="rental_price", nullable=false)
    @Positive(message="O preço deve ser positivo.")
    private double rentalPrice;

    @Column(nullable=false)
    @NotNull(message = "O título é obrigatório.")
    @Size(min=1, max=255, message = "O título deve conter entre 1 e 255 caracteres.")
    private String title;

    @Column(nullable=false)
    @NotNull(message = "A autoria é obrigatória.")
    @Size(min=1, max=255, message = "A autoria deve conter entre 1 e 255 caracteres.")
    private String authorship;

    @Column(nullable=false)
    @Min(value=1800, message = "O ano de lançamento deve ser acima de 1800.")
    @NotNull(message="O ano de lançamento é obrigatório.")
    private int releaseYear;
    
    @Column(nullable=false)
    @Min(value=0, message = "A faixa etária não pode ser menor que 0.")
    @NotNull(message="A faixa etária é obrigatória.")
    private int age;

    @PositiveOrZero(message = "A quantidade de cópias não pode ser menor que 0.")
    private int copies;

    @PositiveOrZero(message = "A quantidade de prêmios não pode ser menor que 0.")
    private int awards;
    
    @Min(value=0, message="A avaliação não pode ser menor que 0.")
    @Max(value=5, message="A avaliação não pode ser maior que 5.")
    private double rating;

    @Size(min=4, max=20, message="O idioma deve conter entre 4 e 20 caracteres.")
    private String language;

    @NotNull(message="A quantidade disponível é obrigatória.")
    @PositiveOrZero(message="A quantidade disponível não pode ser menor que 0.")
    private int availableQuantity;

    @ElementCollection(targetClass = GenreType.class)
    @Enumerated(EnumType.STRING)
    private Set<GenreType> genres = new HashSet<>();

}
