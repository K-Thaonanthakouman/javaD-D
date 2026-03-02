package game;

import java.lang.String;
import java.util.Scanner;
import character.Character;
import character.category.Warrior;
import character.category.Wizard;

public class Main {
    public static void main () {
        Scanner askCharacter = new Scanner(System.in);
        System.out.println("Qui êtes-vous ?");
        String nameCharacter = askCharacter.nextLine();
        String job = "";

        while (!job.equals("Warrior") && !job.equals("Wizard")) {
            System.out.println("Quelle est votre profession ? Guerrier ou magicien ?");
            job = askCharacter.nextLine();

            if (job.equalsIgnoreCase("Guerrier")) {
                job = "Warrior";
            } else if (job.equalsIgnoreCase("Magicien")) {
                job = "Wizard";
            } else {
                System.out.println("Votre classe n'est pas reconnue.");
            }
        }

        askCharacter.close();
        Character player;

        if (job.equals("Warrior")) {
            player = new Warrior(nameCharacter, job);
            player.setHp(10);
            player.setAttack(5);
        }
        else {
            player = new Wizard(nameCharacter, job);
            player.setHp(6);
            player.setAttack(8);
        }

        System.out.println("Vous vous appelez " + player.getName() + " et vous êtes un " + player.getCategory() + " !");
        System.out.println("Vous disposez de " + player.getHp() + " pv et de " + player.getAttack() + " pts d'attaque.");


    }
}

