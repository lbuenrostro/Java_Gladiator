import java.util.Scanner;

public class Main {
    public static void moves(){
        System.out.println("[A]ttack");
        System.out.println("[I]ncrease Rage");
        System.out.println("[H]eal");

    }

    public static void display(Gladiator one, Gladiator two) {
        System.out.println(one.name + " : " + " Health: " + one.health + " Rage: " + one.rage);
        System.out.println(two.name + " : " + " Health: " + two.health + " Rage: " + two.rage + "\n");

    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Gladiator gladiator1 = new Gladiator("Liza", 100, 0, 7, 20);
        Gladiator gladiator2 = new Gladiator("Panda", 100, 0, 7, 20);


        String answer;
        while (true) {
            ////////         Gladiator 1        ///////
            moves();
            System.out.println("Liza Make a move:\n");
            answer = reader.nextLine();
            if (answer.equals("A")) {
                gladiator1.attack(gladiator2);
                display(gladiator1, gladiator2);
            } else if (answer.equals("I")){
                gladiator1.increaseRage();
                display(gladiator1, gladiator2);
            }
            else if (answer.equals("H")) {
                gladiator1.heal();
                display(gladiator1, gladiator2);
            }
            if (gladiator2.isDead()) {
                System.out.println("Gladiator_2 You're Dead! Gladiator_1 Wins!");
                break;
            }

            ////////         Gladiator 2        ///////
            moves();
            System.out.println("Panda Make a move:\n");
            answer = reader.nextLine();
            if (answer.equals("A")) {
                gladiator2.attack(gladiator1);
                display(gladiator1, gladiator2);
            }else if (answer.equals("I")){
                gladiator1.increaseRage();
                display(gladiator1, gladiator2);
            }
            else if (answer.equals("H")) {
                gladiator2.heal();
                display(gladiator1, gladiator2);
            }

            if (gladiator1.isDead()) {
                System.out.println("Gladiator_1 You're Dead! Gladiator_1 Wins!");
                break;
            }
        }
    }
}

