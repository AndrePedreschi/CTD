package com.dh.Aula22.controler;

import com.dh.Aula22.model.Trainer;
import com.dh.Aula22.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerControler {
    private final TrainerService trainerService;

    @Autowired
    public TrainerControler(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainer(){
        return trainerService.listTrainer();
    }


}
