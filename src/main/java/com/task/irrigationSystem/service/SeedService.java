package com.task.irrigationSystem.service;

import com.task.irrigationSystem.entity.Seed;

import java.util.List;
import java.util.Optional;

public interface SeedService {
    public Seed addSeed(Seed seed);

    public List<Seed> getAllSeed();

}
