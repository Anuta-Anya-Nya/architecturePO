package Adapters;

import java.util.List;

import Domain.MovieReview;
import Ports.iPrintMovieReviews;
// 6. адаптер распечатывающий отзывы в консоль, для подключения к шестигранницу имплементирует интерфейс iPrintMovieReviews (порт)
public class ConsolePrinter implements iPrintMovieReviews{

    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
    
}
