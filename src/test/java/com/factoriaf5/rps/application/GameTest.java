package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import com.factoriaf5.rps.models.Material;
import com.factoriaf5.rps.models.MaterialFactory;

import org.junit.Test;

public class GameTest {
    
    @Test
    public void rockWinScissors() {

        MaterialFactory factory = new MaterialFactory();
        Material playerOne = factory.createMaterial("R");
        Material playerTwo = factory.createMaterial("S");

        String result = Game.checkAndShowWinner(playerOne, playerTwo);

        assertEquals("Piedra gana a Tijeras", result);
        
    }

    @Test
    public void rockLosePaper() {

        MaterialFactory factory = new MaterialFactory();
        Material playerOne = factory.createMaterial("R");
        Material playerTwo = factory.createMaterial("P");

        String result = Game.checkAndShowWinner(playerOne, playerTwo);

        assertEquals("Piedra pierde contra Papel", result);
        
    }

    @Test
    public void rockTieRock() {

        MaterialFactory factory = new MaterialFactory();
        Material playerOne = factory.createMaterial("R");
        Material playerTwo = factory.createMaterial("R");

        String result = Game.checkAndShowWinner(playerOne, playerTwo);

        assertEquals("Piedra empata con Piedra", result);
        
    }
}
