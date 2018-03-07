package movies;

import util.Input;

import java.util.*;

public class MoviesApplication {
    private static ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(MoviesArray.findAll()));
    private static Input userInput = new Input();

    public static void main(String[] args) {
        do {
            menu();
            int userChoice = userInput.getInt(0, 7);
            switch (userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    getAll();
                    break;
                case 2:
                    getCat("animated");
                    break;
                case 3:
                    getCat("drama");
                    break;
                case 4:
                    getCat("horror");
                    break;
                case 5:
                    getCat("scifi");
                    break;
                case 6:
                    addMovie();
                    break;
                case 7:
                    movieSearch();
                    break;
                default:
                    System.out.println("Not a valid entry.");
                    break;
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("\n0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - animated");
        System.out.println("3 - drama");
        System.out.println("4 - horror");
        System.out.println("5 - sci-fi");
        System.out.println("6 - Add new movie");
        System.out.println("7 - Search for a movie");
        System.out.print("Enter your choice: \n");
    }

    public static void showMovie(Movie movie) {
        System.out.println(movie);
    }

    public static void getAll() {
        for (Movie movie : movies) {
            showMovie(movie);
        }
    }

    public static void getCat(String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                showMovie(movie);
            }
        }
    }

    public static void addMovie() {
        System.out.println("Enter the new movie name: ");
        String name = userInput.getString();
        System.out.println("Enter the movie's category: ");
        String category = userInput.getString().toLowerCase();

        movies.add(new Movie(name, category));
    }


    public static void movieSearch() {
        System.out.println("Enter the name of the movie you're looking for: ");
        String name = userInput.getString();
        Movie movie = new Movie(name);
        if (movies.contains(movie)) {
            System.out.println(movies.get(movies.indexOf(movie)));
        } else {
            System.out.println("Movie does not exist.");
        }
    }
}