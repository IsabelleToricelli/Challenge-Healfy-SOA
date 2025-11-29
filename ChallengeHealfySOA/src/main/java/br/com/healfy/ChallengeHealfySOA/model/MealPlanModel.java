package br.com.healfy.ChallengeHealfySOA.model;

import br.com.healfy.ChallengeHealfySOA.enums.Goals;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name="MealPlan")
public class MealPlanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O preenchimento do nome de usuário é obrigatório")
    private String userName;

    @NotNull(message = "O preenchimeto do objetivo é obrigatório (EX: EMAGRECIMENTO) ")
    @Enumerated(EnumType.STRING)
    private Goals goal;

    @Positive(message="A quantidade de calorias deve ser positiva")
    private int calories;

    private LocalDate planDate;

    @PrePersist
    public void prePersist(){
        if(planDate == null){
            planDate = LocalDate.now();
        }
    }
}
