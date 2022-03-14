package com.factoriaf5.rps.application;

import java.util.Scanner;

import com.factoriaf5.rps.models.Material;
import com.factoriaf5.rps.models.MaterialFactory;

public class Game {
    
    public static MaterialFactory factory = new MaterialFactory();

    public static void main(String[] args) {

        startGame();
    }

    public static void startGame(){

        Scanner input = new Scanner(System.in);

        System.out.println("Player One: Introduzca Rock(R), Paper(P) o Scissors(S)");
        String playerOneInputMaterial = input.nextLine();

        System.out.println("Player Two: Introduzca Rock(R), Paper(P) o Scissors(S)");
        String playerTwoInputMaterial = input.nextLine();

        input.close();

        Material playerOneMaterial = factory.createMaterial(playerOneInputMaterial);
        Material playerTwoMaterial = factory.createMaterial(playerTwoInputMaterial);

        checkAndShowWinner(playerOneMaterial, playerTwoMaterial);
    }

    public static String checkAndShowWinner(Material playerOneMaterial, Material playerTwoMaterial) {

        String winner = playerOneMaterial.isBetterThan(playerTwoMaterial);

        System.out.println(winner);
        
        return winner;
    }
}

        
