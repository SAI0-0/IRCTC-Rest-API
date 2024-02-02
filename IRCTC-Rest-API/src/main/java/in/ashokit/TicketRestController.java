package in.ashokit;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TicketRestController {
	
	@Autowired
	public TicketService ticketService;
	
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p){
		Ticket ticket=ticketService.bookTicket(p);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	@GetMapping("/allTickets")
	public ResponseEntity<Collection<Ticket>> getTickets(){
		Collection<Ticket> allTickets=ticketService.getAllTickets();
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
		
	}
}

