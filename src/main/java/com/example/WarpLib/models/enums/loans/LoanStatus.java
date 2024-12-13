package com.example.WarpLib.models.enums.loans;

public enum LoanStatus {
        ACTIVE, //Empréstimo ativo, item retirado porém não devolvido
        CANCELLED, //Empréstimo cancelado antes de ser concluído
        EXTENDED, //Empréstimo estendido
        OVERDUE, //Item não devolvido no prazo, ou seja, em atraso
        PENDING, //Empréstimo foi solicitado, mas ainda não foi processado
        RETURNED //Devolvido
}
