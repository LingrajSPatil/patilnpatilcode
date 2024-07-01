package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketyService;

@RestController
@RequestMapping(value="/ticket")
public class TicketController {
	
	private TicketyService ticketyService;
	
	public TicketController(TicketyService ticketyService) {
		
		this.ticketyService = ticketyService;
	}


	@PostMapping(value="/create")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketyService.createTicket(ticket);
	}
	@GetMapping("/all")
	public List<Ticket> getAllTicket() {
		return ticketyService.getAllticket();
		
	}
	@GetMapping("/{tickedId}")
	public Ticket getSpecificTicket(@PathVariable("tickedId") Integer ticketId) {
		return ticketyService.getSpecificTicket(ticketId);
	}
	@PutMapping("/{ticketId}/{emailId}")
	public Ticket updateTicket(@PathVariable("ticketId") Ticket ticketId, @PathVariable("emailId") String emailId) {
		return ticketyService.updateTicket(ticketId,emailId);
	}
	@DeleteMapping
	public void deleteTicket(Ticket Id) {
		ticketyService.deleteTicket(Id);
	}
	
}
