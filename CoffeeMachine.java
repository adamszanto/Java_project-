package machine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //    System.out.println("Write how many ml of water the coffee machine has: ");
        int water = 400;

        //  System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = 540;

        //  System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = 120;

        //  System.out.println("Write how many cups of coffee you will need:");
        int cups = 9;
        int money = 550;

        // THIS IS WHERE THE MAIN LOGIC STARTS AFTER THE 5/8 implementation

      /*  System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money"); */

        while(true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String command = scanner.nextLine();

            // EXIT
            if(command.equals("exit")){
                break;
            }

            // BUY ACTION LOGIC
            if(command.equals("buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - capuccino, back - to main menu");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        if(water < 250){
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if(coffee < 16){
                            System.out.println("Sorry, not enough coffee!");
                            break;
                        } else if(cups == 0){
                            System.out.println("Sorry, not enought disposable cup!");
                            break;
                        } else {
                            water -= 250;
                            coffee -= 16;
                            cups -= 1;
                            money += 4;
                        }

                        break;

                    case "2":

                        if(water < 350){
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if(milk < 75){
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if(coffee < 20){
                            System.out.println("Sorry, not enough coffee!");
                            break;
                        } else if(cups == 0){
                            System.out.println("Sorry, not enought disposable cup!");
                            break;
                        } else {
                            water -= 350;
                            milk -= 75;
                            coffee -= 20;
                            cups -= 1;
                            money += 7;
                        }
                        break;

                    case "3":

                        if(water < 200){
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if(milk < 100){
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if(coffee < 12){
                            System.out.println("Sorry, not enough coffee!");
                            break;
                        } else if(cups == 0){
                            System.out.println("Sorry, not enought disposable cup!");
                            break;
                        } else {
                            water -= 200;
                            milk -= 100;
                            coffee -= 12;
                            cups -= 1;
                            money += 6;
                        }


                        break;

                    case "back":
                        break;

                }



            }

            // FILL LOGIC

            if(command.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                coffee  += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                cups += scanner.nextInt();

                System.out.println("The coffee machine has: ");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffee + " of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println(money + " of money");
            }

            // TAKE LOGIC

            if(command.equals("take")){
                System.out.println("I gave you $" + money);
                money = 0;

                System.out.println("The coffee machine has: ");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffee + " of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println(money + " of money");
            }

            // REMAINING LOGIC

            if(command.equals("remaining")){
                System.out.println("The coffee machine has: ");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffee + " of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println(money + " of money");
            }

        }










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

        // 4/8 IMPLEMENTATION OF COFFEE MACHINE

        // System.out.println("Max amount: " + maxAmount);


       /* if (maxAmount < cups){
            System.out.println("No, I can make only " + maxAmount + " cup(s) of coffee");
        } else if (maxAmount == cups){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maxAmount > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxAmount - cups) + " more than that");
        }
        */

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




