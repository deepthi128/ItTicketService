package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;

import com.ticketinfo.data.Ticket;
import com.ticketinfo.repo.TicketRepository;

import static org.junit.Assert.assertThat;

/*
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketApplicationTests {
		    
	@Autowired
    private TicketRepository repository;
	
	@Test
	public void validTicket() {
	    long id = 10001L;
	    Ticket found = repository.findById(id);
	  
	     assertThat(found.getId())
	      .isEqualTo(id);
	 }
}
*/