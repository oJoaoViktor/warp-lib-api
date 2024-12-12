package com.example.WarpLib.models.products;

import com.example.WarpLib.models.enums.products.GameCategory;
import com.example.WarpLib.models.enums.products.GameMechanic;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Game extends Product{

    @Enumerated(EnumType.STRING)
    @NotNull(message="A categoria não pode ser nula.")
    private GameCategory category;
    
    @Enumerated(EnumType.STRING)
    @NotNull(message="A mecânica não pode ser nula.")
    private GameMechanic mechanic;

    @Positive(message="O tempo de jogo deve ser maior que 0 minutos.")
    @Column(name="estimated_play_time")
    private int estimatedPlayTime;

}
