package com.factoriaf5.rps.models;

public class Scissors implements Material{
    
    @Override
    public String isBetterThan(Material material) {
        
        if(material instanceof Paper) return "Tijeras gana a Papel";
        if(material instanceof Scissors) return "Tijeras empata con Tijeras";
        if(material instanceof Rock) return "Tijeras pierde contra Piedra";

        return "ERROR CRÍTICO DE KERNEL. FORMATEE EL PC";
    }
}
