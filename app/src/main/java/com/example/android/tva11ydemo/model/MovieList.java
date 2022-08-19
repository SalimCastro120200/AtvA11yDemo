package com.example.android.tva11ydemo.model;

import com.example.android.tva11ydemo.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MovieList provides a list of {@code Movie} with categories.
 */
public final class MovieList {

    private static final String MOVIE_CATEGORIES[] = {
        "Acción",
        "Ciencia Ficción",
        "Crímenes",
        "Terror",
        "Deportes"
    };

    private static final String TITLES_ACTION[] = {
        "Carter",
        "Misión Imposible",
        "Proyecto Adam",
        "Resident Evil 2",
        "Top Gun",
        "Que le pasó a Lunes?",
        "47 Ronin: La Leyenda Del Samurai",
        "Agente Salt",
        "El hombre Gris",
        "Geo-Tormenta",
        "Kate"
    };

    private static final int Imagenes_Action[] = {
            R.drawable.carter,
            R.drawable.misionimposible4,
            R.drawable.proyectoadam,
            R.drawable.residentevil2,
            R.drawable.topgun,
            R.drawable.quelepasoalunes,
            R.drawable.a47roninlaleyendadelsamurai,
            R.drawable.agentesalt,
            R.drawable.elhombregris,
            R.drawable.geotormenta,
            R.drawable.kate,
    };

    private static final String TITLES_FICTION[] = {
            "Al Filo del Mañana",
            "Chappie",
            "Pixeles",
            "Spider Man",
            "Titanes",
            "Transformers",
            "Efecto Mariposa",
            "El Precio del Mañana",
            "La Tierra Errante",
            "Spectral"
    };

    private static final int Imagenes_Fiction[] = {
            R.drawable.alfilodelamanana,
            R.drawable.chappie,
            R.drawable.pixeles,
            R.drawable.spiderman,
            R.drawable.titanes,
            R.drawable.transformers,
            R.drawable.elefectomariposa,
            R.drawable.elpreciodelmanana,
            R.drawable.latierraerrante,
            R.drawable.spectral,
    };

    private static final String TITLES_CRIMES[] = {
            "Asalto a la Casa Moneda",
            "Clean",
            "Los ilucionistas",
            "Los ilucionistas 2",
            "Perdida",
            "Culpable",
            "Hombre En Llamas",
            "Proyecto Geminis",
            "Red 2",
            "XXX"
    };

    private static final int Imagenes_Crimes[] = {
            R.drawable.asaltoalacasamoneda,
            R.drawable.clean,
            R.drawable.ilusionistas,
            R.drawable.ilusionistas2,
            R.drawable.perdida,
            R.drawable.culpable,
            R.drawable.hombreenllamas,
            R.drawable.proyectogeminis,
            R.drawable.red2,
            R.drawable.xxx
    };

    private static final String TITLES_SPORTS[] = {
            "Jugar en Casa",
            "Karate Kid",
            "Me Llaman Radio",
            "Novato",
            "Rush",
            "Escapa Del Undertaker",
            "Gladiator: El Desafío Comienza",
            "Mi Primera Lucha",
            "Triunfos Robados 3 Todo O Nada",
            "Dangal"
    };

    private static final int Imagenes_Sports[] = {
            R.drawable.jugarencasa,
            R.drawable.karatekid,
            R.drawable.mellamanradio,
            R.drawable.novato,
            R.drawable.rush,
            R.drawable.escapadelundertaker,
            R.drawable.gladiatoreldesafiocomienza,
            R.drawable.miprimeralucha,
            R.drawable.triunfosrobados3todoonada,
            R.drawable.dangal
    };

    private static final String TITLES_THRILLER[] = {
            "Malefico",
            "Orfanato",
            "Presencias del Mal",
            "Te veo",
            "Voces",
            "Cielo Rojo Sangre",
            "Escape Room: Sin Salida",
            "Jóvenes Brujas",
            "La noche Del Demonio 3",
            "Los Cuatro Jinetes Del Apocalipsis"
    };

    private static final int Imagenes_Thriller[] = {
            R.drawable.malefico,
            R.drawable.orfanato,
            R.drawable.presenciasdelmal,
            R.drawable.teveo,
            R.drawable.voces,
            R.drawable.cielorojosangre,
            R.drawable.escaperoomsinsalida,
            R.drawable.jovenesbrujas,
            R.drawable.lanochedeldemonio3,
            R.drawable.loscuatrojinetesdelapocalipsis
    };


    private static List<Movie> movieList;
    private static List<String> categoryList;
    private static long count = 0;

    static {
        setupMovies();
    }

    public static List<Movie> getMovieList() {
        return movieList;
    }

    public static List<String> getCategories() {
        return categoryList;
    }

    private static void setupMovies() {
        categoryList = Arrays.asList(MOVIE_CATEGORIES);

        movieList = new ArrayList<>();

//        for( int i = 0; i < MOVIE_CATEGORIES.length; ++i ) {
//            categoryList.add(MOVIE_CATEGORIES[i]);
//        }

        for (int index = 0; index < TITLES_FICTION.length; ++index) {
            movieList.add(buildMovieInfo(TITLES_FICTION[index], Imagenes_Fiction[index]));
        }
    }

    private static Movie buildMovieInfo(String title, int image) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setImage(image);
        return movie;
    }
}
