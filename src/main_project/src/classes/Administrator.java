package main_project.src.classes;



/*
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
        return new Produckt(name, price, description, stockQuantity);
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

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void setPassword(String password) {

    }
}

 */
import main_project.src.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Administrator implements IAdministrator {
    private List<IFilm> films;
    private List<ISession> sessions;
    private List<IProduct> products;

    public Administrator() {
        this.films = new ArrayList<>();
        this.sessions = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    @Override
    public ISession createSession(IFilm film, ICinemaHall hall, String dateTime) {
        ISession newSession = new Session(film, hall, dateTime); // Annahme: Klasse `Session` existiert
        sessions.add(newSession);
        return newSession;
    }

    @Override
    public IProduct createProduct(String name, double price, String description, int stockQuantity) {
        IProduct newProduct = new Product(name, price, description, stockQuantity); // Annahme: Klasse `Product` existiert
        products.add(newProduct);
        return newProduct;
    }

    @Override
    public void deleteFilm(IFilm film) {
        films.remove(film);
    }

    @Override
    public void deleteSession(ISession session) {
        sessions.remove(session);
    }

    @Override
    public void deleteProduct(IProduct product) {
        products.remove(product);
    }

    @Override
    public String generateTicketSalesReport(String startDate, String endDate) {
        // Beispielhafte Implementierung
        return "Ticket Sales Report from " + startDate + " to " + endDate + ": [Details folgen...]";
    }

    @Override
    public String generateProductSalesReport(String startDate, String endDate) {
        // Beispielhafte Implementierung
        return "Product Sales Report from " + startDate + " to " + endDate + ": [Details folgen...]";
    }

    @Override
    public IFilm createFilm(String name, int duration) {
        IFilm newFilm = new Film(name, duration); // Annahme: Klasse `Film` existiert
        films.add(newFilm);
        return newFilm;
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void setPassword(String password) {

    }
}


