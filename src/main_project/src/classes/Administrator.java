package main_project.src.classes;

import main_project.src.interfaces.*;


public class Administrator implements IAdministrator {

    @Override
    public IFilm createFilm(String name, int duration) {
        System.out.println("Film erstellt: " + name);
        return new Film(name, duration);
    }

    @Override
    public ISession createSession(IFilm film, ICinemaHall hall, String dateTime) {
        System.out.println("Session erstellt für Film: " + film);
        return new Session(film, hall, dateTime);
    }

    @Override
    public IProduct createProduct(String name, double price, String description, int stockQuantity) {
        System.out.println("Produkt erstellt: " + name);
        return new Product(name, price, description, stockQuantity);
    }

    @Override
    public void deleteFilm(IFilm film) {
        System.out.println("Film gelöscht: " + film);
    }

    @Override
    public void deleteSession(ISession session) {
        System.out.println("Session gelöscht: " + session);
    }

    @Override
    public void deleteProduct(IProduct product) {
        System.out.println("Produkt gelöscht: " + product);
    }

    @Override
    public String generateTicketSalesReport(String startDate, String endDate) {
        return "Ticket Sales Report vom " + startDate + " bis " + endDate;
    }

    @Override
    public String generateProductSalesReport(String startDate, String endDate) {
        return "Product Sales Report vom " + startDate + " bis " + endDate;
    }
}

