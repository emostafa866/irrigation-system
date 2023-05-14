package com.task.irrigationSystem.resources;

import com.task.irrigationSystem.entity.Seed;
import com.task.irrigationSystem.service.SeedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("seed")
@Slf4j
public class SeedController {
    @Autowired
    private SeedService seedService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Seed addSeed(@RequestBody Seed seed){
        log.info("starting add seed sevice with seed season" + seed.getSeason());
        return seedService.addSeed(seed);
    }

    @RequestMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Seed>getAllSeed(){
       return seedService.getAllSeed();
    }

}
