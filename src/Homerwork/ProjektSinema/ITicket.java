package Homerwork.ProjektSinema;

import java.util.List;

public interface ITicket {

    List<ITicket> getTickets();

    void addTicket(ITicket ticket);

    void removeTicket(ITicket ticket);
}
