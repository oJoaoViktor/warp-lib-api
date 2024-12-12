package com.example.WarpLib.models.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=1, max=100, message="O nome deve conter entre 1 e 100 caracteres.")
    private String name;

    @Pattern(regexp="\\d{3}\\.\\d{3}.\\d{3}-\\d{2}", message="O CPF deve estar no formato XXX.XXX.XXX-XX")
    private String cpf;

    @Pattern(regexp="^\\d{2}\\d{8,9}$", message="O telefone deve estar no formato DDDnúmero")
    private String telefone;

    @Email(message="E-mail inválido")
    private String email;
}
