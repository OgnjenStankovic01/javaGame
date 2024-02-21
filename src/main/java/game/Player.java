package game;
import game.Enemy;
public class Player {
    String name;
    int maxhp;
    int hp;
    int level;
    int xp;
    int mana;
    int maxmana;
    int atk;
    Player(String name, int maxhp, int hp, int level, int xp, int mana, int maxmana, int atk){
        this.name = name;
        this.hp = hp;
        this.maxhp = maxhp;
        this.level = level;
        this.xp = xp;
        this.mana = mana;
        this.maxmana = maxmana;
        this.atk = atk;
    }
    static void Magic(Enemy enemy, Player player){
        if(player.mana > 0){
            System.out.println("You cast a spell and deal 20 damage!");
            enemy.hp -= 20;
        }
    }
    static void Attack(Enemy enemy, Player player){
        if (player.hp> 0 && enemy.hp>0){
            System.out.println("You attack the monster! It takes " + player.atk +" damage!");
            enemy.hp -= player.atk;
        }
        else {
            System.out.println("The monster is dead! You recieve "+ enemy.xp+ " XP!");
            player.xp += enemy.xp;
        }
    }

}




