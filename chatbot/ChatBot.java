package chatbot;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I am ChatBot.");
        System.out.println("You can type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("bye")) {
                System.out.println("ChatBot: Goodbye! Have a great day.");
                break;
            }

            String response = getResponse(userInput);
            System.out.println("ChatBot: " + response);
        }

        scanner.close();
    }

    private static String getResponse(String input) {
        if (input.contains("hello") || input.contains("hi")) {
            return "Hi there! How can I help you?";
        } else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm doing fine!";
        } else if (input.contains("your name")) {
            return "I am ChatBot, your virtual assistant.";
        } else if (input.contains("help")) {
            return "You can ask me basic questions like 'how are you', 'your name', or say 'bye' to exit.";
        } else {
            return "Sorry, I don't understand that. Can you ask something else?";
        }
    }
}
