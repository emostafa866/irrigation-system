package com.task.irrigationSystem.service;

import com.task.irrigationSystem.entity.Plot;

import java.util.List;

public interface PlotService {

    public Plot addPlot(Plot plot);

    public Long editPlot(Plot plot);

    public List<Plot> getAllPlots();

}
