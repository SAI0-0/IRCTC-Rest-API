package in.ashokit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
@Service
public class TicketServiceImpl implements TicketService {
	
	Map <Integer, Ticket> map =new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger p) {
		
		Ticket t=new Ticket();
		Random r=new Random(10000);
		int id=r.nextInt();
		t.setTicketno(id);
		BeanUtils.copyProperties(p,t);
		t.setStatus("CONFIRMED");

		map.put(id,t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		return map.values();
	}

}
