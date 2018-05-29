package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoodTracker {
    private String mUserName;
    private List<Mood> mMoods;
    private Map<Integer, String> mMenu;
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
        mMoods = new ArrayList<>(mMoods);
        mReader = new BufferedReader(new InputStreamReader(System.in));
        mMenu = new HashMap<>();
        mMenu.put(1, "Create a new mood entry");
        mMenu.put(2, "View all entries");
        mMenu.put(3, "Exit the program");
    }
}
