package com.task.irrigationSystem.util;

import com.task.irrigationSystem.entity.Seed;

public class Amount {
    private static final int AmountOfWater=2560;  //amount of water for only one carat in summer

    private static final int AmountOfWaterW=2110;
    private static final int sizeOfCarat=4200;
    public static Double calculateWaterAmount(Seed seed , float landArea){
        if (seed.getSeason().equals("summer")){
            return  (double) ((landArea*AmountOfWater)/sizeOfCarat);
        }else {
            return  (double) ((landArea*AmountOfWaterW)/sizeOfCarat);
        }
    }
}
