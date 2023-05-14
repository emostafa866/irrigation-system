package com.task.irrigationSystem.repository;

import com.task.irrigationSystem.entity.Plot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlotRepo extends JpaRepository<Plot,Long> {
}
