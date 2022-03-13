package com.factoriaf5.rps.models;

public class MaterialFactoryName implements MaterialFactory{

    @Override
    public Material createMaterialByName(String name) {
        
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
