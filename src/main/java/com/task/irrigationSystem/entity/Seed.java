package com.task.irrigationSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Entity
public class Seed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String seedName;
    private String season;

    @ElementCollection
    @CollectionTable(name = "irrigation_period", joinColumns = @JoinColumn(name = "seed_id"))
    @MapKeyEnumerated(EnumType.STRING)
    @MapKeyColumn(name = "period")
    @Column(name = "irrigation_amount")
    private Map<IrrigationPeriod, Double> irrigationPeriods = new HashMap<>();


    public void addIrrigationPeriod( double irrigationAmount) {
        irrigationPeriods.put(IrrigationPeriod.PERIOD_1, (irrigationAmount*1)/4);
        irrigationPeriods.put(IrrigationPeriod.PERIOD_2, (irrigationAmount*2.5)/4);
        irrigationPeriods.put(IrrigationPeriod.PERIOD_3, (irrigationAmount*1)/4);
        irrigationPeriods.put(IrrigationPeriod.PERIOD_4, (irrigationAmount*0.5)/4);
    }
}
