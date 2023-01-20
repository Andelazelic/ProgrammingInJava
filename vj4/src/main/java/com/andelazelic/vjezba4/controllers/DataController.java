package com.andelazelic.vjezba4.controllers;

import com.andelazelic.vjezba4.entitites.Data;
import com.andelazelic.vjezba4.services.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {


    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


    @PostMapping("/{id}")
    public Data saveData(@RequestBody Data data, @PathVariable("id")long id) {
        return dataService.saveData(data,id);

    }

    @GetMapping("/{id}")
    public Data getData(@PathVariable("id")long id) {

        return dataService.getDataById(id);
    }

    @GetMapping("/")
    private List<Data> getAllData()
    {
        return dataService.getAllData();
    }





}
