package br.com.healfy.ChallengeHealfySOA.dto;

import br.com.healfy.ChallengeHealfySOA.enums.Goals;

public record PlanUpdateDate(

        Long id,
        Goals goal,
        Integer calories

) {
}
