import java.util.Scanner;
//here is the main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //6 x 6 x 6 array for vending machine
        VendingMachine vendingMachine = new VendingMachine(6, 6, 6);
        Prices priceItems = new Prices(6, 6, 6);
        Calories calorieItem = new Calories(6, 6, 6);

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Available items:");

//here is the vending machine
        for (int i = 0; i < vendingMachine.products[2].length - 1; i++) {
            vendingMachine.addProduct(0, 0, 0, "Oreos: Cal 270");
            priceItems.addPrices(0, 0, 0, 4.00);
            calorieItem.addCalories(0, 0, 0, 270);

            vendingMachine.addProduct(0, 0, 1, "Oreos: Cal 270");
            priceItems.addPrices(0, 0, 1, 4.00);
            calorieItem.addCalories(0, 0, 1, 270);

            vendingMachine.addProduct(0, 0, 2, "Oreos: Cal 270");
            priceItems.addPrices(0, 0, 2, 4.00);
            calorieItem.addCalories(0, 0, 2, 270);

            vendingMachine.addProduct(0, 0, 3, "Oreos: Cal 270");
            priceItems.addPrices(0, 0, 3, 4.00);
            calorieItem.addCalories(0, 0, 3, 270);

            vendingMachine.addProduct(0, 0, 4, "Oreos: Cal 270");
            priceItems.addPrices(0, 0, 4, 4.00);
            calorieItem.addCalories(0, 0, 4, 270);

            vendingMachine.addProduct(0, 0, 5, "Oreos: Cal 270");
            priceItems.addPrices(0, 0, 5, 4.00);
            calorieItem.addCalories(0, 0, 5, 270);

            vendingMachine.addProduct(0, 0, 6, "Oreos: Cal 270");
            priceItems.addPrices(0, 0, 6, 4.00);
            calorieItem.addCalories(0, 0, 6, 270);

            //end of oreo depth

            vendingMachine.addProduct(1, 0, 0, "Water: Cal 0");
            priceItems.addPrices(1, 0, 0, 2.00);
            calorieItem.addCalories(1, 0, 0, 0);

            vendingMachine.addProduct(1, 0, 1, "Water: Cal 0");
            priceItems.addPrices(1, 0, 1, 2.00);
            calorieItem.addCalories(1, 0, 1, 0);

            vendingMachine.addProduct(1, 0, 2, "Water: Cal 0");
            priceItems.addPrices(1, 0, 2, 2.00);
            calorieItem.addCalories(1, 0, 2, 0);

            vendingMachine.addProduct(1, 0, 3, "Water: Cal 0");
            priceItems.addPrices(1, 0, 3, 2.00);
            calorieItem.addCalories(1, 0, 3, 0);

            vendingMachine.addProduct(1, 0, 4, "Water: Cal 0");
            priceItems.addPrices(1, 0, 4, 2.00);
            calorieItem.addCalories(1, 0, 4, 0);

            vendingMachine.addProduct(1, 0, 5, "Water: Cal 0");
            priceItems.addPrices(1, 0, 5, 2.00);
            calorieItem.addCalories(1, 0, 5, 0);

            vendingMachine.addProduct(1, 0, 6, "Water: Cal 0");
            priceItems.addPrices(1, 0, 6, 2.00);
            calorieItem.addCalories(1, 0, 6, 0);

            //end of water

            vendingMachine.addProduct(2, 0, 0, "Granola Bar: Cal 50");
            priceItems.addPrices(2, 0, 0, 5.00);
            calorieItem.addCalories(2, 0, 0, 50);

            vendingMachine.addProduct(2, 0, 1, "Granola Bar: Cal 50");
            priceItems.addPrices(2, 0, 1, 5.00);
            calorieItem.addCalories(2, 0, 1, 50);

            vendingMachine.addProduct(2, 0, 2, "Granola Bar: Cal 50");
            priceItems.addPrices(2, 0, 2, 5.00);
            calorieItem.addCalories(2, 0, 2, 50);

            vendingMachine.addProduct(2, 0, 3, "Granola Bar: Cal 50");
            priceItems.addPrices(2, 0, 3, 5.00);
            calorieItem.addCalories(2, 0, 3, 50);

            vendingMachine.addProduct(2, 0, 4, "Granola Bar: Cal 50");
            priceItems.addPrices(2, 0, 4, 5.00);
            calorieItem.addCalories(2, 0, 4, 50);

            vendingMachine.addProduct(2, 0, 5, "Granola Bar: Cal 50");
            priceItems.addPrices(2, 0, 5, 5.00);
            calorieItem.addCalories(2, 0, 5, 50);

            vendingMachine.addProduct(2, 0, 6, "Granola Bar: Cal 50");
            priceItems.addPrices(2, 0, 6, 5.00);
            calorieItem.addCalories(2, 0, 6, 50);

            //end of granola bar

            vendingMachine.addProduct(3, 0, 0, "Doritos: Cal 150");
            priceItems.addPrices(3, 0, 0, 4.00);
            calorieItem.addCalories(3, 0, 0, 150);

            vendingMachine.addProduct(3, 0, 1, "Doritos: Cal 150");
            priceItems.addPrices(3, 0, 1, 4.00);
            calorieItem.addCalories(3, 0, 1, 150);

            vendingMachine.addProduct(3, 0, 2, "Doritos: Cal 150");
            priceItems.addPrices(3, 0, 2, 4.00);
            calorieItem.addCalories(3, 0, 2, 150);

            vendingMachine.addProduct(3, 0, 3, "Doritos: Cal 150");
            priceItems.addPrices(3, 0, 3, 4.00);
            calorieItem.addCalories(3, 0, 3, 150);

            vendingMachine.addProduct(3, 0, 4, "Doritos: Cal 150");
            priceItems.addPrices(3, 0, 4, 4.00);
            calorieItem.addCalories(3, 0, 4, 150);

            vendingMachine.addProduct(3, 0, 5, "Doritos: Cal 150");
            priceItems.addPrices(3, 0, 5, 4.00);
            calorieItem.addCalories(3, 0, 5, 150);

            vendingMachine.addProduct(3, 0, 6, "Doritos: Cal 150");
            priceItems.addPrices(3, 0, 6, 4.00);
            calorieItem.addCalories(3, 0, 6, 150);

            //end of doritos

            vendingMachine.addProduct(4, 0, 0, "Energy Drink: Cal 110");
            priceItems.addPrices(4, 0, 0, 9.00);
            calorieItem.addCalories(4, 0, 0, 110);

            vendingMachine.addProduct(4, 0, 1, "Energy Drink: Cal 110");
            priceItems.addPrices(4, 0, 1, 9.00);
            calorieItem.addCalories(4, 0, 1, 110);

            vendingMachine.addProduct(4, 0, 2, "Energy Drink: Cal 110");
            priceItems.addPrices(4, 0, 2, 9.00);
            calorieItem.addCalories(4, 0, 2, 110);

            vendingMachine.addProduct(4, 0, 3, "Energy Drink: Cal 110");
            priceItems.addPrices(4, 0, 3, 9.00);
            calorieItem.addCalories(4, 0, 3, 110);

            vendingMachine.addProduct(4, 0, 4, "Energy Drink: Cal 110");
            priceItems.addPrices(4, 0, 4, 9.00);
            calorieItem.addCalories(4, 0, 4, 110);

            vendingMachine.addProduct(4, 0, 5, "Energy Drink: Cal 110");
            priceItems.addPrices(4, 0, 5, 9.00);
            calorieItem.addCalories(4, 0, 5, 110);

            vendingMachine.addProduct(4, 0, 6, "Energy Drink: Cal 110");
            priceItems.addPrices(4, 0, 6, 9.00);
            calorieItem.addCalories(4, 0, 6, 110);

            //end of energy drink

            vendingMachine.addProduct(5, 0, 0, "Chocolate Milk: Cal 208");
            priceItems.addPrices(5, 0, 0, 9.00);
            calorieItem.addCalories(5, 0, 0, 208);

            vendingMachine.addProduct(5, 0, 1, "Chocolate Milk: Cal 208");
            priceItems.addPrices(5, 0, 1, 9.00);
            calorieItem.addCalories(5, 0, 1, 208);

            vendingMachine.addProduct(5, 0, 2, "Chocolate Milk: Cal 208");
            priceItems.addPrices(5, 0, 2, 9.00);
            calorieItem.addCalories(5, 0, 2, 208);

            vendingMachine.addProduct(5, 0, 3, "Chocolate Milk: Cal 208");
            priceItems.addPrices(5, 0, 3, 9.00);
            calorieItem.addCalories(5, 0, 3, 208);

            vendingMachine.addProduct(5, 0, 4, "Chocolate Milk: Cal 208");
            priceItems.addPrices(5, 0, 4, 9.00);
            calorieItem.addCalories(5, 0, 4, 208);

            vendingMachine.addProduct(5, 0, 5, "Chocolate Milk: Cal 208");
            priceItems.addPrices(5, 0, 5, 9.00);
            calorieItem.addCalories(5, 0, 5, 208);

            vendingMachine.addProduct(5, 0, 6, "Chocolate Milk: Cal 208");
            priceItems.addPrices(5, 0, 6, 9.00);
            calorieItem.addCalories(5, 0, 6, 208);

            //end of chocolate milk

            vendingMachine.addProduct(6, 0, 0, "Fritos Chips: Cal 160");
            priceItems.addPrices(6, 0, 0, 6.50);
            calorieItem.addCalories(6, 0, 0, 160);

            vendingMachine.addProduct(6, 0, 1, "Fritos Chips: Cal 160");
            priceItems.addPrices(6, 0, 1, 6.50);
            calorieItem.addCalories(6, 0, 1, 160);

            vendingMachine.addProduct(6, 0, 2, "Fritos Chips: Cal 160");
            priceItems.addPrices(6, 0, 2, 6.50);
            calorieItem.addCalories(6, 0, 2, 160);

            vendingMachine.addProduct(6, 0, 3, "Fritos Chips: Cal 160");
            priceItems.addPrices(6, 0, 3, 6.50);
            calorieItem.addCalories(6, 0, 3, 160);

            vendingMachine.addProduct(6, 0, 4, "Fritos Chips: Cal 160");
            priceItems.addPrices(6, 0, 4, 6.50);
            calorieItem.addCalories(6, 0, 4, 160);

            vendingMachine.addProduct(6, 0, 5, "Fritos Chips: Cal 160");
            priceItems.addPrices(6, 0, 5, 6.50);
            calorieItem.addCalories(6, 0, 5, 160);

            vendingMachine.addProduct(6, 0, 6, "Fritos Chips: Cal 160");
            priceItems.addPrices(6, 0, 6, 6.50);
            calorieItem.addCalories(6, 0, 6, 160);

            //end of fritos chips

            vendingMachine.addProduct(6, 1, 0, "Kit-Kat: Cal 210");
            priceItems.addPrices(6, 1, 0, 3.50);
            calorieItem.addCalories(6, 1, 0, 210);

            vendingMachine.addProduct(6, 1, 1, "Kit-Kat: Cal 210");
            priceItems.addPrices(6, 1, 1, 3.50);
            calorieItem.addCalories(6, 1, 1, 210);

            vendingMachine.addProduct(6, 1, 2, "Kit-Kat: Cal 210");
            priceItems.addPrices(6, 1, 2, 3.50);
            calorieItem.addCalories(6, 1, 2, 210);

            vendingMachine.addProduct(6, 1, 3, "Kit-Kat: Cal 210");
            priceItems.addPrices(6, 1, 3, 3.50);
            calorieItem.addCalories(6, 1, 3, 210);

            vendingMachine.addProduct(6, 1, 4, "Kit-Kat: Cal 210");
            priceItems.addPrices(6, 1, 4, 3.50);
            calorieItem.addCalories(6, 1, 4, 210);

            vendingMachine.addProduct(6, 1, 5, "Kit-Kat: Cal 210");
            priceItems.addPrices(6, 1, 5, 3.50);
            calorieItem.addCalories(6, 1, 5, 210);

            vendingMachine.addProduct(6, 1, 6, "Kit-Kat: Cal 210");
            priceItems.addPrices(6, 1, 6, 3.50);
            calorieItem.addCalories(6, 1, 6, 210);

            //end of kit-kat

            vendingMachine.addProduct(5, 1, 0, "Hershey Bar: Cal 210");
            priceItems.addPrices(5, 1, 0, 5.50);
            calorieItem.addCalories(5, 1, 0, 210);

            vendingMachine.addProduct(5, 1, 1, "Hershey Bar: Cal 210");
            priceItems.addPrices(5, 1, 1, 5.50);
            calorieItem.addCalories(5, 1, 1, 210);

            vendingMachine.addProduct(5, 1, 2, "Hershey Bar: Cal 210");
            priceItems.addPrices(5, 1, 2, 5.50);
            calorieItem.addCalories(5, 1, 2, 210);

            vendingMachine.addProduct(5, 1, 3, "Hershey Bar: Cal 210");
            priceItems.addPrices(5, 1, 3, 5.50);
            calorieItem.addCalories(5, 1, 3, 210);

            vendingMachine.addProduct(5, 1, 4, "Hershey Bar: Cal 210");
            priceItems.addPrices(5, 1, 4, 5.50);
            calorieItem.addCalories(5, 1, 4, 210);

            vendingMachine.addProduct(5, 1, 5, "Hershey Bar: Cal 210");
            priceItems.addPrices(5, 1, 5, 5.50);
            calorieItem.addCalories(5, 1, 5, 210);

            vendingMachine.addProduct(5, 1, 6, "Hershey Bar: Cal 210");
            priceItems.addPrices(5, 1, 6, 5.50);
            calorieItem.addCalories(5, 1, 6, 210);

            //end of hershey bars

            vendingMachine.addProduct(4, 1, 0, "Twix Bar: Cal 100");
            priceItems.addPrices(4, 1, 0, 2.50);
            calorieItem.addCalories(4, 1, 0, 100);

            vendingMachine.addProduct(4, 1, 1, "Twix Bar: Cal 100");
            priceItems.addPrices(4, 1, 1, 2.50);
            calorieItem.addCalories(4, 1, 1, 100);

            vendingMachine.addProduct(4, 1, 2, "Twix Bar: Cal 100");
            priceItems.addPrices(4, 1, 2, 2.50);
            calorieItem.addCalories(4, 1, 2, 100);

            vendingMachine.addProduct(4, 1, 3, "Twix Bar: Cal 100");
            priceItems.addPrices(4, 1, 3, 2.50);
            calorieItem.addCalories(4, 1, 3, 100);

            vendingMachine.addProduct(4, 1, 4, "Twix Bar: Cal 100");
            priceItems.addPrices(4, 1, 4, 2.50);
            calorieItem.addCalories(4, 1, 4, 100);

            vendingMachine.addProduct(4, 1, 5, "Twix Bar: Cal 100");
            priceItems.addPrices(4, 1, 5, 2.50);
            calorieItem.addCalories(4, 1, 5, 100);

            vendingMachine.addProduct(4, 1, 6, "Twix Bar: Cal 100");
            priceItems.addPrices(4, 1, 6, 2.50);
            calorieItem.addCalories(4, 1, 6, 100);

            //end of twix bar

            vendingMachine.addProduct(3, 1, 0, "Milky Way Bar: Cal 240");
            priceItems.addPrices(3, 1, 0, 5.50);
            calorieItem.addCalories(3, 1, 0, 240);

            vendingMachine.addProduct(3, 1, 1, "Milky Way Bar: Cal 240");
            priceItems.addPrices(3, 1, 1, 5.50);
            calorieItem.addCalories(3, 1, 1, 240);

            vendingMachine.addProduct(3, 1, 2, "Milky Way Bar: Cal 240");
            priceItems.addPrices(3, 1, 2, 5.50);
            calorieItem.addCalories(3, 1, 2, 240);

            vendingMachine.addProduct(3, 1, 3, "Milky Way Bar: Cal 240");
            priceItems.addPrices(3, 1, 3, 5.50);
            calorieItem.addCalories(3, 1, 3, 240);

            vendingMachine.addProduct(3, 1, 4, "Milky Way Bar: Cal 240");
            priceItems.addPrices(3, 1, 4, 5.50);
            calorieItem.addCalories(3, 1, 4, 240);

            vendingMachine.addProduct(3, 1, 5, "Milky Way Bar: Cal 240");
            priceItems.addPrices(3, 1, 5, 5.50);
            calorieItem.addCalories(3, 1, 5, 240);

            vendingMachine.addProduct(3, 1, 6, "Milky Way Bar: Cal 240");
            priceItems.addPrices(3, 1, 6, 5.50);
            calorieItem.addCalories(3, 1, 6, 240);

            //end of Milky Way

            vendingMachine.addProduct(2, 1, 0, "Chips Ahoy Cookies: Cal 160");
            priceItems.addPrices(2, 1, 0, 5.50);
            calorieItem.addCalories(2, 1, 0, 160);

            vendingMachine.addProduct(2, 1, 1, "Chips Ahoy Cookies: Cal 160");
            priceItems.addPrices(2, 1, 1, 5.50);
            calorieItem.addCalories(2, 1, 1, 240);

            vendingMachine.addProduct(2, 1, 2, "Chips Ahoy Cookies: Cal 160");
            priceItems.addPrices(2, 1, 2, 5.50);
            calorieItem.addCalories(2, 1, 2, 240);

            vendingMachine.addProduct(2, 1, 3, "Chips Ahoy Cookies: Cal 160");
            priceItems.addPrices(2, 1, 3, 5.50);
            calorieItem.addCalories(2, 1, 3, 240);

            vendingMachine.addProduct(2, 1, 4, "Chips Ahoy Cookies: Cal 160");
            priceItems.addPrices(2, 1, 4, 5.50);
            calorieItem.addCalories(2, 1, 4, 240);

            vendingMachine.addProduct(2, 1, 5, "Chips Ahoy Cookies: Cal 160");
            priceItems.addPrices(2, 1, 5, 5.50);
            calorieItem.addCalories(2, 1, 5, 240);

            vendingMachine.addProduct(2, 1, 6, "Chips Ahoy Cookies: Cal 160");
            priceItems.addPrices(2, 1, 6, 5.50);
            calorieItem.addCalories(2, 1, 6, 240);

            //end of Chips Ahoy Cookies

            vendingMachine.addProduct(1, 1, 0, "Veggie Straws: Cal 200");
            priceItems.addPrices(1, 1, 0, 6.50);
            calorieItem.addCalories(1, 1, 0, 200);

            vendingMachine.addProduct(1, 1, 1, "Veggie Straws: Cal 200");
            priceItems.addPrices(1, 1, 1, 6.50);
            calorieItem.addCalories(1, 1, 1, 200);

            vendingMachine.addProduct(1, 1, 2, "Veggie Straws: Cal 200");
            priceItems.addPrices(1, 1, 2, 6.50);
            calorieItem.addCalories(1, 1, 2, 200);

            vendingMachine.addProduct(1, 1, 3, "Veggie Straws: Cal 200");
            priceItems.addPrices(1, 1, 3, 6.50);
            calorieItem.addCalories(1, 1, 3, 200);

            vendingMachine.addProduct(1, 1, 4, "Veggie Straws: Cal 200");
            priceItems.addPrices(1, 1, 4, 6.50);
            calorieItem.addCalories(1, 1, 4, 200);

            vendingMachine.addProduct(1, 1, 5, "Veggie Straws: Cal 200");
            priceItems.addPrices(1, 1, 5, 6.50);
            calorieItem.addCalories(1, 1, 5, 200);

            vendingMachine.addProduct(1, 1, 6, "Veggie Straws: Cal 200");
            priceItems.addPrices(1, 1, 6, 6.50);
            calorieItem.addCalories(1, 1, 6, 200);

            //end of veggie straws

            vendingMachine.addProduct(0, 1, 0, "Fruit Roll Ups: Cal 50");
            priceItems.addPrices(0, 1, 0, 1.50);
            calorieItem.addCalories(0, 1, 0, 50);

            vendingMachine.addProduct(0, 1, 1, "Fruit Roll Ups: Cal 50");
            priceItems.addPrices(0, 1, 1, 1.50);
            calorieItem.addCalories(0, 1, 1, 50);

            vendingMachine.addProduct(0, 1, 2, "Fruit Roll Ups: Cal 50");
            priceItems.addPrices(0, 1, 2, 1.50);
            calorieItem.addCalories(0, 1, 2, 50);

            vendingMachine.addProduct(0, 1, 3, "Fruit Roll Ups: Cal 50");
            priceItems.addPrices(0, 1, 3, 1.50);
            calorieItem.addCalories(0, 1, 3, 50);

            vendingMachine.addProduct(0, 1, 4, "Fruit Roll Ups: Cal 50");
            priceItems.addPrices(0, 1, 4, 1.50);
            calorieItem.addCalories(0, 1, 4, 50);

            vendingMachine.addProduct(0, 1, 5, "Fruit Roll Ups: Cal 50");
            priceItems.addPrices(0, 1, 5, 1.50);
            calorieItem.addCalories(0, 1, 5, 50);

            vendingMachine.addProduct(0, 1, 6, "Fruit Roll Ups: Cal 50");
            priceItems.addPrices(0, 1, 6, 1.50);
            calorieItem.addCalories(0, 1, 6, 50);

            //end of fruit roll ups

            vendingMachine.addProduct(0, 2, 0, "Popcorn: Cal 31");
            priceItems.addPrices(0, 2, 0, 3.50);
            calorieItem.addCalories(0, 2, 0, 31);

            vendingMachine.addProduct(0, 2, 1, "Popcorn: Cal 31");
            priceItems.addPrices(0, 2, 1, 3.50);
            calorieItem.addCalories(0, 2, 1, 31);

            vendingMachine.addProduct(0, 2, 2, "Popcorn: Cal 31");
            priceItems.addPrices(0, 2, 2, 3.50);
            calorieItem.addCalories(0, 2, 2, 31);

            vendingMachine.addProduct(0, 2, 3, "Popcorn: Cal 31");
            priceItems.addPrices(0, 2, 3, 3.50);
            calorieItem.addCalories(0, 2, 3, 31);

            vendingMachine.addProduct(0, 2, 4, "Popcorn: Cal 31");
            priceItems.addPrices(0, 2, 4, 3.50);
            calorieItem.addCalories(0, 2, 4, 31);

            vendingMachine.addProduct(0, 2, 5, "Popcorn: Cal 31");
            priceItems.addPrices(0, 2, 5, 3.50);
            calorieItem.addCalories(0, 2, 5, 31);

            vendingMachine.addProduct(0, 2, 6, "Popcorn: Cal 31");
            priceItems.addPrices(0, 2, 6, 3.50);
            calorieItem.addCalories(0, 2, 6, 31);

            //end of popcorn

            vendingMachine.addProduct(1, 2, 0, "Cereal: Cal 150");
            priceItems.addPrices(1, 2, 0, 3.50);
            calorieItem.addCalories(1, 2, 0, 150);

            vendingMachine.addProduct(1, 2, 1, "Cereal: Cal 150");
            priceItems.addPrices(1, 2, 1, 3.50);
            calorieItem.addCalories(1, 2, 1, 150);

            vendingMachine.addProduct(1, 2, 2, "Cereal: Cal 150");
            priceItems.addPrices(1, 2, 2, 3.50);
            calorieItem.addCalories(1, 2, 2, 150);

            vendingMachine.addProduct(1, 2, 3, "Cereal: Cal 150");
            priceItems.addPrices(1, 2, 3, 3.50);
            calorieItem.addCalories(1, 2, 3, 150);

            vendingMachine.addProduct(1, 2, 4, "Cereal: Cal 150");
            priceItems.addPrices(1, 2, 4, 3.50);
            calorieItem.addCalories(1, 2, 4, 150);

            vendingMachine.addProduct(1, 2, 5, "Cereal: Cal 150");
            priceItems.addPrices(1, 2, 5, 3.50);
            calorieItem.addCalories(1, 2, 5, 150);

            vendingMachine.addProduct(1, 2, 6, "Cereal: Cal 150");
            priceItems.addPrices(1, 2, 6, 3.50);
            calorieItem.addCalories(1, 2, 6, 150);

            //end of cereal

            vendingMachine.addProduct(2, 2, 0, "Orange Juice: Cal 88");
            priceItems.addPrices(2, 2, 0, 5.75);

            vendingMachine.addProduct(2, 2, 1, "Orange Juice: Cal 88");
            priceItems.addPrices(2, 2, 1, 5.75);

            vendingMachine.addProduct(2, 2, 2, "Orange Juice: Cal 88");
            priceItems.addPrices(2, 2, 2, 5.75);

            vendingMachine.addProduct(2, 2, 3, "Orange Juice: Cal 88");
            priceItems.addPrices(2, 2, 3, 5.75);

            vendingMachine.addProduct(2, 2, 4, "Orange Juice: Cal 88");
            priceItems.addPrices(2, 2, 4, 5.75);

            vendingMachine.addProduct(2, 2, 5, "Orange Juice: Cal 88");
            priceItems.addPrices(2, 2, 5, 5.75);

            vendingMachine.addProduct(2, 2, 6, "Orange Juice: Cal 88");
            priceItems.addPrices(2, 2, 6, 5.75);

            //end of orange juice

            vendingMachine.addProduct(3, 2, 0, "Apple Juice: Cal 46");
            priceItems.addPrices(3, 2, 0, 5.75);

            vendingMachine.addProduct(3, 2, 1, "Apple Juice: Cal 46");
            priceItems.addPrices(3, 2, 1, 5.75);

            vendingMachine.addProduct(3, 2, 2, "Apple Juice: Cal 46");
            priceItems.addPrices(3, 2, 2, 5.75);

            vendingMachine.addProduct(3, 2, 3, "Apple Juice: Cal 46");
            priceItems.addPrices(3, 2, 3, 5.75);

            vendingMachine.addProduct(3, 2, 4, "Apple Juice: Cal 46");
            priceItems.addPrices(3, 2, 4, 5.75);

            vendingMachine.addProduct(3, 2, 5, "Apple Juice: Cal 46");
            priceItems.addPrices(3, 2, 5, 5.75);

            vendingMachine.addProduct(3, 2, 6, "Apple Juice: Cal 46");
            priceItems.addPrices(3, 2, 6, 5.75);

            //end of apple juice

            vendingMachine.addProduct(4, 2, 0, "Strawberry Juice: Cal 90");
            priceItems.addPrices(4, 2, 0, 8.75);

            vendingMachine.addProduct(4, 2, 1, "Strawberry Juice: Cal 90");
            priceItems.addPrices(4, 2, 1, 8.75);

            vendingMachine.addProduct(4, 2, 2, "Strawberry Juice: Cal 90");
            priceItems.addPrices(4, 2, 2, 8.75);

            vendingMachine.addProduct(4, 2, 3, "Strawberry Juice: Cal 90");
            priceItems.addPrices(4, 2, 3, 8.75);

            vendingMachine.addProduct(4, 2, 4, "Strawberry Juice: Cal 90");
            priceItems.addPrices(4, 2, 4, 8.75);

            vendingMachine.addProduct(4, 2, 5, "Strawberry Juice: Cal 90");
            priceItems.addPrices(4, 2, 5, 8.75);

            vendingMachine.addProduct(4, 2, 6, "Strawberry Juice: Cal 90");
            priceItems.addPrices(4, 2, 6, 8.75);

            //end of strawberry juice

            vendingMachine.addProduct(5, 2, 0, "Veggie Juice: Cal 160");
            priceItems.addPrices(5, 2, 0, 8.75);

            vendingMachine.addProduct(5, 2, 1, "Veggie Juice: Cal 160");
            priceItems.addPrices(5, 2, 1, 8.75);

            vendingMachine.addProduct(5, 2, 2, "Veggie Juice: Cal 160");
            priceItems.addPrices(5, 2, 2, 8.75);

            vendingMachine.addProduct(5, 2, 3, "Veggie Juice: Cal 160");
            priceItems.addPrices(5, 2, 3, 8.75);

            vendingMachine.addProduct(5, 2, 4, "Veggie Juice: Cal 160");
            priceItems.addPrices(5, 2, 4, 8.75);

            vendingMachine.addProduct(5, 2, 5, "Veggie Juice: Cal 160");
            priceItems.addPrices(5, 2, 5, 8.75);

            vendingMachine.addProduct(5, 2, 6, "Veggie Juice: Cal 160");
            priceItems.addPrices(5, 2, 6, 8.75);

            //end of veggie juice

            vendingMachine.addProduct(6, 2, 0, "Pineapple Juice: Cal 133");
            priceItems.addPrices(6, 2, 0, 6.35);

            vendingMachine.addProduct(6, 2, 1, "Pineapple Juice: Cal 133");
            priceItems.addPrices(6, 2, 1, 6.35);

            vendingMachine.addProduct(6, 2, 2, "Pineapple Juice: Cal 133");
            priceItems.addPrices(6, 2, 2, 6.35);

            vendingMachine.addProduct(6, 2, 3, "Pineapple Juice: Cal 133");
            priceItems.addPrices(6, 2, 3, 6.35);

            vendingMachine.addProduct(6, 2, 4, "Pineapple Juice: Cal 133");
            priceItems.addPrices(6, 2, 4, 6.35);

            vendingMachine.addProduct(6, 2, 5, "Pineapple Juice: Cal 133");
            priceItems.addPrices(6, 2, 5, 6.35);

            vendingMachine.addProduct(6, 2, 6, "Pineapple Juice: Cal 133");
            priceItems.addPrices(6, 2, 6, 6.35);

            //end of pineapple juice

            vendingMachine.addProduct(0, 3, 0, "Pomegranate Juice: Cal 133");
            priceItems.addPrices(0, 3, 0, 9.35);

            vendingMachine.addProduct(0, 3, 1, "Pomegranate Juice: Cal 133");
            priceItems.addPrices(0, 3, 1, 9.35);

            vendingMachine.addProduct(0, 3, 2, "Pomegranate Juice: Cal 133");
            priceItems.addPrices(0, 3, 2, 9.35);

            vendingMachine.addProduct(0, 3, 3, "Pomegranate Juice: Cal 133");
            priceItems.addPrices(0, 3, 3, 9.35);

            vendingMachine.addProduct(0, 3, 4, "Pomegranate Juice: Cal 133");
            priceItems.addPrices(0, 3, 4, 9.35);

            vendingMachine.addProduct(0, 3, 5, "Pomegranate Juice: Cal 133");
            priceItems.addPrices(0, 3, 5, 9.35);

            vendingMachine.addProduct(0, 3, 6, "Pomegranate Juice: Cal 133");
            priceItems.addPrices(0, 3, 6, 9.35);

            //end of pomegranate juice

            vendingMachine.addProduct(1, 3, 0, "Banana Shake: Cal 133");
            priceItems.addPrices(1, 3, 0, 4.35);

            vendingMachine.addProduct(1, 3, 1, "Banana Shake: Cal 133");
            priceItems.addPrices(1, 3, 1, 4.35);

            vendingMachine.addProduct(1, 3, 2, "Banana Shake: Cal 133");
            priceItems.addPrices(1, 3, 2, 4.35);

            vendingMachine.addProduct(1, 3, 3, "Banana Shake: Cal 133");
            priceItems.addPrices(1, 3, 3, 4.35);

            vendingMachine.addProduct(1, 3, 4, "Banana Shake: Cal 133");
            priceItems.addPrices(1, 3, 4, 4.35);

            vendingMachine.addProduct(1, 3, 5, "Banana Shake: Cal 133");
            priceItems.addPrices(1, 3, 5, 4.35);

            vendingMachine.addProduct(1, 3, 6, "Banana Shake: Cal 133");
            priceItems.addPrices(1, 3, 6, 4.35);

            //end of banana shake

            vendingMachine.addProduct(2, 3, 0, "pretzels: Cal 109");
            priceItems.addPrices(2, 3, 0, 2.35);

            vendingMachine.addProduct(2, 3, 1, "pretzels: Cal 109");
            priceItems.addPrices(2, 3, 1, 2.35);

            vendingMachine.addProduct(2, 3, 2, "pretzels: Cal 109");
            priceItems.addPrices(2, 3, 2, 2.35);

            vendingMachine.addProduct(2, 3, 3, "pretzels: Cal 109");
            priceItems.addPrices(2, 3, 3, 2.35);

            vendingMachine.addProduct(2, 3, 4, "pretzels: Cal 109");
            priceItems.addPrices(2, 3, 4, 2.35);

            vendingMachine.addProduct(2, 3, 5, "pretzels: Cal 109");
            priceItems.addPrices(2, 3, 5, 2.35);

            vendingMachine.addProduct(2, 3, 6, "pretzels: Cal 109");
            priceItems.addPrices(2, 3, 6, 2.35);

            //end of pretzels

            vendingMachine.addProduct(3, 3, 0, "lollipop: Cal 60");
            priceItems.addPrices(3, 3, 0, 0.35);

            vendingMachine.addProduct(3, 3, 1, "lollipop: Cal 60");
            priceItems.addPrices(3, 3, 1, 0.35);

            vendingMachine.addProduct(3, 3, 2, "lollipop: Cal 60");
            priceItems.addPrices(3, 3, 2, 0.35);

            vendingMachine.addProduct(3, 3, 3, "lollipop: Cal 60");
            priceItems.addPrices(3, 3, 3, 0.35);

            vendingMachine.addProduct(3, 3, 4, "lollipop: Cal 60");
            priceItems.addPrices(3, 3, 4, 0.35);

            vendingMachine.addProduct(3, 3, 5, "lollipop: Cal 60");
            priceItems.addPrices(3, 3, 5, 0.35);

            vendingMachine.addProduct(3, 3, 6, "lollipop: Cal 60");
            priceItems.addPrices(3, 3, 6, 0.35);

            //end of lollipop

            vendingMachine.addProduct(4, 3, 0, "jolly rancher: Cal 30");
            priceItems.addPrices(4, 3, 0, 0.75);

            vendingMachine.addProduct(4, 3, 1, "jolly rancher: Cal 30");
            priceItems.addPrices(4, 3, 1, 0.75);

            vendingMachine.addProduct(4, 3, 2, "jolly rancher: Cal 30");
            priceItems.addPrices(4, 3, 2, 0.75);

            vendingMachine.addProduct(4, 3, 3, "jolly rancher: Cal 30");
            priceItems.addPrices(4, 3, 3, 0.75);

            vendingMachine.addProduct(4, 3, 4, "jolly rancher: Cal 30");
            priceItems.addPrices(4, 3, 4, 0.75);

            vendingMachine.addProduct(4, 3, 5, "jolly rancher: Cal 30");
            priceItems.addPrices(4, 3, 5, 0.75);

            vendingMachine.addProduct(4, 3, 6, "jolly rancher: Cal 30");
            priceItems.addPrices(4, 3, 6, 0.75);

            // end of jolly rancher

            vendingMachine.addProduct(5, 3, 0, "Hershey Kiss: Cal 30");
            priceItems.addPrices(5, 3, 0, 0.25);

            vendingMachine.addProduct(5, 3, 1, "Hershey Kiss: Cal 30");
            priceItems.addPrices(5, 3, 1, 0.25);

            vendingMachine.addProduct(5, 3, 2, "Hershey Kiss: Cal 30");
            priceItems.addPrices(5, 3, 2, 0.25);

            vendingMachine.addProduct(5, 3, 3, "Hershey Kiss: Cal 30");
            priceItems.addPrices(5, 3, 3, 0.25);

            vendingMachine.addProduct(5, 3, 4, "Hershey Kiss: Cal 30");
            priceItems.addPrices(5, 3, 4, 0.25);

            vendingMachine.addProduct(5, 3, 5, "Hershey Kiss: Cal 30");
            priceItems.addPrices(5, 3, 5, 0.25);

            vendingMachine.addProduct(5, 3, 6, "Hershey Kiss: Cal 30");
            priceItems.addPrices(5, 3, 6, 0.25);

            //end of Hershey kiss

            vendingMachine.addProduct(6, 3, 0, "Deer Park Water Bottle: Cal 0");
            priceItems.addPrices(6, 3, 0, 4.25);

            vendingMachine.addProduct(6, 3, 1, "Deer Park Water Bottle: Cal 0");
            priceItems.addPrices(6, 3, 1, 4.25);

            vendingMachine.addProduct(6, 3, 2, "Deer Park Water Bottle: Cal 0");
            priceItems.addPrices(6, 3, 2, 4.25);

            vendingMachine.addProduct(6, 3, 3, "Deer Park Water Bottle: Cal 0");
            priceItems.addPrices(6, 3, 3, 4.25);

            vendingMachine.addProduct(6, 3, 4, "Deer Park Water Bottle: Cal 0");
            priceItems.addPrices(6, 3, 4, 4.25);

            vendingMachine.addProduct(6, 3, 5, "Deer Park Water Bottle: Cal 0");
            priceItems.addPrices(6, 3, 5, 4.25);

            vendingMachine.addProduct(6, 3, 6, "Deer Park Water Bottle: Cal 0");
            priceItems.addPrices(6, 3, 6, 4.25);

            //end of deer park water bottle

            vendingMachine.addProduct(0, 4, 0, "Dasani Water Bottle: Cal 0");
            priceItems.addPrices(0, 4, 0, 4.25);

            vendingMachine.addProduct(0, 4, 1, "Dasani Water Bottle: Cal 0");
            priceItems.addPrices(0, 4, 1, 4.25);

            vendingMachine.addProduct(0, 4, 2, "Dasani Water Bottle: Cal 0");
            priceItems.addPrices(0, 4, 2, 4.25);

            vendingMachine.addProduct(0, 4, 3, "Dasani Water Bottle: Cal 0");
            priceItems.addPrices(0, 4, 3, 4.25);

            vendingMachine.addProduct(0, 4, 4, "Dasani Water Bottle: Cal 0");
            priceItems.addPrices(0, 4, 4, 4.25);

            vendingMachine.addProduct(0, 4, 5, "Dasani Water Bottle: Cal 0");
            priceItems.addPrices(0, 4, 5, 4.25);

            vendingMachine.addProduct(0, 4, 6, "Dasani Water Bottle: Cal 0");
            priceItems.addPrices(0, 4, 6, 4.25);

            //end of dasani water bottle

            vendingMachine.addProduct(1, 4, 0, "Aquafina Water Bottle: Cal 0");
            priceItems.addPrices(1, 4, 0, 4.25);

            vendingMachine.addProduct(1, 4, 1, "Aquafina Water Bottle: Cal 0");
            priceItems.addPrices(1, 4, 1, 4.25);

            vendingMachine.addProduct(1, 4, 2, "Aquafina Water Bottle: Cal 0");
            priceItems.addPrices(1, 4, 2, 4.25);

            vendingMachine.addProduct(1, 4, 3, "Aquafina Water Bottle: Cal 0");
            priceItems.addPrices(1, 4, 3, 4.25);

            vendingMachine.addProduct(1, 4, 4, "Aquafina Water Bottle: Cal 0");
            priceItems.addPrices(1, 4, 4, 4.25);

            vendingMachine.addProduct(1, 4, 5, "Aquafina Water Bottle: Cal 0");
            priceItems.addPrices(1, 4, 5, 4.25);

            vendingMachine.addProduct(1, 4, 6, "Aquafina Water Bottle: Cal 0");
            priceItems.addPrices(1, 4, 6, 4.25);

            //end of Aquafina water bottle

            vendingMachine.addProduct(2, 4, 0, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(2, 4, 0, 7.25);

            vendingMachine.addProduct(2, 4, 1, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(2, 4, 1, 7.25);

            vendingMachine.addProduct(2, 4, 2, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(2, 4, 2, 7.25);

            vendingMachine.addProduct(2, 4, 3, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(2, 4, 3, 7.25);

            vendingMachine.addProduct(2, 4, 4, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(2, 4, 4, 7.25);

            vendingMachine.addProduct(2, 4, 5, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(2, 4, 5, 7.25);

            vendingMachine.addProduct(2, 4, 6, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(2, 4, 6, 7.25);

            //end of Evian water bottle

            vendingMachine.addProduct(3, 4, 0, "Fiji Water Bottle: Cal 0");
            priceItems.addPrices(3, 4, 0, 8.25);

            vendingMachine.addProduct(3, 4, 1, "Fiji Water Bottle: Cal 0");
            priceItems.addPrices(3, 4, 1, 8.25);

            vendingMachine.addProduct(3, 4, 2, "Fiji Water Bottle: Cal 0");
            priceItems.addPrices(3, 4, 2, 8.25);

            vendingMachine.addProduct(3, 4, 3, "Fiji Water Bottle: Cal 0");
            priceItems.addPrices(3, 4, 3, 8.25);

            vendingMachine.addProduct(3, 4, 4, "Fiji Water Bottle: Cal 0");
            priceItems.addPrices(3, 4, 4, 8.25);

            vendingMachine.addProduct(3, 4, 5, "Fiji Water Bottle: Cal 0");
            priceItems.addPrices(3, 4, 5, 8.25);

            vendingMachine.addProduct(3, 4, 6, "Fiji Water Bottle: Cal 0");
            priceItems.addPrices(3, 4, 6, 8.25);

            //end of Fiji water bottle

            vendingMachine.addProduct(4, 4, 0, "Essentia Water Bottle: Cal 0");
            priceItems.addPrices(4, 4, 0, 8.25);

            vendingMachine.addProduct(4, 4, 1, "Essentia Water Bottle: Cal 0");
            priceItems.addPrices(4, 4, 1, 8.25);

            vendingMachine.addProduct(4, 4, 2, "Essentia Water Bottle: Cal 0");
            priceItems.addPrices(4, 4, 2, 8.25);

            vendingMachine.addProduct(4, 4, 3, "Essentia Water Bottle: Cal 0");
            priceItems.addPrices(4, 4, 3, 8.25);

            vendingMachine.addProduct(4, 4, 4, "Essentia Water Bottle: Cal 0");
            priceItems.addPrices(4, 4, 4, 8.25);

            vendingMachine.addProduct(4, 4, 5, "Essentia Water Bottle: Cal 0");
            priceItems.addPrices(4, 4, 5, 8.25);

            vendingMachine.addProduct(4, 4, 6, "Essentia Water Bottle: Cal 0");
            priceItems.addPrices(4, 4, 6, 8.25);

            //end of Essetia water bottle

            vendingMachine.addProduct(5, 4, 0, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(5, 4, 0, 6.25);

            vendingMachine.addProduct(5, 4, 1, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(5, 4, 1, 6.25);

            vendingMachine.addProduct(5, 4, 2, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(5, 4, 2, 6.25);

            vendingMachine.addProduct(5, 4, 3, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(5, 4, 3, 6.25);

            vendingMachine.addProduct(5, 4, 4, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(5, 4, 4, 6.25);

            vendingMachine.addProduct(5, 4, 5, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(5, 4, 5, 6.25);

            vendingMachine.addProduct(5, 4, 6, "Evian Water Bottle: Cal 0");
            priceItems.addPrices(5, 4, 6, 6.25);

            //end of Evian water bottle

            vendingMachine.addProduct(6, 4, 0, "Arrowhead Water Bottle: Cal 0");
            priceItems.addPrices(6, 4, 0, 3.25);

            vendingMachine.addProduct(6, 4, 1, "Arrowhead Water Bottle: Cal 0");
            priceItems.addPrices(6, 4, 1, 3.25);

            vendingMachine.addProduct(6, 4, 2, "Arrowhead Water Bottle: Cal 0");
            priceItems.addPrices(6, 4, 2, 3.25);

            vendingMachine.addProduct(6, 4, 3, "Arrowhead Water Bottle: Cal 0");
            priceItems.addPrices(6, 4, 3, 3.25);

            vendingMachine.addProduct(6, 4, 4, "Arrowhead Water Bottle: Cal 0");
            priceItems.addPrices(6, 4, 4, 3.25);

            vendingMachine.addProduct(6, 4, 5, "Arrowhead Water Bottle: Cal 0");
            priceItems.addPrices(6, 4, 5, 3.25);

            vendingMachine.addProduct(6, 4, 6, "Arrowhead Water Bottle: Cal 0");
            priceItems.addPrices(6, 4, 6, 3.25);

            //end of Arrowhead water bottle

            vendingMachine.addProduct(1, 5, 0, "Sprite: Cal 140");
            priceItems.addPrices(1, 5, 0, 4.25);

            vendingMachine.addProduct(1, 5, 1, "Sprite: Cal 140");
            priceItems.addPrices(1, 5, 1, 4.25);

            vendingMachine.addProduct(1, 5, 2, "Sprite: Cal 140");
            priceItems.addPrices(1, 5, 2, 4.25);

            vendingMachine.addProduct(1, 5, 3, "Sprite: Cal 140");
            priceItems.addPrices(1, 5, 3, 4.25);

            vendingMachine.addProduct(1, 5, 4, "Sprite: Cal 140");
            priceItems.addPrices(1, 5, 4, 4.25);

            vendingMachine.addProduct(1, 5, 5, "Sprite: Cal 140");
            priceItems.addPrices(1, 5, 5, 4.25);

            vendingMachine.addProduct(1, 5, 6, "Sprite: Cal 140");
            priceItems.addPrices(1, 5, 6, 4.25);

            //end of sprite

            vendingMachine.addProduct(2, 5, 0, "Dr. Pepper: Cal 150");
            priceItems.addPrices(2, 5, 0, 4.25);

            vendingMachine.addProduct(2, 5, 1, "Dr. Pepper: Cal 150");
            priceItems.addPrices(2, 5, 1, 4.25);

            vendingMachine.addProduct(2, 5, 2, "Dr. Pepper: Cal 150");
            priceItems.addPrices(2, 5, 2, 4.25);

            vendingMachine.addProduct(2, 5, 3, "Dr. Pepper: Cal 150");
            priceItems.addPrices(2, 5, 3, 4.25);

            vendingMachine.addProduct(2, 5, 4, "Dr. Pepper: Cal 150");
            priceItems.addPrices(2, 5, 4, 4.25);

            vendingMachine.addProduct(2, 5, 5, "Dr. Pepper: Cal 150");
            priceItems.addPrices(2, 5, 5, 4.25);

            vendingMachine.addProduct(2, 5, 6, "Dr. Pepper: Cal 150");
            priceItems.addPrices(2, 5, 6, 4.25);

            //end of dr. pepper

            vendingMachine.addProduct(3, 5, 0, "Coke: Cal 140");
            priceItems.addPrices(3, 5, 0, 4.25);

            vendingMachine.addProduct(3, 5, 1, "Coke: Cal 140");
            priceItems.addPrices(3, 5, 1, 4.25);

            vendingMachine.addProduct(3, 5, 2, "Coke: Cal 140");
            priceItems.addPrices(3, 5, 2, 4.25);

            vendingMachine.addProduct(3, 5, 3, "Coke: Cal 140");
            priceItems.addPrices(3, 5, 3, 4.25);

            vendingMachine.addProduct(3, 5, 4, "Coke: Cal 140");
            priceItems.addPrices(3, 5, 4, 4.25);

            vendingMachine.addProduct(3, 5, 5, "Coke: Cal 140");
            priceItems.addPrices(3, 5, 5, 4.25);

            vendingMachine.addProduct(3, 5, 6, "Coke: Cal 140");
            priceItems.addPrices(3, 5, 6, 4.25);

            //end of coke

            vendingMachine.addProduct(4, 5, 0, "Pepsi: Cal 140");
            priceItems.addPrices(4, 5, 0, 4.25);

            vendingMachine.addProduct(4, 5, 1, "Pepsi: Cal 140");
            priceItems.addPrices(4, 5, 1, 4.25);

            vendingMachine.addProduct(4, 5, 2, "Pepsi: Cal 140");
            priceItems.addPrices(4, 5, 2, 4.25);

            vendingMachine.addProduct(4, 5, 3, "Pepsi: Cal 140");
            priceItems.addPrices(4, 5, 3, 4.25);

            vendingMachine.addProduct(4, 5, 4, "Pepsi: Cal 140");
            priceItems.addPrices(4, 5, 4, 4.25);

            vendingMachine.addProduct(4, 5, 5, "Pepsi: Cal 140");
            priceItems.addPrices(4, 5, 5, 4.25);

            vendingMachine.addProduct(4, 5, 6, "Pepsi: Cal 140");
            priceItems.addPrices(4, 5, 6, 4.25);

            //end of Pepsi

            vendingMachine.addProduct(5, 5, 0, "Mountain Dew: Cal 110");
            priceItems.addPrices(5, 5, 0, 5.25);

            vendingMachine.addProduct(5, 5, 1, "Mountain Dew: Cal 110");
            priceItems.addPrices(5, 5, 1, 5.25);

            vendingMachine.addProduct(5, 5, 2, "Mountain Dew: Cal 110");
            priceItems.addPrices(5, 5, 2, 5.25);

            vendingMachine.addProduct(5, 5, 3, "Mountain Dew: Cal 110");
            priceItems.addPrices(5, 5, 3, 5.25);

            vendingMachine.addProduct(5, 5, 4, "Mountain Dew: Cal 110");
            priceItems.addPrices(5, 5, 4, 5.25);

            vendingMachine.addProduct(5, 5, 5, "Mountain Dew: Cal 110");
            priceItems.addPrices(5, 5, 5, 5.25);

            vendingMachine.addProduct(5, 5, 6, "Mountain Dew: Cal 110");
            priceItems.addPrices(5, 5, 6, 5.25);

            //end of Mountain Dew

            vendingMachine.addProduct(6, 5, 0, "Root Beer: Cal 145");
            priceItems.addPrices(6, 5, 0, 4.25);

            vendingMachine.addProduct(6, 5, 1, "Root Beer: Cal 145");
            priceItems.addPrices(6, 5, 1, 4.25);

            vendingMachine.addProduct(6, 5, 2, "Root Beer: Cal 145");
            priceItems.addPrices(6, 5, 2, 4.25);

            vendingMachine.addProduct(6, 5, 3, "Root Beer: Cal 145");
            priceItems.addPrices(6, 5, 3, 4.25);

            vendingMachine.addProduct(6, 5, 4, "Root Beer: Cal 145");
            priceItems.addPrices(6, 5, 4, 4.25);

            vendingMachine.addProduct(6, 5, 5, "Root Beer: Cal 145");
            priceItems.addPrices(6, 5, 5, 4.25);

            vendingMachine.addProduct(6, 5, 6, "Root Beer: Cal 145");
            priceItems.addPrices(6, 5, 6, 4.25);

            //end of root beer

            vendingMachine.addProduct(0, 6, 0, "Diet Coke: Cal 0");
            priceItems.addPrices(0, 6, 0, 4.25);

            vendingMachine.addProduct(0, 6, 1, "Diet Coke: Cal 0");
            priceItems.addPrices(0, 6, 1, 4.25);

            vendingMachine.addProduct(0, 6, 2, "Diet Coke: Cal 0");
            priceItems.addPrices(0, 6, 2, 4.25);

            vendingMachine.addProduct(0, 6, 3, "Diet Coke: Cal 0");
            priceItems.addPrices(0, 6, 3, 4.25);

            vendingMachine.addProduct(0, 6, 4, "Diet Coke: Cal 0");
            priceItems.addPrices(0, 6, 4, 4.25);

            vendingMachine.addProduct(0, 6, 5, "Diet Coke: Cal 0");
            priceItems.addPrices(0, 6, 5, 4.25);

            vendingMachine.addProduct(0, 6, 6, "Diet Coke: Cal 0");
            priceItems.addPrices(0, 6, 6, 4.25);

            //end of diet coke

            vendingMachine.addProduct(1, 6, 0, "7 Up: Cal 150");
            priceItems.addPrices(1, 6, 0, 4.25);

            vendingMachine.addProduct(1, 6, 1, "7 Up: Cal 150");
            priceItems.addPrices(1, 6, 1, 4.25);

            vendingMachine.addProduct(1, 6, 2, "7 Up: Cal 150");
            priceItems.addPrices(1, 6, 2, 4.25);

            vendingMachine.addProduct(1, 6, 3, "7 Up: Cal 150");
            priceItems.addPrices(1, 6, 3, 4.25);

            vendingMachine.addProduct(1, 6, 4, "7 Up: Cal 150");
            priceItems.addPrices(1, 6, 4, 4.25);

            vendingMachine.addProduct(1, 6, 5, "7 Up: Cal 150");
            priceItems.addPrices(1, 6, 5, 4.25);

            vendingMachine.addProduct(1, 6, 6, "7 Up: Cal 150");
            priceItems.addPrices(1, 6, 6, 4.25);

            //end of 7 Up

            vendingMachine.addProduct(2, 6, 0, "Fanta: Cal 112");
            priceItems.addPrices(2, 6, 0, 4.25);

            vendingMachine.addProduct(2, 6, 1, "Fanta: Cal 112");
            priceItems.addPrices(2, 6, 1, 4.25);

            vendingMachine.addProduct(2, 6, 2, "Fanta: Cal 112");
            priceItems.addPrices(2, 6, 2, 4.25);

            vendingMachine.addProduct(2, 6, 3, "Fanta: Cal 112");
            priceItems.addPrices(2, 6, 3, 4.25);

            vendingMachine.addProduct(2, 6, 4, "Fanta: Cal 112");
            priceItems.addPrices(2, 6, 4, 4.25);

            vendingMachine.addProduct(2, 6, 5, "Fanta: Cal 112");
            priceItems.addPrices(2, 6, 5, 4.25);

            vendingMachine.addProduct(2, 6, 6, "Fanta: Cal 112");
            priceItems.addPrices(2, 6, 6, 4.25);

            //end of Fanta

            vendingMachine.addProduct(3, 6, 0, "Crush: Cal 160");
            priceItems.addPrices(3, 6, 0, 5.25);

            vendingMachine.addProduct(3, 6, 1, "Crush: Cal 160");
            priceItems.addPrices(3, 6, 1, 5.25);


            vendingMachine.addProduct(3, 6, 2, "Crush: Cal 160");
            priceItems.addPrices(3, 6, 2, 5.25);


            vendingMachine.addProduct(3, 6, 3, "Crush: Cal 160");
            priceItems.addPrices(3, 6, 3, 5.25);


            vendingMachine.addProduct(3, 6, 4, "Crush: Cal 160");
            priceItems.addPrices(3, 6, 4, 5.25);


            vendingMachine.addProduct(3, 6, 5, "Crush: Cal 160");
            priceItems.addPrices(3, 6, 5, 5.25);


            vendingMachine.addProduct(3, 6, 6, "Crush: Cal 160");
            priceItems.addPrices(3, 6, 6, 5.25);

            //end of Crush

            vendingMachine.addProduct(4, 6, 0, "Ginger Ale: Cal 138");
            priceItems.addPrices(4, 6, 0, 5.25);

            vendingMachine.addProduct(4, 6, 1, "Ginger Ale: Cal 138");
            priceItems.addPrices(4, 6, 1, 5.25);

            vendingMachine.addProduct(4, 6, 2, "Ginger Ale: Cal 138");
            priceItems.addPrices(4, 6, 2, 5.25);

            vendingMachine.addProduct(4, 6, 3, "Ginger Ale: Cal 138");
            priceItems.addPrices(4, 6, 3, 5.25);

            vendingMachine.addProduct(4, 6, 4, "Ginger Ale: Cal 138");
            priceItems.addPrices(4, 6, 4, 5.25);

            vendingMachine.addProduct(4, 6, 5, "Ginger Ale: Cal 138");
            priceItems.addPrices(4, 6, 5, 5.25);

            vendingMachine.addProduct(4, 6, 6, "Ginger Ale: Cal 138");
            priceItems.addPrices(4, 6, 6, 5.25);

            //end of ginger ale

            vendingMachine.addProduct(5, 6, 0, "Diet Pepsi: Cal 5");
            priceItems.addPrices(5, 6, 0, 5.25);

            vendingMachine.addProduct(5, 6, 1, "Diet Pepsi: Cal 5");
            priceItems.addPrices(5, 6, 1, 5.25);

            vendingMachine.addProduct(5, 6, 2, "Diet Pepsi: Cal 5");
            priceItems.addPrices(5, 6, 2, 5.25);

            vendingMachine.addProduct(5, 6, 3, "Diet Pepsi: Cal 5");
            priceItems.addPrices(5, 6, 3, 5.25);

            vendingMachine.addProduct(5, 6, 4, "Diet Pepsi: Cal 5");
            priceItems.addPrices(5, 6, 4, 5.25);

            vendingMachine.addProduct(5, 6, 5, "Diet Pepsi: Cal 5");
            priceItems.addPrices(5, 6, 5, 5.25);

            vendingMachine.addProduct(5, 6, 6, "Diet Pepsi: Cal 5");
            priceItems.addPrices(5, 6, 6, 5.25);

            //end of Diet Pepsi

            vendingMachine.addProduct(6, 6, 0, "Sierra Mist: Cal 220");
            priceItems.addPrices(6, 6, 0, 5.25);

            vendingMachine.addProduct(6, 6, 1, "Sierra Mist: Cal 220");
            priceItems.addPrices(6, 6, 1, 5.25);

            vendingMachine.addProduct(6, 6, 2, "Sierra Mist: Cal 220");
            priceItems.addPrices(6, 6, 2, 5.25);

            vendingMachine.addProduct(6, 6, 3, "Sierra Mist: Cal 220");
            priceItems.addPrices(6, 6, 3, 5.25);

            vendingMachine.addProduct(6, 6, 4, "Sierra Mist: Cal 220");
            priceItems.addPrices(6, 6, 4, 5.25);

            vendingMachine.addProduct(6, 6, 5, "Sierra Mist: Cal 220");
            priceItems.addPrices(6, 6, 5, 5.25);

            vendingMachine.addProduct(6, 6, 6, "Sierra Mist: Cal 220");
            priceItems.addPrices(6, 6, 6, 5.25);

            //end of sierra mist
        }
        vendingMachine.display();
        priceItems.display();


        System.out.println();

        double totalAmount = 0.0;

        while (true) {
            System.out.println();
            System.out.println("Please select from rows(0-5)");
            System.out.println("Select your desired row according to the table or press 777 to exit:");
            int rowDesired = scanner.nextInt();
            if (rowDesired == 777) {
                break;
            }
            while (rowDesired < 0 || rowDesired > 5) {
                System.out.println("Item location does not exist!");
                System.out.println("Please select your desired row according to the table or press 777 to exit:");
                rowDesired = scanner.nextInt();
            }
            System.out.println("Please select from columns (0-5)");
            System.out.println("Select your desired column according to the table or press 777 to exit:");
            int columnDesired = scanner.nextInt();
            while (columnDesired < 0 || columnDesired > 5) {
                System.out.println("Item location does not exist!");
                System.out.println("Please select your desired column according to the table or press 777 to exit:");
                columnDesired = scanner.nextInt();
            }

            System.out.println();
            System.out.println("Please select from depth (0-5)");
            System.out.println("Select your desired depth according to the table or press 777 to exit:");
            int depthDesired = scanner.nextInt();
            while (depthDesired < 0 || depthDesired > 5) {
                System.out.println("Item location does not exist!");
                System.out.println("Please select your desired depth according to the table or press 777 to exit:");
                depthDesired = scanner.nextInt();
            }
            System.out.println("\n Getting products from the vending machine: ");
            System.out.println("1. " + vendingMachine.getProduct(rowDesired, columnDesired, depthDesired));
            System.out.println("1. " + priceItems.getPrices(rowDesired, columnDesired, depthDesired));

            String productDesire = vendingMachine.getProduct(rowDesired, columnDesired, depthDesired);
            double productPrice = priceItems.getPrices(rowDesired, columnDesired, depthDesired);


            System.out.print("Insert coins (e.g., 1.00 for $1.00): $");
            double payment = scanner.nextDouble();  // Accept user input Double type

            while (payment < productPrice) {
                System.out.println("Insufficient payment. Please insert more coins.");
                payment = scanner.nextDouble();


                // Dispense item
                System.out.println("Dispensing " + productDesire);
                totalAmount += productPrice;
                double change = payment - productPrice;  // Change value to return to the user
                if (change > 0) {
                    System.out.println("Change: $" + change);


                    // Display the total amount earned
                    System.out.println("Thank you for using the Vending Machine!");
                    System.out.println("Total amount earned: $" + totalAmount);

                    // Always close input, open connections to files, database,& networking
                    scanner.close();


                    System.out.println("\n Updated Vending Machine Contents: ");
                    vendingMachine.display();


                }
            }
        }
    }}

















