package com.example.WarpLib.models.loan;

import java.time.LocalDate;

import com.example.WarpLib.models.enums.loans.LoanStatus;
import com.example.WarpLib.models.products.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    @NotNull(message="O locatário é obrigatório.")
    @Size(min=1, max=100, message="O locatário deve conter entre 1 e 100 caracteres.")
    private String tenant;

    @JoinColumn(name="product_id", nullable=false)
    @ManyToOne
    @NotNull(message="O produto é obrigatório.")
    private Product product;

    @Column(name="loan_date", nullable=false)
    @NotNull(message="A data de empréstimo é obrigatória.")
    private LocalDate loanDate;

    @Column(name="devolution_date", nullable=false)
    @NotNull(message="A data de devolução é obrigatória.")
    private LocalDate devolutionDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private LoanStatus status;

    public double getLoanValue(int days){
        double rentalPrice = product.getRentalPrice();
        return rentalPrice * days;
    }
}
