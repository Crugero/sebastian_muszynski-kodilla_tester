public class Gothic {
//    Character diego = new Character();
//    Character gorn = new Character();


    public static void main(String[] args) {
        Character diego = new Character("Diego", 100, 10);
        Character gorn = new Character("Gorn", 120, 10);

        printCharacter(diego);
        printCharacter(gorn);

        gorn.dealDmg(50);

        printCharacter(gorn);

        gorn.dealDmg(100);
    }

    static void printCharacter(Character character) {
        System.out.println("Name " + character.name);
        System.out.println("MaxHP " + character.maxHP);
        System.out.println("CurrentHP " + character.currentHP);
        System.out.println("Armor " + character.armor);
        System.out.println("============================================");
    }
}

class Character {
    String name;
    int currentHP;
    int maxHP;
    int armor;

    Character(String name, int HP, int armor) {
        this.name = name;
        currentHP = HP;
        maxHP = HP;
        this.armor = armor;
    }

    void dealDmg(int damage) {
        int finalDamage = calculateDmg(damage);
        if(finalDamage > 0) {
            currentHP = currentHP - finalDamage;
            checkIfDied();
        }
    }

    private int calculateDmg(int damage) {
        return damage - armor;
    }

    private void checkIfDied() {
        if(currentHP <= 0) {
            System.out.println(name + " died!");
        }
    }
}