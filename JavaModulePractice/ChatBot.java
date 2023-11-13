/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("bye")) {
            System.out.print("You: ");
            input = scanner.nextLine();

            String output = getResponse(input);
            System.out.println("Bot: " + output);
        }
    }

    public static String getResponse(String input) {
        if (input.contains("hi") || input.contains("hello")) {
            return "Hello! How can I help you today?";
        } else if (input.contains("how are you")) {
            return "I'm doing well, thanks for asking!";
        } else if (input.contains("what time is it")) {
            return "It is currently " + java.time.LocalTime.now();
        } else if (input.contains("bye")) {
            return "Goodbye! Have a great day.";
        } else {
            return "I'm sorry, I didn't understand your question.";
        }
    }
}