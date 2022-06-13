package com.example.amilcv.services;

import com.example.amilcv.models.Skills;
import com.example.amilcv.repositories.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skills> getSkills() {
        return skillRepository.findAll();
    }

    public Skills createSkill(Skills skill) {
        return skillRepository.save(skill);
    }
}


