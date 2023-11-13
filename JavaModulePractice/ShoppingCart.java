package JavaModulePractice;


import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prash
 */
public class ShoppingCart {
    private Map<String, Integer> items; // Map of item name to quantity

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        if (this.items.containsKey(itemName)) {
            quantity += this.items.get(itemName); // If item already exists in cart, add to its quantity
        }
        this.items.put(itemName, quantity);
    }

    public void removeItem(String itemName, int quantity) {
        if (this.items.containsKey(itemName)) {
            int currentQuantity = this.items.get(itemName);
            if (currentQuantity <= quantity) {
                this.items.remove(itemName); // If quantity to remove is greater than or equal to current quantity, remove the item from the cart
            } else {
                this.items.put(itemName, currentQuantity - quantity); // Otherwise, subtract the quantity from the item's current quantity
            }
        }
    }

    public void clearCart() {
        this.items.clear(); // Remove all items from the cart
    }

    public Map<String, Integer> getItems() {
        return this.items;
    }
}
