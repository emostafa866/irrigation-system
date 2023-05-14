package com.task.irrigationSystem.service.Impl;

import com.task.irrigationSystem.entity.Seed;
import com.task.irrigationSystem.exception.DuplicatedRowException;
import com.task.irrigationSystem.repository.SeedRepo;
import com.task.irrigationSystem.service.SeedService;
import com.task.irrigationSystem.util.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class SeedServiceImpl implements SeedService {
    @Autowired
    private SeedRepo seedRepo;

    @Override
    public Seed addSeed(Seed seed) {
        if(seedRepo.findBySeedName(seed.getSeedName())!=null){
            throw new DuplicatedRowException("Another product with the same name " + seed.getSeedName());
        }
        Double waterAmount=Amount.calculateWaterAmount(seed,4200);
        seed.addIrrigationPeriod(waterAmount);
        return seedRepo.save(seed);
    }
    @Override
    public List<Seed>getAllSeed(){
        return seedRepo.findAll();
    }

}
