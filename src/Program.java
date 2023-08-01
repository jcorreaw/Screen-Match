public class Program {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "O poderoso chefão";
        myFilm.releaseYear = 1970;
        myFilm.durationInMinutes = 180;

        myFilm.displayTechnicalSheet();
        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);

        System.out.println(myFilm.sumOfRatings);
        System.out.println(myFilm.totalRatings);
        System.out.println(myFilm.averageRating());

    }
}