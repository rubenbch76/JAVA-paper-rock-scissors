package com.factoriaf5.rps.models;

public class MaterialFactory implements Factory{

    @Override
    public Material createMaterial(String name) {
        
        Material material = null;

        if(name.equals("P")) {
            material = new Paper();
        }
        if(name.equals("R")) {
            material = new Rock();
        }
        if(name.equals("S")) {
            material = new Scissors();
        }
        return material;    
    }    
}
