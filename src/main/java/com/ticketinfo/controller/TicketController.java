package com.ticketinfo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketinfo.data.Ticket;
import com.ticketinfo.repo.TicketRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TicketController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TicketRepository ticketRepository;

	@GetMapping("/ticket")
	public List<Ticket> getAllEmployees() {
		// Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
		return ticketRepository.findAll();
	}

	@PostMapping("/ticket")
	public int createEmployee(@Valid @RequestBody Ticket ticket) {
		logger.debug("createEmployee" + ticket);
		return ticketRepository.insert(ticket);
	}

	@GetMapping(value = "/ticket/{id}")
	public Ticket getEmployeeById(@PathVariable("id") long id) {
		logger.debug("getEmployeeById" + id);

		return ticketRepository.findById(id);
	}

	@PutMapping(value = "/ticket/{id}")
	public int updateEmployee(@PathVariable("id") long id, @Valid @RequestBody Ticket ticket) {
		logger.debug("updateEmployee" + id + ticket);
		Ticket ticketData = ticketRepository.findById(id);
		ticketData.setName(ticket.getName());
		ticketData.setComments(ticket.getComments());
		ticketData.setSeverity(ticket.getSeverity());
		ticketData.setDescription(ticket.getDescription());
		ticketData.setAssignee(ticket.getAssignee());
		ticketData.setOwner(ticket.getOwner());

		return ticketRepository.update(ticketData);
	}

	@DeleteMapping(value = "/ticket/{id}")
	public int deleteEmployee(@PathVariable("id") long id) {
		logger.debug("deleteEmployee" + id);

		return ticketRepository.deleteById(id);
	}
}