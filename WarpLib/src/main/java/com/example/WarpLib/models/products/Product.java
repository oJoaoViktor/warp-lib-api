package com.example.WarpLib.models.products;
import java.util.HashSet;
import java.util.Set;

import com.example.WarpLib.models.enums.products.GenreType;

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

    @NotNull(message = "O preço não pode ser nulo.")
    @Positive(message = "O preço deve ser positivo.")
    private float price;

    @NotNull(message = "O título não pode ser nulo.")
    @Size(min=1, max=255, message = "O título deve conter entre 1 e 255 caracteres.")
    private String title;

    @NotNull(message = "A autoria não pode ser nula.")
    @Size(min=1, max=255, message = "A autoria deve conter entre 1 e 255 caracteres.")
    private String authorship;

    @NotNull(message="O ano de lançamento não pode ser nulo.")
    @Min(value=1800, message = "O ano de lançamento deve ser acima de 1800.")
    private int releaseYear;
    
    @NotNull(message="A faixa etária não pode ser nula.")
    @Min(value=0, message = "A faixa etária não pode ser menor que 0.")
    private int age;

    @Min(value=1, message = "A quantidade de cópias não pode ser menor que 0.")
    private int copies;

    @Min(value=0, message = "A quantidade de prêmios não pode ser menor que 0.")
    private int awards;
    
    @Min(value=0, message="A avaliação não pode ser menor que 0.")
    @Max(value=5, message="A avaliação não pode ser maior que 5.")
    private Float rating;

    @Size(min=4, max=20, message="O idioma deve conter entre 4 e 20 caracteres.")
    private String language;

    @NotNull(message="A quantidade disponível não pode ser nula.")
    @Min(value=0, message="A quantidade disponível não pode ser menor que 0.")
    private int availableQuantity;

    @ElementCollection(targetClass = GenreType.class)
    @Enumerated(EnumType.STRING)
    @Size(min=3, max=100, message="O gênero deve conter entre 3 e 100 caracteres.")
    private Set<GenreType> genres = new HashSet<>();
}
