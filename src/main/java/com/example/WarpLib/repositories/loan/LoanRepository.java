package com.example.WarpLib.repositories.loan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WarpLib.models.loan.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{
    
}
