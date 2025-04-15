package main_project.src.interfaces;

/**
 * Das Interface ICinemaHall definiert die grundlegenden Operationen für einen Kinosaal.
 */
public interface ICinemaHall {

    /**
     * Gibt die Nummer des Kinosaals zurück.
     *
     * @return Die Nummer des Kinosaals.
     */
    int getHallNumber();

    /**
     * Setzt eine neue Nummer für den Kinosaal.
     *
     * @param hallNumber Die neue Nummer des Kinosaals.
     */
    void setHallNumber(int hallNumber);

    /**
     * Gibt die Kapazität des Kinosaals zurück.
     *
     * @return Die Gesamtkapazität des Kinosaals.
     */
    int getCapacity();

    /**
     * Setzt eine neue Kapazität für den Kinosaal.
     *
     * @param capacity Die neue Kapazität des Kinosaals.
     */
    void setCapacity(int capacity);

    /**
     * Gibt den Typ des Kinosaals zurück (z. B. 2D, 3D, IMAX).
     *
     * @return Der Typ des Kinosaals.
     */
    String getHallType();

    /**
     * Setzt einen neuen Typ für den Kinosaal.
     *
     * @param hallType Der neue Typ des Kinosaals.
     */
    void setHallType(String hallType);

    /**
     * Prüft, ob der Kinosaal verfügbar ist.
     *
     * @return `true`, wenn der Kinosaal verfügbar ist; ansonsten `false`.
     */
    boolean isHallFree();

    /**
     * Setzt den Belegungsstatus des Kinosaals.
     *
     * @param isOccupied Der neue Belegungsstatus (`true` = belegt, `false` = frei).
     */
    void setHallOccupied(boolean isOccupied);

    /**
     * Prüft, ob genügend Sitzplätze für die angeforderte Anzahl verfügbar sind.
     *
     * @param requestedSeats Die Anzahl der angeforderten Sitzplätze.
     * @return `true`, wenn genügend Sitzplätze verfügbar sind; ansonsten `false`.
     */
    boolean areSeatsAvailable(int requestedSeats);

    /**
     * Reserviert die angeforderten Sitzplätze, falls verfügbar.
     *
     * @param requestedSeats Die Anzahl der zu reservierenden Sitzplätze.
     * @return `true`, wenn die Reservierung erfolgreich war; ansonsten `false`.
     */
    boolean reserveSeats(int requestedSeats);

    /**
     * Gibt alle Sitzplätze frei, zum Beispiel nach einem Event.
     */
    void releaseSeats();
}

