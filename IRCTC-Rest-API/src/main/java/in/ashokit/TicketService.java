
package in.ashokit;

import java.util.Collection;

import org.springframework.stereotype.Service;
@Service
public interface TicketService {
	public Ticket bookTicket(Passenger p);
	public Collection<Ticket> getAllTickets();
}
