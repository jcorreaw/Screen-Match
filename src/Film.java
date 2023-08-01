public class Film {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    double sumOfRatings;
    int totalRatings;
    int durationInMinutes;

    void displayTechnicalSheet() {
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    void evaluate(double note) {
        sumOfRatings += note;
        totalRatings++;
    }

    double averageRating(){
        return sumOfRatings / totalRatings;
    }

}
