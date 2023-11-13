package javaprac;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author prash
 */
class Main {

    String name = "Prashant Singh";
    String add = "Redbridge";

    static String voice() {
        return "hello";
    }

    void Print() {
        //    super();
        System.out.println("Parent Class!");
    }

}

class Derived extends Main {

    void Print() {
        super.Print();
        System.out.println(super.name);
        System.out.println(super.add);

    }

    String name() {

        return "Rishi more";
    }

}

public class SuperClass {

    public static void main(String args[]) {
        Derived derived = new Derived();
        derived.Print();

    }

}
