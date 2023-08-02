package utils;

import model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Title title) {
        totalTime += title.getDurationInMinutes();
    }
}
