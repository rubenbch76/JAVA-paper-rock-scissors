package com.factoriaf5.rps.models;

public class Paper implements Material{

    @Override
    public String isBetterThan(Material material) {
        
        if(material instanceof Rock) return "Papel gana a Piedra";
        if(material instanceof Scissors) return "Papel pierde contra Tijeras";
        if(material instanceof Paper) return "Papel empata con Papel";

        return "ERROR CRÍTICO DE KERNEL. FORMATEE EL PC";
    }
       
}
