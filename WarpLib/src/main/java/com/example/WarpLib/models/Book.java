package com.example.WarpLib.models;
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
public class Book extends Product{

    @NotNull(message = "O ISBN não pode ser nulo.")
    @Size(min=10, max=13, message = "O ISBN deve ter entre 10 e 13 caracteres.")
    private String isbn;
    
    @NotNull(message="A quantidade de páginas não pode ser nula.")
    @Min(value=1, message="A quantidade de páginas deve ser maior que 0.")
    private int pages;

    @NotNull(message="A editora não pode ser nula.")
    @Size(min=1, max=100, message="A editora deve conter entre 1 e 100 caracteres.")
    private String publisher;
}