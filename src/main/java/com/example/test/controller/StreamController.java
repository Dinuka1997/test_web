package com.example.test.controller;

import com.example.test.service.StreamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/stream")
public class StreamController {

    private final StreamService streamService;

    @GetMapping("/filter-test")
    public List<Integer> filerTest(){
        return this.streamService.filterTest();
    }

    @GetMapping("/map-test")
    public List<Integer> mapTest(){
        return this.streamService.mapTest();
    }

    @GetMapping("/filter-and-map")
    public List<Integer> filterAndMapTest(){
        return this.streamService.filterAndMapTest();
    }
}
