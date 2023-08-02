package application;

import model.Film;

public class Program {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("O poderoso chefão");
        myFilm.setReleaseYear(1970);
        myFilm.setReleaseYear(180);

        myFilm.displayTechnicalSheet();
        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);

        System.out.println("Total de avaliações: " + myFilm.getTotalRatings());
        System.out.println(myFilm.averageRating());

    }
}