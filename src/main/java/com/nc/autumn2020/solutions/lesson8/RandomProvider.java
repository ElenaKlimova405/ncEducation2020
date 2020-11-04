package com.nc.autumn2020.solutions.lesson8;

import java.util.Arrays;
import java.util.Random;

public class RandomProvider {
    private int[] randomNumbers;
    private int i;

    public RandomProvider(int n) {
        randomNumbers = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = random.nextInt();
        }
    }

    public int next() throws Exception {
        if (i == randomNumbers.length)
            throw new Exception("Числа кончились!");
        return randomNumbers[i++];
    }

    public void clear() {
        try {}
        finally {
            randomNumbers = null;
        }
    }

    public int[] getRandomNumbers() {
        return randomNumbers;
    }

    public int getI() {
        return i;
    }

    public void setRandomNumbers(int[] randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "RandomProvider{" +
                "randomNumbers=" + Arrays.toString(randomNumbers) +
                '}';
    }
}


