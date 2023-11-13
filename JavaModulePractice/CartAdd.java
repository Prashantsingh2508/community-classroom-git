/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class CartAdd {
    public static void main(String args[]){
    
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addItem("Condom", 2);
        shoppingCart.addItem("Condom", 2);
        shoppingCart.addItem("Condom", 2);
        shoppingCart.addItem("paneer", 1);
        shoppingCart.addItem("Nirma", 1);
        shoppingCart.addItem("Lubricants", 1);
        shoppingCart.addItem("Milk", 1);
        System.out.println(shoppingCart.getItems());
//        shoppingCart.removeItem("Condom", 1);
//                System.out.println(shoppingCart.getItems());
//                shoppingCart.clearCart();
//                    System.out.println(shoppingCart.getItems());
    }
    
}
