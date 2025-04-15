package main_project.src.interfaces;

/**
 * Das Interface ITicket definiert die grundlegenden Operationen für ein Ticket im Kinoverwaltungssystem.
 */
public interface ITicket {

    /**
     * Gibt den zugehörigen Session zurück, für die das Ticket ausgestellt wurde.
     *
     * @return Die Session dieses Tickets.
     */
    ISession getSession();

    /**
     * Setzt die Session, für die das Ticket ausgestellt wird.
     *
     * @param session Die Session für das Ticket.
     */
    void setSession(ISession session);

    /**
     * Gibt die Sitzplatznummer dieses Tickets zurück.
     *
     * @return Die Sitzplatznummer.
     */
    int getSeatNumber();

    /**
     * Setzt die Sitzplatznummer für dieses Ticket.
     *
     * @param seatNumber Die neue Sitzplatznummer.
     */
    void setSeatNumber(int seatNumber);

    /**
     * Gibt den Preis dieses Tickets zurück.
     *
     * @return Der Preis des Tickets.
     */
    double getPrice();

    /**
     * Setzt den Preis für dieses Ticket.
     *
     * @param price Der neue Preis des Tickets.
     */
    void setPrice(double price);

    /**
     * Gibt den aktuellen Status des Tickets zurück (z. B. "Verfügbar" oder "Verkauft").
     *
     * @return Der Status des Tickets.
     */
    String getStatus();

    /**
     * Setzt den Status des Tickets (z. B. "Verfügbar", "Verkauft").
     *
     * @param status Der neue Status des Tickets.
     */
    void setStatus(String status);
}
