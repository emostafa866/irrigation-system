package com.task.irrigationSystem.service.Impl;

import com.task.irrigationSystem.entity.Plot;
import com.task.irrigationSystem.entity.Seed;
import com.task.irrigationSystem.repository.PlotRepo;
import com.task.irrigationSystem.repository.SeedRepo;
import com.task.irrigationSystem.service.PlotService;
import com.task.irrigationSystem.util.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlotServiceImpl implements PlotService {
    @Autowired
    private PlotRepo plotRepo;

    @Override
    public Plot addPlot(Plot plot) {
        Amount.calculateWaterAmount(plot.getSeed(),plot.getLandSize());
        return plotRepo.save(plot);
    }

    @Override
    public Long editPlot(Plot plot) {
        return null;
    }

    @Override
    public List<Plot> getAllPlots() {
        return plotRepo.findAll();
    }
}
