package Adapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import Domain.MovieReview;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;

// 7. Адаптер базы данных (репозитория) отзывов фильмов
public class MovieReviewsRepo implements iFetchMovieReviews {
    // содержит словарь отзывов о фильмах
    private Map<String, List<MovieReview>> movieReviewMap;

    // при вызове конструктора вызывается метод initialize,
    // который создает пустой словарь и для примера кладет туда ключ (название
    // фильма)
    // и значение (создается сущность MovieReview)
    public MovieReviewsRepo() {
        initialize();
    }

    // переопределяется метод порта, где из созданного словаря выдергивается отзыв
    // по ключу - запросу или возвращается пустой список
    @Override
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {
        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck",
                Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }

}
