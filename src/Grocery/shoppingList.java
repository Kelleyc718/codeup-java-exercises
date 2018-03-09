package Grocery;

import util.Input;

import java.util.*;

public class shoppingList {
    private static Input userInput = new Input();
    private static HashMap<Item, Integer> groceryList = currentGroceries();

    public static void main(String[] args) {
        System.out.println("\nShopping List.");
        System.out.println("\nWould you like to create a new list?\n");
        choice();
        currentList(groceryList);
        System.out.println("Have a nice day");
    }
    public static void choice() {
        boolean userChoice;
        do {
            userChoice = userInput.yesNo();
            if (!userChoice) {
                break;
            } else {
                System.out.println("Would you like to add a new item?");
                userChoice = userInput.yesNo();
                if (userChoice) {
                    //addItem();
                }
            }
            System.out.println("Would you like to add another item?");
        } while (userChoice);
    }

    public static HashMap<Item, Integer> currentGroceries() {
        Item oranges = new Item("orange", 5);
        Item apples = new Item("apple", 5);
        Item potatoes = new Item("potatoes", 5);
        Item beer = new Item("beer", 5);
        HashMap<Item, Integer> groceryList = new HashMap<>();
        groceryList.put(oranges, 5);
        groceryList.put(apples, 5);
        groceryList.put(potatoes, 5);
        groceryList.put(beer, 5);
        return groceryList;
    }
    
   /** public static Object addItem() {
        System.out.println("Please enter the name of your item...");
        String newItemName = userInput.getString();

        System.out.println("Please enter how many you want...");
        int newItemQuantity = userInput.getInt(1, 100);

        Item newItem = new Item(newItemName, newItemQuantity);
        groceryList.put(newItemName, newItemQuantity);
        return groceryList;
    }*/

    public static void currentList(HashMap<Item, Integer> groceryList) {
        System.out.println("Here is your shopping list: ");
        for (Map.Entry<Item, Integer> shoppingList : groceryList.entrySet()) {
            System.out.print(shoppingList.getValue());
        }
    }
}
