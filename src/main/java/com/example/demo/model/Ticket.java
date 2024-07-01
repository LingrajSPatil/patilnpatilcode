package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tbl_ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;
	@Column(name="pass_Name")
	private String passName;
	@Column(name="source_Stat")
	private String sourceStation;
	@Column(name ="dest_station")
	private String destStation;
	@Column(name="email_add")
	private String email;
	
	public Ticket() {
		
	}
	
	public Ticket(Integer ticketId, String passName, String sourceStation, String destStation,String email) {
		super();
		this.ticketId = ticketId;
		this.passName = passName;
		this.sourceStation = sourceStation;
		this.destStation = destStation;
		this.email=email;
	}
	

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassName() {
		return passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestStation() {
		return destStation;
	}

	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	
	

}
