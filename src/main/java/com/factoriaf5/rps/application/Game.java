package com.factoriaf5.rps.application;

import java.util.Scanner;

import com.factoriaf5.rps.models.Material;
import com.factoriaf5.rps.models.MaterialFactoryName;

public class Game {
    
    public static MaterialFactoryName factory = new MaterialFactoryName();

    public static void main(String[] args) {
        readData();

    }

    public static void readData(){
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca Piedra(R), Papel(P) o Tijera(S)");
        String gamerInputMaterial = input.nextLine();

        input.close();

        Material gamerMaterial = factory.createMaterialByName(gamerInputMaterial);
        Material cpuMaterial = factory.createMaterialByName("P");

        checkData(gamerMaterial, cpuMaterial);
    }

    public static void checkData(Material userMaterial, Material cpuMaterial) {

        String output = userMaterial.isBetterThan(cpuMaterial);

        System.out.println(output);

    }

}

        
