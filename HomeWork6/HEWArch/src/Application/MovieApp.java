package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Domain.MovieReview;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;
import Ports.iPrintMovieReviews;

// сервис, содержит 2 адаптера и рандомайзер
public class MovieApp {

    private iFetchMovieReviews fetchMovieReviews;
    private iPrintMovieReviews printMovieReviews;
    private static Random rand = new Random();

    // при создании экземпляра связываются 2 внешних адаптера
    public MovieApp(iFetchMovieReviews fetchMovieReviews, iPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }
    // метод фильтрации отзывов
    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }
    // метод выдачи рандомного числа
    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    // метод, который запускает логику поиска отзывов, на вход получает запрос на
    // поиск
    public void accept(MovieSearchRequest movieSearchRequest) {
        //получение списка отзывов из репозитория в соответствии с запросом
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
        // рандомная фильтрация списка отзывов
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList));
        // распечатка отзывов
        printMovieReviews.writeMovieReviews(randomReviews);
    }
}
