package game;
import game.Player;
import game.Enemy;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.print("Enter your character's name : ");
        Scanner myObj = new Scanner(System.in);
        String userInput = myObj.nextLine();
        Enemy enemy = new Enemy("Monster name",30,30);
        Player player = new Player(userInput, 50, 50, 1, 0, 30, 30, 10);
        while (enemy.hp >0 && player.hp >0){
            System.out.println("What will you do? :");
            System.out.println("1) Attack");
            System.out.println("2) Magic");
            System.out.println("3) Wait");
            String realUserInput = myObj.nextLine();
            String newUserInput = (realUserInput.toLowerCase()).trim();
            switch (newUserInput){
                case "attack":
                    Player.Attack(enemy,player);
                    break;
                case "magic":
                    Player.Magic(enemy,player);
                    break;
                default:
                    System.out.println("Choose a new approach.");
            }


        }

    }
}
