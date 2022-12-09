package com.example.test.service.impl;

import com.example.test.configuration.TestDataConfig;
import com.example.test.dto.MusicalInstrument;
import com.example.test.service.ComparatorService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ComparatorServiceImpl implements ComparatorService {
    @Override
    public List<MusicalInstrument> sortByName() {
        TestDataConfig.musicalInstruments.sort(Comparator.comparing(MusicalInstrument::getName));
        return TestDataConfig.musicalInstruments;
    }

    @Override
    public List<MusicalInstrument> sortByType() {
        TestDataConfig.musicalInstruments.sort(Comparator.comparing(MusicalInstrument::getType));
        return TestDataConfig.musicalInstruments;
    }
}
