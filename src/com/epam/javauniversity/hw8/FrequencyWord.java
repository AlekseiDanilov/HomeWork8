package com.epam.javauniversity.hw8;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWord {

    private Map<String, Integer> frequencyWordMap;

    public FrequencyWord() {
        frequencyWordMap = new HashMap<>();
    }

    public FrequencyWord(String englishText) {
        if (englishText == null) {
            throw new IllegalArgumentException("english text is null");
        }
        frequencyWordMap = new HashMap<>();
        String[] words = englishText.toLowerCase().split(" ");
        for (String word : words) {
            if (!frequencyWordMap.containsKey(word)) {
                frequencyWordMap.put(word, calcFrequency(words, word));
            }
        }
    }

    public int calcFrequency(String[] words, String value) {
        if (words == null) {
            throw new IllegalArgumentException("words is null");
        }
        if (value == null) {
            throw new IllegalArgumentException("value is null");
        }
        int count = 0;
        for (String word : words) {
            if (value.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public Map<String, Integer> getFrequencyWordMap() {
        return frequencyWordMap;
    }

    public void print() {
        for (Map.Entry<String, Integer> entry : frequencyWordMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
