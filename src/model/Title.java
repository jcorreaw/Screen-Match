package model;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean includedInThePlan;
    private double sumOfRatings;
    private int totalRatings;
    private int durationInMinutes;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean getIsIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void displayTechnicalSheet() {
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void evaluate(double note) {
        sumOfRatings += note;
        totalRatings++;
    }

    public double averageRating(){
        return sumOfRatings / totalRatings;
    }

    @Override
    public int compareTo(Title title) {
        return this.getName().compareTo(title.getName());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
