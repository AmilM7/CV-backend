package com.example.amilcv.controllers;

import com.example.amilcv.models.Skills;
import com.example.amilcv.services.SkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping()
    public List<Skills> getRestaurants() {
        return skillService.getSkills();
    }

    @PostMapping
    public Skills createSkill(@RequestBody Skills skill) {
        return skillService.createSkill(skill);
    }
}





