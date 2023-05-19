package main;

import controller.MovieController;
import database.Connector;
import model.MovieModel;
import view.MovieView;

public class Main {
    
    public static void main(String[] args) {
        MovieView view = new MovieView();
        MovieModel model = new MovieModel();
        MovieController controller = new MovieController(view, model);
    }
    
}
