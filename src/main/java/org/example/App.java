package org.example;

import java.util.Arrays;

import static org.example.TddArray.impares;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(Arrays.toString(impares(5)));

        Keyword.containsKeyword("Hola que tal?");
        Keyword.containsKeyword("dont break my heart");
        Keyword.containsKeyword("Bailas breakdance?");

        Wizard wizard1 = new Wizard(100, 10, 3);
        Wizard wizard2 = new Wizard(50, 5, 1);
        Warrior warrior1 = new Warrior(90, 30,2);
        Warrior warrior2 = new Warrior(60, 40,2);


        warrior1.attack(wizard2);
        wizard1.convertToElf();
        wizard1.attack(warrior2);
        warrior2.attack(wizard2);

    }
}
