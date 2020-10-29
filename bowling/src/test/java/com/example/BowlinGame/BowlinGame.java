package com.example.BowlinGame;

public class BowlinGame {

    private int [] rolls = new int[21];
    private int currentroll =0;

    public void roll(int pins) {
        rolls[currentroll++] = pins;
    }

    public int score() {
        int score =0;
        int frameIndex =0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rolls[frameIndex])){
                score += 10 + StrikeBonus(frameIndex);
                frameIndex++;
            }
            else if (isSpare(frameIndex)){//spare
            score += 10 + SpareBonus(frameIndex, 2);
            frameIndex +=2;
            }else {
                score += SumTurno(frameIndex, frameIndex + 1);
                frameIndex +=2;
            }
        }
        return score;
    }

    private boolean isStrike(int roll) {
        return roll ==10;
    }

    private int SumTurno(int frameIndex, int i) {
        return rolls[frameIndex] + rolls[i];
    }

    private int SpareBonus(int frameIndex, int i) {
        return rolls[frameIndex + i];
    }

    private int StrikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }
}
