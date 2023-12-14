package com.zelic.restapi.controllers;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.zelic.restapi.entites.Consumption;
import com.zelic.restapi.services.ConsumptionService;
import lombok.*;

@AllArgsConstructor
@Controller
public class ConsumptionController {

    private final ConsumptionService consumptionService;

    @GetMapping("/consumptions")
    public ResponseEntity<List<Consumption>> getAll(@RequestParam ("year")int year) {
        return ResponseEntity.status(HttpStatus.OK).body(consumptionService.getAllConsumptions());
    }

    @PostMapping("/consumptions")
    public void createConsumption(Consumption c) {
        consumptionService.addConsumption(c);
    }

}


