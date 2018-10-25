package com.ticketinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ticketinfo.data.Ticket;
import com.ticketinfo.repo.TicketRepository;

 
@SpringBootApplication
public class TicketMgmtApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TicketRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TicketMgmtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Ticket id 10001 -> {}", repository.findById(10001L));

		logger.info("Inserting -> {}", repository.insert(new Ticket(10040L, "name1", 3, "assignee1","owner1","Description1", "Comment1")));

		logger.info("Update 10003 -> {}", repository.update(new Ticket(10040L, "name2", 5, "assignee2","owner2","Description2", "Comment2")));

		repository.deleteById(10002L);

		logger.info("All users -> {}", repository.findAll());
	}
}
