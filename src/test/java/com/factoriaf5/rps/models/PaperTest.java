package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaperTest {
    
    @Test
    public void creationPaper() {
        
        MaterialFactory factory = new MaterialFactory();
        Material paper = factory.createMaterial("P");
        assertEquals(true, paper instanceof Paper);
    }
}
