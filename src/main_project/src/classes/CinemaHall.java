package main_project.src.classes;

import main_project.src.interfaces.*;

public class CinemaHall implements ICinemaHall {
    private int hallNumber;       // Nummer der Halle
    private int capacity;         // Gesamtkapazität der Halle
    private String hallType;      // Typ der Halle (z. B. 2D, 3D, IMAX)
    private boolean isOccupied;   // Status, ob die Halle belegt ist
    private int availableSeats;   // Verfügbare Sitzplätze

    // Konstruktor
    public CinemaHall(int hallNumber, int capacity, String hallType) {
        this.hallNumber = hallNumber;
        this.capacity = capacity;
        this.hallType = hallType;
        this.isOccupied = false; // Standardmäßig ist die Halle frei
        this.availableSeats = capacity; // Alle Sitzplätze sind frei
    }

    /**
     * Получить номер кинозала.
     *
     * @return Номер кинозала.
     */
    // Getter und Setter für Hallennummer
    @Override
    public int getHallNumber() {
        return hallNumber;
    }

    /**
     * Установить новый номер кинозала.
     *
     * @param hallNumber Новый номер кинозала.
     */
    @Override
    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    /**
     * Получить вместимость кинозала.
     *
     * @return Вместимость кинозала.
     */
    @Override
    public int getCapacity() {
        return capacity;
    }

    /**
     * Установить новую вместимость кинозала.
     *
     * @param capacity Новая вместимость кинозала.
     */
    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
        this.availableSeats = capacity; // Aktualisiere verfügbare Sitzplätze
    }

    /**
     * Получить тип кинозала.
     *
     * @return Тип кинозала (например, 2D, 3D, IMAX).
     */
    public String getHallType() {
        return hallType;
    }

    /**
     * Установить новый тип кинозала.
     *
     * @param hallType Новый тип кинозала.
     */
    public void setHallType(String hallType) {
        this.hallType = hallType;
    }

    // Prüfen, ob die Halle frei ist
    public boolean isHallFree() {
        return !isOccupied;
    }

    // Setzen des Belegungsstatus der Halle
    public void setHallOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    // Prüfen, ob genügend Sitzplätze frei sind
    public boolean areSeatsAvailable(int requestedSeats) {
        return requestedSeats <= availableSeats;
    }

    // Sitzplätze reservieren
    public boolean reserveSeats(int requestedSeats) {
        if (areSeatsAvailable(requestedSeats)) {
            availableSeats -= requestedSeats; // Reduziere verfügbare Sitzplätze
            return true; // Reservierung erfolgreich
        } else {
            return false; // Nicht genügend Sitzplätze verfügbar
        }
    }

    // Freigabe der Sitzplätze (zum Beispiel nach einem Event)
    public void releaseSeats() {
        this.availableSeats = capacity; // Alle Sitzplätze wieder freigeben
    }

    // Überschreiben der toString-Methode für bessere Ausgabe
    @Override
    public String toString() {
        return "CinemaHall{" +
                "hallNumber=" + hallNumber +
                ", capacity=" + capacity +
                ", hallType='" + hallType + '\'' +
                ", isOccupied=" + isOccupied +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
