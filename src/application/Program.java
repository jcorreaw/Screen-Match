package application;

import model.Episode;
import utils.RecommendationFilter;
import utils.TimeCalculator;
import model.Film;
import model.Series;

import java.util.ArrayList;

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

        Film myFilm1 = new Film();
        myFilm1.setName("Avatar");
        myFilm1.setReleaseYear(2023);
        myFilm1.setDurationInMinutes(200);

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(myFilm);
        timeCalculator.includes(myFilm1);
        timeCalculator.includes(lost);
        System.out.println(timeCalculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filters(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setTotalViews(300);
        filter.filters(episode);

        var filmPaulo = new Film();
        filmPaulo.setDurationInMinutes(200);
        filmPaulo.setName("Dogville");
        filmPaulo.setReleaseYear(2003);
        filmPaulo.evaluate(10);

        ArrayList<Film> listFilms = new ArrayList<>();

        listFilms.add(filmPaulo);
        listFilms.add(myFilm);
        listFilms.add(myFilm1);

        System.out.println("Tamanho da lista: " + listFilms.size());
        System.out.println("Primeiro filme: " + listFilms.get(0).getName());
        System.out.println(listFilms);
        System.out.println("toString do filme: " + listFilms.get(0).toString());

    }
}