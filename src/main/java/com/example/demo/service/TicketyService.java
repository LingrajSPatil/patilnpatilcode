package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.TicketDao;
import com.example.demo.model.Ticket;
@Service
public class TicketyService {
	
	private TicketDao ticketDao;

	public TicketyService(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}
	
	public List<Ticket> getAllticket() {
		
		return ticketDao.findAll();
	}
	public Ticket getSpecificTicket(Integer id) {
		return ticketDao.findById(id).orElse(new Ticket());
	}
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}
	public Ticket updateTicket(Ticket id, String email) {
		Ticket t = new Ticket();
		t.setEmail(id.getEmail());
		return ticketDao.save(t);
	}
	public void deleteTicket(Ticket id) {
		 ticketDao.delete(id);
		
	}

}
