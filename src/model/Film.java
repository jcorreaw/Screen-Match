package model;

public class Film {
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double sumOfRatings;
    private int totalRatings;
    private int durationInMinutes;

    public Film() {
    }

    public Film(String name, int releaseYear, boolean includedInThePlan, double sumOfRatings, int totalRatings, int durationInMinutes) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.includedInThePlan = includedInThePlan;
        this.sumOfRatings = sumOfRatings;
        this.totalRatings = totalRatings;
        this.durationInMinutes = durationInMinutes;
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

}
