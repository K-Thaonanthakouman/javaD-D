package game;

import character.Character;
import character.attack.Spell;
import character.attack.Weapon;
import character.category.Warrior;
import character.category.Wizard;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public void startMenu () {
        Scanner askCharacter = new Scanner(System.in);
        System.out.println("Qui êtes-vous ?");
        String nameCharacter = askCharacter.nextLine();
        String job = "";

        while (!job.equals("Warrior") && !job.equals("Wizard")) {
            System.out.println("Quelle est votre profession ? Guerrier ou magicien ?");
            job = askCharacter.nextLine();

            if (job.equalsIgnoreCase("Guerrier")) {
                job = "Warrior";
            }
            else if (job.equalsIgnoreCase("Magicien")) {
                job = "Wizard";
            }
            else {
                System.out.println("Votre classe n'est pas reconnue.");
            }
        }

        Character player;

        if (job.equals("Warrior")) {
            player = new Warrior(nameCharacter, job, 10, 5);

        }
        else {
            player = new Wizard(nameCharacter, job, 6, 8);

        }

        System.out.println(player);

        if (job.equals("Warrior")) {
            System.out.println(player.getWeapon());
        }
        else {
            System.out.println(player.getSpell());
        }

        Game start = new Game();
        int choice;

        do {
            System.out.println("Voulez-vous démarrer ou modifier votre personnage ?");
            System.out.println("1 - Démarrer");
            System.out.println("2 - Modifier");
            choice = askCharacter.nextInt();

            switch (choice) {
                case 1:
                    start.startGame(player);
                    break;
                case 2:
                    this.startMenu();
                    break;
                default:
                    System.out.println("Erreur de saisie !");
            }
        }
        while (choice != 1 && choice != 2);
        askCharacter.close();
    }
}
