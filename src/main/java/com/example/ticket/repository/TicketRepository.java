package com.example.ticket.repository;

import com.example.ticket.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Class to connect the data base.
 *
 * @author Raul Gutierrez.
 */
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
