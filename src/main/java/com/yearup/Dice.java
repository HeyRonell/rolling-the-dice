package com.yearup;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Dice {
    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll2 = dice.roll();
        int roll1 = dice.roll();

        // int count = 0;

        for (int count = 1; count <= 100; count++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            mysum = roll1 + roll2;
            return mysum;


        }
    }

    public int roll() {
        int maxValue = 6;
        int minValue = 1;

        return int randomNumber = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
