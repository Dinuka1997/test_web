package com.example.test.configuration;

import com.example.test.dto.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class TestDataConfig {
    public static List<MusicalInstrument> musicalInstruments = new ArrayList<>();

    static {
        musicalInstruments.add(new MusicalInstrument("Trumpet","brass"));
        musicalInstruments.add(new MusicalInstrument("Tuba","brass"));
        musicalInstruments.add(new MusicalInstrument("Timpani","percussion"));
        musicalInstruments.add(new MusicalInstrument("Piano","keyboard"));
    }
}
