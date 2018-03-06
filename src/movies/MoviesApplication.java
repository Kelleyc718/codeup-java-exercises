package movies;

import util.Input;

import java.util.*;

public class MoviesApplication {
    private static ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(MoviesArray.findAll()));
    private static Input userInput = new Input();

    public static void main(String[] args) {
        int userChoice;
        do {
            menu();
            userChoice = userInput.getInt();
            String category = menuChoice(userChoice);
            if (userChoice != 1 && userChoice != 6) {
                getCat(category);
            }
        } while (userChoice != 0);
        System.out.println("Have a good day.");
    }

    public static void menu() {
        System.out.println("\n0 - Exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - animated");
        System.out.println("3 - drama");
        System.out.println("4 - horror");
        System.out.println("5 - sci-fi");
        System.out.println("6 - add new movie");
        System.out.print("Enter your choice: \n");
    }

    public static String menuChoice(int userChoice) {
        switch (userChoice) {

            case 1:
                getAll();
                return "all";

            case 2:
                return "animated";

            case 3:
                return "drama";

            case 4:
                return "horror";

            case 5:
                return "scifi";

            case 6:
                addMovie();
                return "Adding movie";

            default:
                return "exit";

        }
    }

    public static void getAll() {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getCategory());
        }
    }

    public static void getCat(String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " - " + movie.getCategory() + "" + ".");
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
}