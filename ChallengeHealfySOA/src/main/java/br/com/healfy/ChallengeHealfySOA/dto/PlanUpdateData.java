package br.com.healfy.ChallengeHealfySOA.dto;

import br.com.healfy.ChallengeHealfySOA.enums.Goals;

public record PlanUpdateData(

        Long id,
        Goals goal,
        Integer calories

) {
}
