package Domain;

// 1. Создается сущность MovieReview с конструктором и переопределяется метод toString
public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
}