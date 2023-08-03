package application;

import model.Film;
import model.Series;
import model.Title;

import java.util.ArrayList;

public class ProgramLists {
    public static void main(String[] args) {
        Film myFilm = new Film("O poderoso chefão",1970);
        myFilm.evaluate(10);
        Film myFilm1 = new Film("Avatar", 2023);
        myFilm1.evaluate(7);
        var filmPaulo = new Film("Dogville", 2003);
        filmPaulo.evaluate(10);
        Series lost = new Series("Lost", 2000);

        ArrayList<Title> list = new ArrayList<>();
        list.add(filmPaulo);
        list.add(myFilm);
        list.add(myFilm1);
        list.add(lost);

        for (Title item : list) {
            System.out.println(item);
            if (item instanceof Film film && film.getSortable() > 2) {
                System.out.println("Classificação: " + film.getSortable());
            }
        }

    }
}
