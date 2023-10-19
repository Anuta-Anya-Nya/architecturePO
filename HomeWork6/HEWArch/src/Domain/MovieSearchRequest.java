package Domain;

// 2. Создается сущность запроса на поиск фильма с конструктором и геттером 
public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

    public String getMovieName() {
        return request;
    }
}
