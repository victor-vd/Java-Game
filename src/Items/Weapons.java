package Items;

public class Weapons {
    int damage;
    int range;
    int balance;
    String type;

    public Weapons (int newDamage, int newRange, int newBalance, String newType) {
        damage = newDamage;
        range = newRange;
        balance = newBalance;
        type = newType;
    }

    public void ShortSword () {
        damage = 6;
        range = 1;
        balance = 90;
        type = "melee";
    }
    public void LongSword () {
        damage = 8;
        range = 2;
        balance = 80;
        type = "melee";
    }
    public void GreatSword () {
        damage = 10;
        range = 3;
        balance = 60;
        type = "melee";
    }
    public void ShortBow () {
        damage = 6;
        range = 4;
        balance = 100;
        type = "ranged";
    }
    public void LongBow () {
        damage = 8;
        range = 5;
        balance = 80;
        type = "ranged";
    }
}
