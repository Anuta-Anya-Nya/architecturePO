package Ports;

import java.util.List;

import Domain.MovieReview;
import Domain.MovieSearchRequest;
// 3. получение отзыва о фильме
public interface iFetchMovieReviews {
    // на вход метод получает запрос на поиск фильма (сущность из domain) и возвращает список отзывов из репозитория комментариев
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
