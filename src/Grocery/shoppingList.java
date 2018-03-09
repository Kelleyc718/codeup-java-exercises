package Grocery;

import util.Input;
import java.util.*;

public class shoppingList {
    private static Input userInput = new Input();
    private static HashMap<Item, Integer> groceryList = currentGroceries();

    public static void main(String[] args) {
        System.out.println("Shopping List.");
        System.out.println("\nWould you like to create a new list?");
        choice();
        currentList(groceryList);
        System.out.println("\nHave a nice day");
    }
    public static void choice() {
        boolean userChoice;
        userChoice = userInput.yesNo();
        if (!userChoice) {
            System.out.println("No new items to add.");
        } else {
            do {
                System.out.println("\nWould you like to add a new item?");
                userChoice = userInput.yesNo();
                if (userChoice) {
                    groceryList = addItem();
                }
            } while (userChoice);
        }
    }

    public static HashMap<Item, Integer> currentGroceries() {
        Item oranges = new Item("orange", "fruit");
        Item apples = new Item("apple", "fruit");
        Item potatoes = new Item("potatoes", "vegetable");
        Item beer = new Item("beer", "junk");
        HashMap<Item, Integer> groceryList = new HashMap<>();
        groceryList.put(oranges, 5);
        groceryList.put(apples, 5);
        groceryList.put(potatoes, 5);
        groceryList.put(beer, 5);
        return groceryList;
    }
    
   public static HashMap<Item, Integer> addItem() {
       System.out.println("\nPlease enter the name of your item...");
       String newItemName = userInput.getString();

       System.out.println("\nPlease enter how many you want...");
       int newItemQuantity = userInput.getInt(1, 100);

       System.out.println("\nEnter the category of this item...");
       String newItemCategory = userInput.getString();

       Item newItem = new Item(newItemName, newItemCategory);
       groceryList.put(newItem, newItemQuantity);
       return groceryList;
   }

    public static void currentList(HashMap<Item, Integer> groceryList) {
        System.out.println("\nHere is your shopping list: ");
        System.out.printf("%-5s", "Item Name");
        System.out.printf("%-5s", " | ");
        System.out.printf("%-5s", "Quantity");
        System.out.printf("%-5s", " | ");
        System.out.printf("%-5s", "Category\n");
        for (Map.Entry<Item, Integer> shoppingList : groceryList.entrySet()) {
            System.out.printf("%-5s", shoppingList.getKey().getName());
            System.out.printf("%-5s", " | ");
            System.out.printf("%-5s", shoppingList.getValue());
            System.out.printf("%-5s", " | ");
            System.out.printf("%-5s", shoppingList.getKey().getCategory() + "\n");
        }
    }
}
