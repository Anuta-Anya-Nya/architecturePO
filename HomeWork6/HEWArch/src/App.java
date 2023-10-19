import Adapters.ConsolePrinter;
import Adapters.MovieReviewsRepo;
import Adapters.UserCommand;
import Application.MovieUser;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;
import Ports.iPrintMovieReviews;
import Ports.iUserInput;

public class App {
    public static void main(String[] args) throws Exception {
        // для запуска
        // создается экземпляр адаптера репозитория с отзывами о фильмах, запускается
        // инициализация и создается тестовый список отзывов о фильмах
        iFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        // создание экземпляра адаптера распечатки в консоль
        iPrintMovieReviews printMovieReviews = new ConsolePrinter();
        // адаптер приема команды от пользователя, связывает 2 предыдущих адаптера,
        // создается movieApp и кладется в модель
        iUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);
        // сервис обработки команд от пользователя
        MovieUser movieUser = new MovieUser(userCommand);

        // создание 2 запросов
        MovieSearchRequest starWars = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreck = new MovieSearchRequest("StarTreck");
        // печать запроса
        System.out.println(starWars.getMovieName());
        // обрабатывает запрос, запускается логика поиска и печати
        movieUser.processInput(starWars);

        System.out.println(starTreck.getMovieName());
        movieUser.processInput(starTreck);
    }
}
