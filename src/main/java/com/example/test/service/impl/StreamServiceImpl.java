package com.example.test.service.impl;

import com.example.test.configuration.TestDataConfig;
import com.example.test.service.StreamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StreamServiceImpl implements StreamService {

    @Override
    public List<Integer> filterTest() {
        //remove all odd numbers from int array
        return TestDataConfig.numberArray.stream() //convert list to stream object
                .filter(n -> n % 2 == 0)//filter existing list
                .collect(Collectors.toList());// collect and return filtered object as list
    }

    @Override
    public List<Integer> mapTest() {
        //Convert each value to its square.
        return TestDataConfig.numberArray.stream()
                .map(n -> n * n) //change value according to our need
                .collect(Collectors.toList()); // collect changed object as list
    }

    @Override
    public List<Integer> filterAndMapTest() {
        return TestDataConfig.numberArray.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}
