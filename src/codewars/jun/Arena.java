package codewars.jun;


class Fighter {
    String name;
    int health, damagePerAttack;
    Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
public class Arena {
    private static String whoIsALive(Fighter fighterX1,Fighter fighterX2){
        while (fighterX2.health > 0) {
            if (fighterX1.health > 0) {
                fighterX2.health -= fighterX1.damagePerAttack;
                fighterX1.health -= fighterX2.damagePerAttack;
            } else {
                return fighterX2.name;
            }
        }
        return fighterX1.name;
    }
    private static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
            if (firstAttacker.equals(fighter1.name))
                return whoIsALive(fighter1,fighter2);
            else
                return whoIsALive(fighter2,fighter1);
    }

    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew",10,2),new Fighter("Harry",5,4),"Lew"));
    }
}
