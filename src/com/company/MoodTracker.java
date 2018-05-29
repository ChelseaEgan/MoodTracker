package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoodTracker {
    private String mUserName;
    private List<Mood> mMoods;
    private Map<String, String> mMenu;
    private BufferedReader mReader;
    private String [] mMoodsOptions = {
            "Manic",
            "Happy",
            "Average",
            "Stressed",
            "Anxious",
            "Depressed",
            "Angry"
    };

    // Constructor
    public MoodTracker() {
        mMoods = new ArrayList<>();
        mReader = new BufferedReader(new InputStreamReader(System.in));
        mMenu = new HashMap<>();
        mMenu.put("add", "Create a new mood entry");
        mMenu.put("view", "View all entries");
        mMenu.put("quit", "Exit the program");
    }

    // Menu - prompt for action
    public void run () {
        String choice = "";
        do {
            try {
                choice = promptAction();
                switch(choice) {
                    case "add":
                        // TODO: Add mood entry
                        break;
                    case "view":
                        // TODO: Display entries
                        break;
                    case "quit":
                        System.out.println("Thanks for using the mood tracker!");
                        break;
                    default:
                        System.out.printf("Unknown choice:  %s. Try again. %n%n%n",
                                choice);
                }
            } catch (IOException ioe) {
                System.out.println("Problem with input");
                ioe.printStackTrace();
            }
        } while (!choice.equals("quit"));
    }

    // Get menu choice
    private String promptAction() throws IOException {
        System.out.printf("Menu options: %n");
        for (Map.Entry<String, String> option : mMenu.entrySet()) {
            System.out.printf("%s - %s %n",
                    option.getKey(),
                    option.getValue());
        }
        System.out.print("Enter your choice:  ");
        String choice = mReader.readLine();
        return choice.trim().toLowerCase();
    }
}
