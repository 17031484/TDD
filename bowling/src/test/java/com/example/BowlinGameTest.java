package com.example;

import com.example.BowlinGame.BowlinGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlinGameTest {
    private BowlinGame bowlinGame;

    @BeforeEach
    void setUp() {
        bowlinGame = new BowlinGame();
    }

    @Test
    void testGutterGame() throws Exception{
        rollMany(20,0);
    assertEquals(0, bowlinGame.score());
    }

    @Test
    void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20,bowlinGame.score());
    }

    @Test
    void testOneSpare() throws Exception {
        rollSpare();
        bowlinGame.roll(3);
        rollMany(17,0);
        assertEquals(16,bowlinGame.score());
    }

    @Test
    void testStrike() throws Exception {
        bowlinGame.roll(10);
        bowlinGame.roll(4);
        bowlinGame.roll(3);
        rollMany(16,0);
        assertEquals(24,bowlinGame.score());
    }

    @Test
    void PERFECT() throws Exception {
        rollMany(13,10);
        assertEquals(300, bowlinGame.score());
    }

    private void  rollMany(int n, int pins){
        for (int i = 0; i < n; i++) {
            bowlinGame.roll(pins);
        }
    }
    private void rollSpare() {
        bowlinGame.roll(5);
        bowlinGame.roll(5);
    }
    private void rollStrike(){
        bowlinGame.roll(10);
    }
}
