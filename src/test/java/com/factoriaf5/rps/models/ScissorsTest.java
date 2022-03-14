package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScissorsTest {
    
    @Test
    public void creationScissors() {
        
        MaterialFactory factory = new MaterialFactory();
        Material scissors = factory.createMaterial("S");
        assertEquals(true, scissors instanceof Scissors);
    }
}
