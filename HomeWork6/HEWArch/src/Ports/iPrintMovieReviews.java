package Ports;

import java.util.List;

import Domain.MovieReview;
// 4. интерфейс с единственным методом печати отзыва о фильме
public interface iPrintMovieReviews {
    // на вход поступает список найденных отзывов и распечатывается
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
