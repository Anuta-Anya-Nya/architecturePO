package Domain;

import Application.MovieApp;
// 8. модель содержит MovieApp и метод запуска
public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void Run(MovieSearchRequest userCommand)
    {
        movieApp.accept(userCommand);
    }
}
