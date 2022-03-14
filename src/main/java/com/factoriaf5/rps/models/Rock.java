package com.factoriaf5.rps.models;

public class Rock implements Material{
    
    @Override
    public String isBetterThan(Material material) {
        
        if(material instanceof Paper) return "Piedra pierde contra Papel";
        if(material instanceof Scissors) return "Piedra gana a Tijeras";
        if(material instanceof Rock) return "Piedra empata con Piedra";

        return "ERROR CRÍTICO DE KERNEL. FORMATEE EL PC";
    }
}
