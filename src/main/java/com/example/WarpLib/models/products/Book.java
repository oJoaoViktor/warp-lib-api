package com.example.WarpLib.models.products;
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
public class Book extends Product{

    @Column(nullable=false)
    @NotNull(message = "O ISBN é obrigatório.")
    @Size(min=10, max=13, message = "O ISBN deve conter entre 10 e 13 caracteres.")
    private String isbn;
    
    @Column(name="page_count", nullable=false)
    @NotNull(message="A quantidade de páginas é obrigatória.")
    @Positive(message="A quantidade de páginas deve ser maior que 0.")
    private int pageCount;

    @Column(nullable=false)
    @NotNull(message="A editora é obrigatória.")
    @Size(min=1, max=100, message="A editora deve conter entre 1 e 100 caracteres.")
    private String publisher;
}