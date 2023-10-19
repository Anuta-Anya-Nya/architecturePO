package Adapters;

import Application.MovieApp;
import Domain.Model;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;
import Ports.iPrintMovieReviews;
import Ports.iUserInput;

// адаптер приема команды пользователя
public class UserCommand implements iUserInput {
    // содержит ссылку на модель
    private Model model;
// конструктор принимает 2 адаптера по поиску отзывов и распечатке, создается экземпляр movieApp и он кладется в модель
    public UserCommand(iFetchMovieReviews fetchMovieReviews, iPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }
// запускается movieApp.accept(userCommand) и стартует логика приложения по поиску и распечатке отзывов
    @Override
    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest) userCommand);
    }

}
