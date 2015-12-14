package com.epam.javauniversity.hw8;

public class Main {

    public static void main(String[] args) {

        ModelCounter modelCounter = new ModelCounter(15);
        System.out.println(modelCounter.demonstrateAndReturnLast());

        FrequencyWord frequencyWord = new FrequencyWord("Java jaVa jaVA Epam EPAM");
        frequencyWord.print();
    }
}
