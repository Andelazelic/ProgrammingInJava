package com.zelic.restapi.services;

import com.zelic.restapi.entites.Consumption;
import com.zelic.restapi.repository.ConsumptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ConsumptionService {

    private final ConsumptionRepository consumptions;

    public void addConsumption(Consumption c) {
        consumptions.add(c);
    }

    public List<Consumption> getAllConsumptions() {
        return consumptions.getAll();
    }
}
