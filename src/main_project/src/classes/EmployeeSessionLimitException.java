package main_project.src.classes;

/**
 * Exception für Fälle, in denen ein Mitarbeiter die maximale Anzahl von Sessions überschreitet.
 */
public class EmployeeSessionLimitException extends RuntimeException {
    /**
     * Standardkonstruktor.
     */
    public EmployeeSessionLimitException() {
        super("Der Mitarbeiter hat die maximale Anzahl von Sessions erreicht.");
    }

    /**
     * Konstruktor mit benutzerdefiniertem Fehlertext.
     *
     * @param message Der benutzerdefinierte Fehlertext.
     */
    public EmployeeSessionLimitException(String message) {
        super(message);
    }

    /**
     * Konstruktor mit Fehlertext und der zugrunde liegenden Ursache.
     *
     * @param message Der Fehlertext.
     * @param cause   Die zugrunde liegende Ursache.
     */
    public EmployeeSessionLimitException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Konstruktor mit der zugrunde liegenden Ursache.
     *
     * @param cause Die zugrunde liegende Ursache.
     */
    public EmployeeSessionLimitException(Throwable cause) {
        super(cause);
    }
}

