package br.com.healfy.ChallengeHealfySOA.controller;

import br.com.healfy.ChallengeHealfySOA.model.MealPlanModel;
import br.com.healfy.ChallengeHealfySOA.service.MealPlanService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mealplans")
public class PlanController {

    @Autowired
    private MealPlanService mealPlanService;

    @PostMapping
    public ResponseEntity<Object> createPlan (@Valid @RequestBody MealPlanModel planModel){
        try{
            MealPlanModel planEW = mealPlanService.createPlan(planModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(planEW);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping
    public List<MealPlanModel> readPlans(){

        return mealPlanService.readAllPlans();
    }

    @GetMapping("/{id}")
   public ResponseEntity<Object> getPlan(@PathVariable Long id){
        try{
            MealPlanModel planModel = mealPlanService.readPlanById(id);
            return ResponseEntity.status(HttpStatus.OK).body(planModel);

        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.OK).body(e.getMessage());
        }
   }
   @PutMapping("/{id}")
    public ResponseEntity<Object> updatePlan(@PathVariable Long id, @Valid @RequestBody MealPlanModel plan) {
        try {
            MealPlanModel planModel =  mealPlanService.updatePlanById(id, plan);
            return ResponseEntity.status(HttpStatus.OK).body(planModel);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePlan(@PathVariable Long id){
        try{
            mealPlanService.deletePlanById(id);
            return ResponseEntity.noContent().build();

        }catch(EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
