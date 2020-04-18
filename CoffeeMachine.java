package machine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        // The coffee machine needs 200 ml of water, 50 ml of milk and 15 g of coffee beans per one cup of coffee

        int waterCounter = water / 200;
        int milkCounter = milk / 50;
        int coffeeCounter = coffee / 15;


        // Find out what is the minimum cup of coffee that we can make with the given amount of ingredient
        // System.out.println("watercounter: " + waterCounter);
        // System.out.println("milkcounter: " + milkCounter);
        // System.out.println("coffeecounter: " +coffeeCounter);

        int[] array = new int[3];
        array[0] = waterCounter;
        array[1] = milkCounter;
        array[2] = coffeeCounter;

        int maxAmount = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] < maxAmount){
                maxAmount = array[i];
            }
        }

       // System.out.println("Max amount: " + maxAmount);


        if (maxAmount < cups){
            System.out.println("No, I can make only " + maxAmount + " cup(s) of coffee");
        } else if (maxAmount == cups){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maxAmount > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxAmount - cups) + " more than that");
        }


        /*
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

        */

    }
}




