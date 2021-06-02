package com.example.ticket.service.impl;

import com.example.ticket.constant.ErrorResolverConstant;
import com.example.ticket.entity.Ticket;
import com.example.ticket.model.TicketRequest;
import com.example.ticket.model.TicketResponse;
import com.example.ticket.repository.TicketRepository;
import com.example.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * class to implement the business logic.
 *
 * @author Raul Gutierrez.
 */
@Service
public class TicketServiceImpl implements TicketService {

  /**
   * component to communication with the db.
   */
  @Autowired
  private TicketRepository ticketRepository;

  /**
   * component of error messages.
   */
  @Autowired
  private ErrorResolverConstant errorResolver;

  /**
   * {@inheritDoc}.
   */
  @Override
  public void createTicket(TicketRequest request) {
    Ticket ticket = ticketRepository.save(new Ticket(request));
    System.out.println(ticket);
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public TicketResponse findTicketById(Integer id) {
    Ticket ticket = ticketRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(
        errorResolver.getBusinessValidationFailed()));
    return new TicketResponse(ticket);
  }
}
