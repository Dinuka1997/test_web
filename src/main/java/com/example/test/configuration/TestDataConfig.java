package com.example.test.configuration;

import com.example.test.dto.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class TestDataConfig {
    public static List<MusicalInstrument> musicalInstruments = new ArrayList<>();
    public static List<Integer> numberArray = new ArrayList<>();

    static {
        musicalInstruments.add(new MusicalInstrument("Trumpet","brass"));
        musicalInstruments.add(new MusicalInstrument("Tuba","brass"));
        musicalInstruments.add(new MusicalInstrument("Timpani","percussion"));
        musicalInstruments.add(new MusicalInstrument("Piano","keyboard"));

        numberArray.add(1);
        numberArray.add(2);
        numberArray.add(3);
        numberArray.add(4);
        numberArray.add(5);
        numberArray.add(6);
        numberArray.add(7);
        numberArray.add(8);
        numberArray.add(9);
        numberArray.add(10);
    }
}
