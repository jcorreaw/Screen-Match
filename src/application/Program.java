package application;

import model.Film;
import model.Series;

public class Program {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("O poderoso chefão");
        myFilm.setReleaseYear(1970);
        myFilm.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myFilm.getDurationInMinutes());

        myFilm.displayTechnicalSheet();
        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);

        System.out.println("Total de avaliações: " + myFilm.getTotalRatings());
        System.out.println(myFilm.averageRating());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.displayTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);

        System.out.println("Duração para maratonar: " + lost.getDurationInMinutes());
    }
}