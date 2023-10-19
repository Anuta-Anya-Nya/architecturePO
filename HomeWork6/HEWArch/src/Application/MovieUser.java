package Application;

import Domain.MovieSearchRequest;
import Ports.iUserInput;

// сервис обработки команды от пользователя
public class MovieUser {
    // содержит команду пользователя
    private iUserInput userInputDriverPort;

    public MovieUser(iUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    // обрабатывает запрос, создается экземпляр movieApp и он кладется в модель
    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
