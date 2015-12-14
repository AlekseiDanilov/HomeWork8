package com.epam.javauniversity.hw8;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestFrequencyWord {

    @Test
    public void testFrequencyWordCalcFrequency() {
        String[] words = {"aa", "bb", "aa", "aa"};
        assertEquals(new FrequencyWord().calcFrequency(words, "aa"), 3);
    }

    @Test
    public void testFrequencyWord() {
        FrequencyWord frequencyWord = new FrequencyWord("aa Aa bb Bb BB bB c c c c C java");
        Map<String, Integer> result = new HashMap<>();
        result.put("aa", 2);
        result.put("bb", 4);
        result.put("c", 5);
        result.put("java", 1);
        assertEquals(frequencyWord.getFrequencyWordMap(), result);
    }
}