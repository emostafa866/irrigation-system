package com.task.irrigationSystem.resources;

import com.task.irrigationSystem.entity.Plot;
import com.task.irrigationSystem.entity.Seed;
import com.task.irrigationSystem.repository.SeedRepo;
import com.task.irrigationSystem.service.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("plot")
public class PlotController {
    @Autowired
    private PlotService plotService;

    @Autowired
    private SeedRepo seedRepo;
    @PostMapping("{seed}")
    @ResponseStatus(HttpStatus.CREATED)
    public Plot addPlot(@PathVariable("seed") String seedName,@RequestBody Plot plot){
        plot.setSeed(seedRepo.findBySeedName(seedName));
        return plotService.addPlot(plot);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Plot>getAllPlots(){
        return plotService.getAllPlots();
    }

}
