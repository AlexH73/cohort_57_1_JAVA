package main_project.src.classes;

/**
 * Exception für ungültige Datumsbereiche.
 */
public class InvalidDateRangeException extends RuntimeException {
    /**
     * Standardkonstruktor.
     */
    public InvalidDateRangeException() {
        super("Der angegebene Datumsbereich ist ungültig.");
    }

    /**
     * Konstruktor mit benutzerdefiniertem Fehlertext.
     *
     * @param message Der benutzerdefinierte Fehlertext.
     */
    public InvalidDateRangeException(String message) {
        super(message);
    }

    /**
     * Konstruktor mit Fehlertext und der zugrunde liegenden Ursache.
     *
     * @param message Der Fehlertext.
     * @param cause   Die zugrunde liegende Ursache.
     */
    public InvalidDateRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Konstruktor mit der zugrunde liegenden Ursache.
     *
     * @param cause Die zugrunde liegende Ursache.
     */
    public InvalidDateRangeException(Throwable cause) {
        super(cause);
    }
}

