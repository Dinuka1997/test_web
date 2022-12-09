package com.example.test.service;

import com.example.test.dto.MusicalInstrument;

import java.util.List;

public interface ComparatorService {

    List<MusicalInstrument> sortByName();
    List<MusicalInstrument> sortByType();
}
