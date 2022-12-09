package com.example.test.controller;

import com.example.test.configuration.TestDataConfig;
import com.example.test.dto.MusicalInstrument;
import com.example.test.service.ComparatorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/comparator")
public class ComparatorController {

    private final ComparatorService comparatorService;

    @GetMapping("/sort-by-name")
    public List<MusicalInstrument> sortByName(){
        return this.comparatorService.sortByName();
    }

    @GetMapping("/sort-by-type")
    public List<MusicalInstrument> sortByType(){
        return this.comparatorService.sortByType();
    }


}
