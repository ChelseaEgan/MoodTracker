package com.company;

import java.util.Date;

public class Mood {
    private String mMoodName;
    private Date mDateOfMood;
    private String mNotes;

    // Constructor
    public Mood(String moodName, Date dateOfMood, String notes) {
        mMoodName = moodName;
        mDateOfMood = dateOfMood;
        mNotes = notes;
    }

    // Getters
    public String getMoodName() {
        return mMoodName;
    }
    public Date getDateOfMood() {
        return mDateOfMood;
    }
    public String getNotes() {
        return mNotes;
    }
}
