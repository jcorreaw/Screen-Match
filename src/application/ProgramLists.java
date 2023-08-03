package application;

import model.Film;
import model.Series;
import model.Title;

import java.util.*;

public class ProgramLists {
    public static void main(String[] args) {
        Film myFilm = new Film("O poderoso chefão",1970);
        myFilm.evaluate(10);
        Film myFilm1 = new Film("Avatar", 2023);
        myFilm1.evaluate(7);
        var filmPaulo = new Film("Dogville", 2003);
        filmPaulo.evaluate(10);
        Series lost = new Series("Lost", 2000);

        List<Title> list = new LinkedList<>();
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

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Adam Sandler");
        searchByArtist.add("Paulo");
        searchByArtist.add("Joao");
        System.out.println(searchByArtist);

        Collections.sort(searchByArtist);
        System.out.println("Depois de ordenar: ");
        System.out.println(searchByArtist);

        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Ordenando por ano: ");
        System.out.println(list);
    }
}
