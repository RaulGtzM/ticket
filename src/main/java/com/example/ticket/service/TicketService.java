package com.example.ticket.service;

import com.example.ticket.model.TicketRequest;
import com.example.ticket.model.TicketResponse;

/**
 * Interface to do the contract.
 */
public interface TicketService {

  /**
   * This method is used to create a registry of the ticket.
   *
   * @param request of type TicketRequest.
   */
  void createTicket(TicketRequest request);

  /**
   * This method is used to find a registry.
   *
   * @param id of type Integer.l
   * @return an object of type ticketResponse.
   */
  TicketResponse findTicketById(Integer id);

}
