package com.example.WarpLib.services.loan;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WarpLib.exception.ResourceNotFoundException;
import com.example.WarpLib.models.enums.loans.LoanStatus;
import com.example.WarpLib.models.loan.Loan;
import com.example.WarpLib.models.products.Product;
import com.example.WarpLib.repositories.loan.LoanRepository;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public Loan createLoan(Product product, String tenant, int days){
        Loan loan = Loan.builder()
        .tenant(tenant)
        .product(product)
        .loanDate(LocalDate.now())
        .status(LoanStatus.PENDING)
        .build();
        return loanRepository.save(loan);
    }

    public Loan getLoanById(Long id){
        return loanRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("Empréstimo não encontrado com o ID: "+ id));
    }
}
