package Homerwork.ProjektSinema;

import java.util.List;

public class Ticket implements ITicket {
    private List<ITicket> tickets;

    /**
     * Получить список всех билетов для этого сеанса.
     *
     * @return Список билетов для сеанса.
     */
    @Override
    public List<ITicket> getTickets() {
        return tickets;
    }

    /**
     * Добавить новый билет в список билетов сеанса.
     *
     * @param ticket Новый билет для добавления в сеанс.
     */
    @Override
    public void addTicket(ITicket ticket) {
    }

    /**
     * Удалить билет из списка билетов сеанса.
     *
     * @param ticket Билет для удаления из сеанса.
     */
    @Override
    public void removeTicket(ITicket ticket) {
    }

}
