package machine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int command = scanner.nextInt();

        // Ingredient amount for 1 cup of coffee:
        // 200 ml of water
        // 50 ml of milk
        // 15 g of coffee beans
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;

        System.out.println("For " + command + " cups of coffee you will need:\n" +
                command * water + " ml of water\n" +
                command * milk + " ml of milk\n" +
                command * coffeeBeans + " g of coffee beans");


      /*  System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!"); */
    }
}


