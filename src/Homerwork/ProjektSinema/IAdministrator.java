package Homerwork.ProjektSinema;

import main_project.src.interfaces.ICinemaHall;
import main_project.src.interfaces.ISession;

/**
 * Интерфейс IAdministrator предоставляет контракт для класса, представляющего администратора в системе управления кинотеатром.
 */
public interface IAdministrator extends IUser {
    IFilm createFilm(String name, int duration);
    ISession createSession(IFilm film, ICinemaHall hall, String dateTime);

}
