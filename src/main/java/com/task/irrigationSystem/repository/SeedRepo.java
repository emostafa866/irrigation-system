package com.task.irrigationSystem.repository;

import com.task.irrigationSystem.entity.Seed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeedRepo extends JpaRepository<Seed,Long> {
    public Seed findBySeedName(String seedName);
}
